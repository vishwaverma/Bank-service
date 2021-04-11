package com.pg.warrior.bank.service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {
	
	@Id
	@GeneratedValue
	private int bankId;
	private String bankCode;
	private String bankName;

}
