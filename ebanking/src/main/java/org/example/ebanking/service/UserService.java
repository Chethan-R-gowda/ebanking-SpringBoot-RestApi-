package org.example.ebanking.service;
import java.security.Principal;

import org.example.ebanking.dto.LoginDto;
import org.example.ebanking.dto.OtpDto;
import org.example.ebanking.dto.ResetPasswordDto;
import org.example.ebanking.dto.ResponseDto;
import org.example.ebanking.dto.SavingAccountDto;
import org.example.ebanking.dto.UserDto;
import org.springframework.http.ResponseEntity;
;

public interface UserService {

	ResponseEntity<ResponseDto> register(UserDto dto);

	ResponseEntity<ResponseDto> verifyOtp(OtpDto dto);

	ResponseEntity<ResponseDto> resendOtp(String email);

	ResponseEntity<ResponseDto> forgotPassword(String email);

	ResponseEntity<ResponseDto> resetPassword(ResetPasswordDto dto);

	ResponseEntity<ResponseDto> login(LoginDto dto);

	ResponseEntity<ResponseDto> viewSavingsAccount(Principal principal);

	ResponseEntity<ResponseDto> createSavingsAccount(Principal principal, SavingAccountDto accountDto);

}