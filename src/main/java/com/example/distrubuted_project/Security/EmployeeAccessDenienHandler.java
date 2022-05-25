package com.example.distrubuted_project.Security;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class EmployeeAccessDenienHandler implements AccessDeniedHandler {
    public static final Logger LOG
            = Logger.getLogger(String.valueOf(EmployeeAccessDenienHandler.class));

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e) throws IOException, ServletException {

            Authentication auth
                    = SecurityContextHolder.getContext().getAuthentication();
            if (auth != null) {
                LOG.warning("User: " + auth.getName()
                        + " attempted to access the protected URL: "
                        + request.getRequestURI());
            }

            response.sendRedirect(request.getContextPath() + "/access-denied");
        }
    }


