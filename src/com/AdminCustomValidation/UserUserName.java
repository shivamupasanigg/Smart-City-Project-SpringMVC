package com.AdminCustomValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UserUsernamevalidator.class)
public @interface UserUserName {
	
	String message() default "*Invalid User Name";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
	
	

}
