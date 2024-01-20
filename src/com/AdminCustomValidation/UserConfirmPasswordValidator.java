package com.AdminCustomValidator;

import com.jpa.UserRegister;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UserConfirmPasswordValidator implements ConstraintValidator<UserConfirmPassword,String>{

	@Override
	public void initialize(UserConfirmPassword constraintAnnotation) {
	}

	@Override
	public boolean isValid(String confirmpassword, ConstraintValidatorContext context) {
		if (confirmpassword == null || confirmpassword.isEmpty()) {
			return false;
		}
		return confirmpassword.length() >=7;
		
	}

}
