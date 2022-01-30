package com.billing.billing.repository;

import com.billing.billing.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface AccountRepository extends JpaRepository<Account, String> {
    // all CRUD Operations

}

