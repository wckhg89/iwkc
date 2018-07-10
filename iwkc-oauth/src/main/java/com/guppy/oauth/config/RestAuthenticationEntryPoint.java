package com.guppy.oauth.config;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by guppy.kang on 2018. 2. 12.
 * email : guppy.kang@kakaocorp.com
 */

@Component
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {
        response.setContentType("application/javascript");

        //response.sendRedirect("/api/exception/unauthorized");
        String callbackName = request.getParameter("callback");
        String errMsg = "{\"message\": \"Full authentication is required to access this resource\"}";

        response.setStatus(500);
        response.getWriter().write("/**/" +callbackName + "(" + errMsg + ")");
    }
}
