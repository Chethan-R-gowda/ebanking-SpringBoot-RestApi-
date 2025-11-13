package org.example.ebanking.repository;

import org.example.ebanking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

	public interface UserRepository extends JpaRepository<User, Long> {

		boolean existsByEmailOrMobile(String email, String mobile);

		boolean existsByEmail(String email);

		User findByEmail(String email);

}
