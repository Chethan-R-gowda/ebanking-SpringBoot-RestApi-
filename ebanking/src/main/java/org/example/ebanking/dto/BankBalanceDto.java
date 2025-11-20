package org.example.ebanking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BankBalanceDto {
	private Long accountNumber;
	private Double balance;
}