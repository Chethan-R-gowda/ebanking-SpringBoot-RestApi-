package org.example.ebanking.repository;


import java.util.List;

import org.example.ebanking.entity.SavingBankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingAccountRepository extends JpaRepository<SavingBankAccount, Long> {
	List<SavingBankAccount> findByActiveFalse();
}