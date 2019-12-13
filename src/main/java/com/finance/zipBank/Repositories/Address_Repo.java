package com.finance.zipBank.Repositories;


import com.finance.zipBank.Models.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Address_Repo extends CrudRepository<Address, Long> {
}
