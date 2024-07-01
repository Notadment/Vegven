//package com.running.vegven.jwt.utils;
//
//import com.running.vegven.jwt.pojo.JwtClasses;
//
//import jakarta.servlet.http.Cookie;
//import jakarta.servlet.http.HttpServletRequest;
//
//public class JwtParseClaim {
//	public static JwtClasses jwtClasses(HttpServletRequest req) {
//		String jwt = null;
//		Cookie[] mapCookies = req.getCookies();
//		
//		for(int i = 0; i<mapCookies.length; i++) {
//			if(mapCookies[i].getName().equals(mapCookies)) {
//				jwt = mapCookies[i].getValue();
//			}
//		}
//		JwtUtil.parseJwt(jwt);
//		Integer userId = JwtUtil.parseJwt(jwt).get("userid", Integer.class);
//		String account = JwtUtil.parseJwt(jwt).get("account", String.class);
//		String password = JwtUtil.parseJwt(jwt).get("password", String.class);
//		JwtClasses getInformation = new JwtClasses();
//		getInformation.setUserid(userId);
//		getInformation.setAccount(account);
//		getInformation.setPassword(password);
//		return getInformation;
//	}
//}
