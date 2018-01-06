package com.springmvc.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class Utils {
	
	static MessageSource messageSource;
	
	public Utils(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public static String getMessage(String code) {
		
		return messageSource.getMessage(code, null, LocaleContextHolder.getLocale());
	}

	public static String getMessage(String code, String... args) {
		
		return messageSource.getMessage(code, args, LocaleContextHolder.getLocale());
	}
	
}
