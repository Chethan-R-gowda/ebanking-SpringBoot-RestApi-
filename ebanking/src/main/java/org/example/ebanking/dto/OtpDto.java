package org.example.ebanking.dto;

import lombok.Data;

@Data
public class OtpDto {
	private String email;
	private int otp;
}