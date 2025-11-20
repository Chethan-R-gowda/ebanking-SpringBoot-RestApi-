package org.example.ebanking.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BankTransactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentId;              // was payment_id – using camelCase in Java

    private Double amount;

    private String type;                   // e.g. "DEPOSIT", "DEBIT", "CREDIT"

    private LocalDateTime createdTime;

    private Double previousBalance;        // <--- NEW FIELD to match your constructor

    private Double balanceAfterTransaction;
}
