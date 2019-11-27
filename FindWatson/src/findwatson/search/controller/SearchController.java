package findwatson.search.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import findwatson.admin.dto.HospitalListDTO;
import findwatson.search.dao.HospitalListDAO;

@WebServlet("*.s")
public class SearchController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String cmd = requestURI.substring(contextPath.length());
		
		if(cmd.contentEquals("/search.s")) {
			
		String input_city = request.getParameter("city");
		String input_gu = request.getParameter("gu");
		String input_dong = request.getParameter("dong");
		String input_medicalAnimal= request.getParameter("medicalAnimal");
		String input_medicalDept = request.getParameter("medicalDept");
		String input_infoRegist = request.getParameter("infoRegist");
		
		List<HospitalListDTO> list = new ArrayList<>();
		try {
		list = HospitalListDAO.getInstance().selectAll(input_city, input_gu, input_dong, input_medicalAnimal, input_medicalDept, input_infoRegist);
		request.setAttribute("list", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
