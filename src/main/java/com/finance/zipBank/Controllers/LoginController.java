package com.finance.zipBank.Controllers;

import com.finance.zipBank.Models.User;
import com.finance.zipBank.Models.authentication.AuthenticationRequest;
import com.finance.zipBank.Models.authentication.AuthenticationResponse;
import com.finance.zipBank.Repositories.UserRepo;
import com.finance.zipBank.Service.userDetails.MyUserDetailsService;
import com.finance.zipBank.utility.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @Autowired
    private UserRepo userRepo;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthentication(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e){
            throw new Exception("Incorrect username or password", e);
        }
        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());

        final String jwt = jwtTokenUtil.generateToken(userDetails);

        //setting user last login
        User user = userRepo.findByUsername(authenticationRequest.getUsername());
        user.setLastLogin(new Date());
        userRepo.save(user);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
