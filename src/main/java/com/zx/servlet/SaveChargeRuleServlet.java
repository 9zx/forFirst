package com.zx.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jdbc.util.ServiceFactory;
import com.zx.Dao.ChargeRuleDao;
import com.zx.Dao.ChargeRuleDaoImpl;
import com.zx.service.ChargeRuleService;
import com.zx.service.ChargeRuleServiceImpl;

/**
 * Servlet implementation class SaveChargeRuleServlet
 */
public class SaveChargeRuleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveChargeRuleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] charge_Code=request.getParameterValues("charge_Code[]");  //json前端传数组自动包装成name[],后台接收要加个[]	

		System.out.println(Arrays.toString(charge_Code));
		ChargeRuleDao dao=ServiceFactory.getObject(ChargeRuleDaoImpl.class);
		dao.updateChargeRule(charge_Code);
		response.getWriter().append("提交成功！");
		System.out.println(response.getStatus());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
