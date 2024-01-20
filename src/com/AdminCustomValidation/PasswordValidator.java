package com.AdminCustomValidator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<Password, String> {

	@Override
	public void initialize(Password constraintAnnotation) {
	}

	@Override
	public boolean isValid(String password, ConstraintValidatorContext context) {

		if (password == null || password.isEmpty()) {
			return false;
		}
		return password.length() >=4;
		
		
	}
}
