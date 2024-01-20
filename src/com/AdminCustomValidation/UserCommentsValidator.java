package com.AdminCustomValidator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UserCommentsValidator implements ConstraintValidator<UserComments, String>{

	
	@Override
	public void initialize(UserComments constraintAnnotation) {
	}
	
	@Override
	public boolean isValid(String comments, ConstraintValidatorContext context) {
		return comments != null && comments.length() >= 10; // For example, require at least 10 characters
	}

}
