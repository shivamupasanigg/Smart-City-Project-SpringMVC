package com.AdminCustomValidator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UserUsernamevalidator implements ConstraintValidator<UserUserName,String>{

	@Override
	public void initialize(UserUserName constraintAnnotation) {
	}

	
	@Override
	public boolean isValid(String UserUserName, ConstraintValidatorContext context) {
		if (UserUserName == null || UserUserName.isEmpty()) {
			return false;
		}
		return UserUserName.matches("^[a-zA-Z0-9_]+$"); // only alphabet allowed
	}

}
