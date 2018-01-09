package com.springmvc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

public class PasswordValidator implements ConstraintValidator<Password, String>  {

	@Override
	public void initialize(Password constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String field, ConstraintValidatorContext context) {
	       if(StringUtils.isEmpty(field)) {
	            // Message: password can not be empty
	            return false;
	        }

	        // match some password regex
	        if(field.matches("^(?=.*[A-Z].*[A-Z])(?=.*[!@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}$")) {
	            // Message: password should be bla bla
	            return false;
	        }

	        return true;
	}

	
}
