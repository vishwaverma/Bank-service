package com.pg.warrior.bank.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pg.warrior.bank.service.entity.Bank;
import com.pg.warrior.bank.service.repo.BankRepository;

@Service
public class BankService {
	
	@Autowired
	private BankRepository bankRepository;

	public List<Bank> saveBank(List<Bank> bank) {
		return bankRepository.saveAll(bank);
	}

	public Bank getBankDetails(String bankCode) {
		return bankRepository.findByBankCode(bankCode);
	}

}
