package com.xworkz.flight.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.flight.dto.FlightDTO;

@Component
@RequestMapping("/")
public class FlightComponent {
	
	public FlightComponent() {
		System.out.println("created "+getClass().getSimpleName());
	}
	
	@RequestMapping("/saveAction1.do")
	public String onSave(){
		return "/Save.jsp";
	}
	
	@RequestMapping("/saveAction2.do")
	public String onSave(HttpServletRequest request, HttpServletResponse response){
		String name = request.getParameter("name");
		String pasanger = request.getParameter("passanger");
		String aitport = request.getParameter("airport");
		String arrivale = request.getParameter("arrivale");
		String departure = request.getParameter("departure");
		return "/Save.jsp";
	}
	
	@RequestMapping("/saveAction3.do")
	public String onSave(@RequestParam String name,@RequestParam String passanger,@RequestParam String airport,@RequestParam String arrivale,@RequestParam String departure){
		System.out.println("inside save method");
		System.out.println(name+" "+passanger+" "+airport+" "+arrivale+" "+departure);
		return "/Save.jsp";
	}
	
	@RequestMapping("/saveAction.do")
	public String onSave(FlightDTO dto){
		System.out.println("inside save metho "+ dto);
		return "/Save.jsp";
	}

}
