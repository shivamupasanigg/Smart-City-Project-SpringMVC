package com.AdminCustomValidator;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.*;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordValidator.class)
public @interface Password {
	String message() default "*Invalid Password";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
