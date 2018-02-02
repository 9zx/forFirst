package com.zx.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zx.Dao.OperatorDao;
import com.zx.Dao.OperatorDaoImpl;
import com.zx.vo.Operator;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OperatorDao dao=ServiceFactory.getObject(OperatorDaoImpl.class);
		Operator operator=dao.getOperator(Integer.valueOf(request.getParameter("operator_id")), request.getParameter("operator_pwd"));
		System.out.println(request.getParameter("operator_id")+"  "+ request.getParameter("operator_pwd"));
		System.out.println(operator);
		if(operator!=null){
			request.getSession().setAttribute("operator", operator);
			response.sendRedirect("main.jsp");
		}else{
			response.sendRedirect("index.jsp");
		}
	}

}
