package com.AdminCustomValidator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UserFullNameValidation implements ConstraintValidator<UserFullName,String>{

	@Override
	public void initialize(UserFullName constraintAnnotation) {
	}

	
	@Override
	public boolean isValid(String fullname, ConstraintValidatorContext context) {
		if (fullname == null || fullname.isEmpty()) {
			return false;
		}
		return fullname != null && fullname.length() >= 15;
	}

}
