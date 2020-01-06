package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.Bill;
import org.springframework.data.repository.CrudRepository;

public interface BillRepository extends CrudRepository<Bill, Long> {


    Iterable<Bill> findBillsByUserId(Long id);
}
