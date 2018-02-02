package com.zx.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zx.Dao.ChargeDao;
import com.zx.Dao.ChargeDaoImpl;

/**
 * Servlet implementation class SaveChargeServlet
 */
public class SaveChargeOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveChargeOneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ChargeDao dao=ServiceFactory.getObject(ChargeDaoImpl.class);
		String charge_Code=request.getParameter("charge_Code");
//		String charge_Name="";
//		switch(charge_Code){
//			case "A":charge_Name="开户费";break;
//			case "B":charge_Name="漫游费";break;
//			case "C":charge_Name="押金";break;
//			case "D":charge_Name="入网费";break;
//			case "E":charge_Name="选号费";break;
//		}
		System.out.println(charge_Code+"  "+Float.valueOf(request.getParameter("charge")));
		System.out.println(Float.valueOf(request.getParameter("charge")));
		dao.updateChargeOne(charge_Code, Float.valueOf(request.getParameter("charge")));
		System.out.println("1111111111111111111111111");
		response.getWriter().append("提交成功lll！");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
