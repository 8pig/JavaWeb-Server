package com.zhou.web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class CharchateFilter implements Filter {

    @Override
    public void init(FilterConfig config) throws ServletException {

    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String method = request.getMethod();
        if (method.equalsIgnoreCase("post")) {
            request.setCharacterEncoding("utf-8");
        }
        response.setContentType("text/html;charset=utf-8");
        chain.doFilter(request, response);

    }
    public void destroy() {
    }
}
