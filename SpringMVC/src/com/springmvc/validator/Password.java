package com.springmvc.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.hibernate.validator.constraints.NotBlank;

@Constraint(validatedBy=PasswordValidator.class)
@Documented
@Retention(RUNTIME)
@Target(FIELD)
@NotBlank
public @interface Password {
	
    String message() default "{Annotation.Password.InvalidPassword}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
