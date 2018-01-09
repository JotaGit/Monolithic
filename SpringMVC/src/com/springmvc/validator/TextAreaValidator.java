package com.springmvc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

@Component
public class TextAreaValidator implements ConstraintValidator<TextArea, String> {

	@Override
	public void initialize(TextArea arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String valorDoCampo, ConstraintValidatorContext arg1) {
		if("1".equals(valorDoCampo)) {
			return false;
		}
		return true;
	}

}
