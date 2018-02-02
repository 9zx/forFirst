package com.zx.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zx.Dao.UserDao;
import com.zx.Dao.UserDaoImpl;
import com.zx.vo.Customer;

/**
 * Servlet implementation class AddUserServlet
 */
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDao dao=ServiceFactory.getObject(UserDaoImpl.class);
		String mobile_Number=request.getParameter("mobile_Number");
		String roaming_Status=request.getParameter("roaming_Status");
		String com_Level=request.getParameter("com_Level");
		Integer customer_Id=((Customer)request.getSession().getAttribute("customer")).getCustomer_Id();
		dao.insertUser(mobile_Number, roaming_Status, com_Level, customer_Id);
		response.sendRedirect("saveInfo.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
