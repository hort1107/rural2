package kr.ac.kopo.rural.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import kr.ac.kopo.rural.model.Member;

public class UserInterceptor extends HandlerInterceptorAdapter {

   @Override
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
      
      HttpSession session = request.getSession();
      
      if(session != null) {
         Member member = (Member) session.getAttribute("member");
         
         if(member != null) {
            return true;
         }
      }
      response.sendRedirect("/login");
      return false;
   }

}