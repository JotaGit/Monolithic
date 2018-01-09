package com.springmvc.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.springmvc")
public class ConfiguracaoWebMvc implements WebMvcConfigurer {

	@Override
	public Validator getValidator() {
		LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
		validator.setValidationMessageSource(validationMessageSource());
		return validator;
	}
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.viewResolver(viewResolver());
	}
	

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//<mvc:resources mapping="/resource/**" location="/resource/" />
        registry.addResourceHandler("/resource/**")
        .addResourceLocations("/resource/");
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		/*	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
				<property name="prefix" value="/resource/view/" />
				<property name="suffix" value=".jsp" />
			</bean>
		 */
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/resource/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}

	@Bean
	public MessageSource validationMessageSource() {
		ReloadableResourceBundleMessageSource messageResource = new ReloadableResourceBundleMessageSource();
		messageResource.setBasename("/WEB-INF/MensagensDeValidacao");
		return messageResource;
	}
	
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageResource = new ReloadableResourceBundleMessageSource();
		messageResource.setBasename("/WEB-INF/message");
		return messageResource;
	}
}
