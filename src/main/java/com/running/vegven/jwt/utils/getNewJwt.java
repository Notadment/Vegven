//package com.running.vegven.jwt.utils;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import com.running.vegven.jwt.aop.JwtAop;
//import com.running.vegven.jwt.pojo.JwtClasses;
//
//import jakarta.servlet.http.HttpServletRequest;
//
//public class getNewJwt {
//	public static String takeNewJwt(HttpServletRequest req) {
//		
//		// 取出前1個 解析後JWT 中的資訊
//		JwtClasses userInfomations = JwtParseClaim.jwtClasses(req);
//		Integer userId = userInfomations.getUserid();
//		String account = userInfomations.getAccount();
//		String password = userInfomations.getPassword();
//		
//		//自定義的訊息
//		Map<String, Object> claims = new HashMap<String, Object>();
//		claims.put("userid", userId);
//		claims.put("account", account);
//		claims.put("password", password);
//		
//		//使用JWT，生成令牌
//        // generateJwt() 參數要放入自訂義的訊息
//		String jwtClaim = JwtUtil.generateJwt(claims);
//		
//		System.out.println("成功拿到令牌，令牌是:" + jwtClaim);
//		return jwtClaim;
//	}
//}
