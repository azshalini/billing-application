package com.billing.billing.controller;

import com.billing.billing.model.Account;
import com.billing.billing.repository.AccountRepository;
import com.billing.billing.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/vi/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("")
    public List<Account> getAllAccounts(){
        return accountService.listAllAccounts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable String id){
        try {
            Account acct = accountService.getAccount(id);
            return new ResponseEntity<Account>(acct, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
        }
    }


}
