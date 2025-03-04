package com.a2a2lab.fapp.company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CompanyController {

	@Autowired
	CompanyService companyService;
	
//	@RequestMapping(value = "/company/companyXdmList")
//	public String codeGroupXdmList(Model model) {
//		List<CompanyDto> companyDtos = new ArrayList<>();
//		
//		companyDtos = companyService.selectList();
//		
//		model.addAttribute("list", companyDtos);
//		
//		return "company/companyXdmList";
//	}
	
	@RequestMapping(value = "/company/companyXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", companyService.selectList());
		return "company/companyXdmList";
	}
	
	@RequestMapping(value = "/company/companyXdmView")
	public String codeGroupXdmView(Model model) {
		model.addAttribute("item", companyService.selectOne());
		return "company/companyXdmView";
	}
	
}
