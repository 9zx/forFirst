package com.zx.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.jdbc.util.ServiceFactory;
import com.zx.Dao.MobileDao;
import com.zx.Dao.MobileDaoImpl;

/**
 * Servlet implementation class AddUserMobile
 */
public class AddUserMobile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserMobile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("mobile_Number"));
//		System.out.println(request.getParameter("a"));
		MobileDao dao=ServiceFactory.getObject(MobileDaoImpl.class);
		List<Object[]> number=dao.getMobileNumberByLike(request.getParameter("mobile_Number"));
//		System.out.println(number);
		if(number.size()>0){
			String[] mobiles=new String[number.size()];
			int i=0;
			for(Object[] obj:number){
				String str=obj[0].toString();
				mobiles[i]=str;
				i++;
			}
		
			System.out.println(Arrays.toString(mobiles));
//		String[] number={"1","2"};
			ObjectMapper mapper=new ObjectMapper(); 
			String mobile=mapper.writeValueAsString(mobiles);
			response.getWriter().append(mobile);
		}
//		}else{
//			response.getWriter().append("");
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
