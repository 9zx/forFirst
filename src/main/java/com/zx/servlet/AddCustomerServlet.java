package com.zx.servlet;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zx.Dao.CustomerDao;
import com.zx.Dao.CustomerDaoImpl;
import com.zx.vo.Customer;

/**
 * Servlet implementation class AddCustomerServlet
 */
public class AddCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CustomerDao dao=ServiceFactory.getObject(CustomerDaoImpl.class);
		Customer customer=new Customer();
		String id_Type=request.getParameter("id_Type");
		String id_Number=request.getParameter("id_Number");
		if(request.getParameter("flag").equals("1")){
			
			if(dao.getCustomer(id_Type, id_Number)==null){
				customer.setId_Type(id_Type);
				customer.setId_Number(id_Number);
				dao.insertCustomer(id_Type, id_Number);
			}else{
				customer=dao.getCustomer(id_Type, id_Number);
			}
			request.getSession().setAttribute("customer", customer);
			response.sendRedirect("newCustomer1.jsp");
		}else{
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String customer_BirtyDay=request.getParameter("customer_BirtyDay");
		    Date date=Date.valueOf(customer_BirtyDay);
//			try {
//				date = (Date) sdf.parse(customer_BirtyDay);
//			} catch (ParseException e) {
//				System.out.println("时间类型转换出错");
//				e.printStackTrace();
//			}
//			customer.setId_Type(id_Type);
//			customer.setId_Number(id_Number);
			customer.setCustomer_Name(request.getParameter("customer_Name"));
			customer.setCustomer_BirtyDay(date);
			customer.setCustomer_Sex(request.getParameter("customer_Sex"));
			customer.setCustomer_Add(request.getParameter("customer_Add"));
			dao.updateCustomer(customer.getCustomer_Name(),customer.getCustomer_BirtyDay(), customer.getCustomer_Sex(), customer.getCustomer_Add());
			response.sendRedirect("newUser.jsp");
		}
	}

}
