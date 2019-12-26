package com.finance.zipBank.Service;

import com.finance.zipBank.Models.Bill;
import com.finance.zipBank.Repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class BillService {


    @Autowired
    BillRepository billRepository;

    public Bill getBill(Long id){
        return billRepository.findById(id).get();
    }

    public Iterable<Bill>getAllBills(){
        return billRepository.findAll();
    }
    public Bill addBill(Bill bill){
        return billRepository.save(bill);
    }

    public Boolean removeBill(Long id){
       billRepository.deleteById(id);
       return true;
    }
    public Iterable<Bill>getBillsByUserId(Long id){
        return billRepository.findBillsByUserId(id);
    }
}
