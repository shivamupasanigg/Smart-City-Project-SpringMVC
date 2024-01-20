package com.AdminCustomValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UserConfirmPasswordValidator.class)
public @interface UserConfirmPassword {
	
	String message() default "*Invalid Confirm Password";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
	
	

}
