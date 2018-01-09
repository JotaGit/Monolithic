package com.springmvc.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.hibernate.validator.constraints.NotBlank;

@Constraint(validatedBy=TextAreaValidator.class)
@Documented
@Retention(RUNTIME)
@Target(FIELD)
@NotBlank
public @interface TextArea {

    String message() default "{Annotation.TextArea.InvalidTextArea}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
	
}
