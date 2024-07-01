//package com.running.vegven.jwt.interceptor;
//
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONPObject;
//import com.running.vegven.jwt.utils.JwtUtil;
//
//import jakarta.servlet.http.Cookie;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//@Component
//public class LoginInterceptor implements HandlerInterceptor{
//	@Override
//	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception{
//		System.out.println("拿到這些資料:"+req + res + handler);
//		
//		// 獲取請求url
//		String url = req.getRequestURL().toString();
//		System.out.println("攔截器拿到了這個網址:"+ url);
//		
//		// 判斷請求url 中是否包含login，如果包含說明是登入操作，直接放行
//		if(url.contains("login")) {
//			System.out.println("這是一個登入說明");
//			return true;
//		}
//		
//		String jwt = null;
//		Cookie settingCookie = null;
//		// 透過Request拿取cookie內的jwt
//		Cookie[] mapInCookie = req.getCookies();
//		if(mapInCookie != null) {
//			for(int i =0; i<mapInCookie.length; i++){
//				if(mapInCookie[i].getName().equals("ZXCzxc123!@#")) {
//					jwt = mapInCookie[i].getValue();
//					
//					settingCookie = mapInCookie[i];
//				}
//			}
//		}
//		// 判斷令牌是否存在，如果不存在，返回錯誤结果（未登入）
//		if(!StringUtils.hasLength(jwt)) {
//			String errorRes = "沒有JWT令牌";
//			String jsonRes = JSON.toJSONString(errorRes);
//			
//			res.getWriter().write(jsonRes);
//			res.sendRedirect("/login");
//			return false;
//		}
//		// 解析token，如果解析失敗，返回錯誤结果（未登入）
//		try {
//			JwtUtil.parseJwt(jwt);
//			System.out.println("拿到解析後的token，存在於攔截器中 : " + JwtUtil.parseJwt(jwt));
//			String parseJWT = JwtUtil.parseJwt(jwt).get("account", String.class);
//			
//		}catch(Exception e){
//			String errorRes = "JWT令牌解析發生錯誤";
//			String jsonRes = JSON.toJSONString(errorRes);
//			res.setContentType("application/json;charset=utf-8");
//			res.getWriter().write(jsonRes);
//			res.sendRedirect("/login");
//			return false;
//		}
//		return true;
//	}
//	
//		//目标资源方法执行后执行
//		@Override
//		public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
//				ModelAndView modelAndView) throws Exception {
//			 System.out.println("postHandle ......Interceptor放行後邏輯");
//			 
//			 
//			 
//			 
//			 //	request.getRequestDispatcher("/explorepage").forward(request,response);
//			 
//			 
//		}
//
//		
//		//视图渲染完毕后執行，最後執行
//		@Override
//		public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
//				throws Exception {
//			System.out.println("afterCompletion ...................................... ");
//			
//			
//			
//			
//			
//		}
//}
