package com.billing.billing;

import com.billing.billing.model.Account;
import com.billing.billing.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class BillingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BillingApplication.class, args);
	}

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public void run(String... args) throws Exception {
//		Account acct = new Account();
//		acct.setDescription("Hotel Dummy");
//		//acct.setEntityId("0123456789");
//		acct.setStartDate(new Date());
//		acct.setEndDate(new Date());
//		acct.setActiveSwitch(true);
//		accountRepository.save(acct);
	}

}
