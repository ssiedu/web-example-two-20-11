package com.ssi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CylinderController {
	
	//controller is dependent on service (we will autowire)
	
	@Autowired
	private CylinderService cylinderService;

	@RequestMapping("input")	//handler-method-for-url->"/input"
	public String showInputPage() {
		return "details.jsp";
	}
	
	@RequestMapping("process")
	public ModelAndView processInput(@ModelAttribute("info") Cylinder cylinder) {
		cylinderService.calculate(cylinder);
		ModelAndView mv=new ModelAndView("result.jsp");
		CodeInfo codeInfo=new CodeInfo("manoj","ssi");
		mv.addObject("codeinfo", codeInfo);
		return mv;
	}
}
