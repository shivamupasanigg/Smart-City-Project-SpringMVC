package com.AdminCustomValidator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UserPasswordValidator implements ConstraintValidator<UserPassword, String> {

	@Override
	public void initialize(UserPassword constraintAnnotation) {
	}

	@Override
	public boolean isValid(String userpassword, ConstraintValidatorContext context) {

		if (userpassword == null || userpassword.isEmpty()) {
			return false;
		}
		return userpassword.length() >=7;
		
		
	}
}
