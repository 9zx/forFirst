package com.zx.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zx.vo.Operator;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {

    List<String> list=new ArrayList<String>();
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
//		if(!req.getServletPath().contains(".jsp")||req.getServletPath().contains(".jpg")||req.getServletPath().contains(".gif")
//				||req.getServletPath().contains(".db")){
		if(!req.getServletPath().contains(".jsp")&&!req.getServletPath().contains(".do")){
			chain.doFilter(request, response);
			System.out.println(1);
		}else{
			if (list.contains(req.getServletPath())) {
				chain.doFilter(request, response);
				System.out.println(2);
			}else{
				Operator operator=(Operator) req.getSession().getAttribute("operator");
				System.out.println(operator);
				if(operator==null){
					res.sendRedirect(req.getContextPath()+"/index.jsp");
				}else{
					chain.doFilter(request, response);
				}
			}
		}
	}
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		list.add("/index.jsp");
		list.add("/login.do");
	
	}
}
