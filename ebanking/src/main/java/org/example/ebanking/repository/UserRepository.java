package org.example.ebanking.repository;

import java.util.List;
import java.util.Optional;

import org.example.ebanking.dto.BankingRole;
import org.example.ebanking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

	public interface UserRepository extends JpaRepository<User, Long> {

		boolean existsByEmailOrMobile(String email, String mobile);

		boolean existsByEmail(String email);

		User findByEmail(String email);
		Optional<User> findByBankAccount_accountNumber(Long accountNumber);
		

		List<User> findByRole(BankingRole user);

}
