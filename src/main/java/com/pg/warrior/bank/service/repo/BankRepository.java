package com.pg.warrior.bank.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pg.warrior.bank.service.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer> {

	Bank findByBankCode(String bankCode);

}
