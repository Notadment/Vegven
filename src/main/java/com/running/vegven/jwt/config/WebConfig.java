//package com.running.vegven.jwt.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//
//import com.running.vegven.jwt.interceptor.LoginInterceptor;
//
//@Configuration
//public class WebConfig {
//	@Autowired
//	private LoginInterceptor interceptor;
//	
//	public void addInterceptor(InterceptorRegistry registry) {
//		registry.addInterceptor(interceptor)
//				.addPathPatterns("/*")
//				.excludePathPatterns("/regester")
//				.excludePathPatterns("/login")
//				.excludePathPatterns("/main");
//				
//	}
//}
