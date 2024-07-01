//package com.running.vegven.jwt.utils;
//
//import java.util.Date;
//import java.util.Map;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//// JWT 產生器
//public class JwtUtil {
//	
//	/**
//     * 生成JWT令牌
//     * @param claims JWT第二部分 payload 中儲存的内容
//     * @return
//     */
//	private static final String headerKey = "ZXCzxc123!@#"; //簽名密鑰
//	private static Long expire = 86400L * 1000L; //有效時間
//	
//	public static String generateJwt(Map<String, Object> claims){
//        String jwt = Jwts.builder()
//                .addClaims(claims)//自定義信息（有效載荷）
//                .signWith(SignatureAlgorithm.HS256, headerKey)//簽名算法（頭部）
//                .setExpiration(new Date(System.currentTimeMillis() + expire))//過期的時間
//                .compact();
//        
//        return jwt;
//    }
//	
//	/**
//	 *  解析JWT令牌
//	 */
//	public static Claims parseJwt(String jwt) {
//		Claims claims = Jwts.parser()
//				.setSigningKey(headerKey)
//				.parseClaimsJws(jwt)
//				.getBody();
//		return claims;
//	}
//}
