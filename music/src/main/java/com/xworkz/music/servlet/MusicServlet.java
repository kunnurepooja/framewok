package com.xworkz.music.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.music.dao.MusicDAO;
import com.xworkz.music.dto.MusicDTO;

public class MusicServlet extends HttpServlet {

	ApplicationContext container;

	@Override
	public void init() throws ServletException {
		container = new ClassPathXmlApplicationContext("Spring.xml");
	}

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String album = request.getParameter("album");
		String singer = request.getParameter("singer");
		String company = request.getParameter("company");
		String year = request.getParameter("year");
		MusicDTO dto = new MusicDTO(album, singer, company, Integer.parseInt(year));
		MusicDAO dao = container.getBean(MusicDAO.class);
		Integer id = dao.saveAndReturnId(dto);
		if (id > 0) {
			out.print("Data saved Successfull....");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
