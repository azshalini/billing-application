package com.billing.billing.services;

import com.billing.billing.exception.ResourceNotFoundException;
import com.billing.billing.model.Account;
import com.billing.billing.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> listAllAccounts(){
        return accountRepository.findAll();
    }

    public void saveAccount(Account acct){
        accountRepository.save(acct);
    }

    public Account getAccount(String acctId){
        Optional<Account> acctOpt = accountRepository.findById(acctId);
        return acctOpt.orElseThrow(() -> new ResourceNotFoundException("Account not found!!! "));
    }

    public void deleteAccount(String acctId){
        accountRepository.deleteById(acctId);
    }
}
