package org.example.ebanking.service;
import org.example.ebanking.dto.UserDto;
import org.example.ebanking.entity.TempUser;
import org.springframework.http.ResponseEntity;

public interface UserService {

	ResponseEntity<TempUser> register(UserDto dto);

	ResponseEntity<TempUser> fetch(String email);

}