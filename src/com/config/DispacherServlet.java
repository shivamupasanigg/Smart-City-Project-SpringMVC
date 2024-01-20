package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import jakarta.servlet.ServletRegistration;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.MultipartConfigElement;

public class DispacherServlet extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] classes = {config.class};
		return classes;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
	
	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {

		// Optionally also set maxFileSize, maxRequestSize, fileSizeThreshold
		registration.setMultipartConfig(new MultipartConfigElement("D:\\AD_JAVA\\SmartCityProjectSpringMVC\\webapp\\WEB-INF\\images", 2097152, 4194304, 0));
	}


}
