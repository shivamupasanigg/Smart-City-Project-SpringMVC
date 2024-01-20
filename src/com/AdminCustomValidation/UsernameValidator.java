package com.AdminCustomValidator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UsernameValidator implements ConstraintValidator<Username, String> {

	@Override
	public void initialize(Username constraintAnnotation) {
	}

	@Override
	public boolean isValid(String Username, ConstraintValidatorContext context) {

		if (Username == null || Username.isEmpty()) {
			return false;
		}
		return Username.matches("^[a-zA-Z0-9_]+$"); // only alphabet allowed
	}

}
