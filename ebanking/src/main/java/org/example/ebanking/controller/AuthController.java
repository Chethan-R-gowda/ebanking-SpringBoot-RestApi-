package org.example.ebanking.controller;


import org.example.ebanking.dto.LoginDto;
import org.example.ebanking.dto.OtpDto;
import org.example.ebanking.dto.ResetPasswordDto;
import org.example.ebanking.dto.ResponseDto;
import org.example.ebanking.dto.UserDto;
import org.example.ebanking.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

	private final UserService userService;

	@PostMapping("/register")
	public ResponseEntity<ResponseDto> register(@RequestBody @Valid UserDto dto) {
		return userService.register(dto);
	}

	@PostMapping("/verify-otp")
	public ResponseEntity<ResponseDto> verfiyOtp(@RequestBody OtpDto dto) {
		return userService.verifyOtp(dto);
	}

	@PatchMapping("/resend-otp/{email}")
	public ResponseEntity<ResponseDto> resendOtp(@PathVariable String email) {
		return userService.resendOtp(email);
	}

	@PatchMapping("/forgot-password/{email}")
	public ResponseEntity<ResponseDto> forgotPassword(@PathVariable String email) {
		return userService.forgotPassword(email);
	}

	@PatchMapping("/reset-password")
	public ResponseEntity<ResponseDto> resetPassword(@RequestBody @Valid ResetPasswordDto dto) {
		return userService.resetPassword(dto);
	}

	@PostMapping("/login")
	public ResponseEntity<ResponseDto> login(@RequestBody @Valid LoginDto dto) {
		return userService.login(dto);
	}

}
