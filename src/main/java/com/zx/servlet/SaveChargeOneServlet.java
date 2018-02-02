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
//			case "A":charge_Name="������";break;
//			case "B":charge_Name="���η�";break;
//			case "C":charge_Name="Ѻ��";break;
//			case "D":charge_Name="������";break;
//			case "E":charge_Name="ѡ�ŷ�";break;
//		}
		System.out.println(charge_Code+"  "+Float.valueOf(request.getParameter("charge")));
		System.out.println(Float.valueOf(request.getParameter("charge")));
		dao.updateChargeOne(charge_Code, Float.valueOf(request.getParameter("charge")));
		System.out.println("1111111111111111111111111");
		response.getWriter().append("�ύ�ɹ�lll��");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
