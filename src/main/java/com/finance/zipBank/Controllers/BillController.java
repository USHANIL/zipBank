package com.finance.zipBank.Controllers;

import com.finance.zipBank.Models.Bill;
import com.finance.zipBank.Service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin()
public class BillController {


    @Autowired
    BillService billService;

    @GetMapping("API/bills/{id}")
    public ResponseEntity<Bill>getBillById(@PathVariable Long id){
        return new ResponseEntity<>(billService.getBill(id),HttpStatus.OK);
    }

    @PostMapping("API/bills/create_bill")
    public ResponseEntity<Bill>addBill(@RequestBody Bill bill){
        return new ResponseEntity<>(billService.addBill(bill),HttpStatus.OK);
    }
    @GetMapping("API/bills/all_bills")
    public ResponseEntity<Iterable<Bill>>getAllBills(){
        return new ResponseEntity<>(billService.getAllBills(), HttpStatus.OK);
    }
    @GetMapping("API/bills/user/{userId}")
    public ResponseEntity<Iterable<Bill>>getBillsByUserId(@PathVariable Long userId){
        return new ResponseEntity<>(billService.getBillsByUserId(userId),HttpStatus.OK);
    }
    @DeleteMapping("API/bills/delete/{id}")
    public ResponseEntity<Bill>removeBill(@PathVariable Long id){
        billService.removeBill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("API/bills/update")
    public ResponseEntity<Bill>updateBill(@RequestBody Bill bill){
        return new ResponseEntity<>(billService.updateBill(bill),HttpStatus.OK);
    }

}
