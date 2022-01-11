package org.pfe.security;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
@Component
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException {
	MyUserDetails userDetails= (MyUserDetails) authentication.getPrincipal();
	String redirectUrl=request.getContextPath();
	if(userDetails.hasRole("ADMIN")) {
		
		redirectUrl+="admin_home_page";
		
	}
	else if(userDetails.hasRole("PROFESSEUR")) {
		redirectUrl+="/cours";
	}
	
	response.sendRedirect(redirectUrl);
	}
	

}
