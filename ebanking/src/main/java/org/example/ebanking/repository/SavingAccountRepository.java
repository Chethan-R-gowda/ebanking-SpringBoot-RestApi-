package org.example.ebanking.repository;


import org.example.ebanking.entity.SavingBankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingAccountRepository extends JpaRepository<SavingBankAccount, Long> {

}