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
	public String companyXdmList(Model model) {
		model.addAttribute("list", companyService.selectList());
		return "company/companyXdmList";
	}
	
	@RequestMapping(value = "/company/companyXdmView")
	public String companyXdmView(Model model, CompanyDto companyDto) {
		
		System.out.println("companyDto.getSeq(): " + companyDto.getSeq());

		model.addAttribute("item", companyService.selectOne(companyDto));
		return "company/companyXdmView";
	}
	
	@RequestMapping(value = "/company/companyXdmForm")
	public String companyXdmForm() {
		
		return "company/companyXdmForm";
	}
	
	@RequestMapping(value = "/company/companyXdmInst")
	public String companyXdmInst(CompanyDto companyDto) {
		System.out.println("companyDto.getSeq(): " + companyDto.getSeq());
		System.out.println("companyDto.getCompany(): " + companyDto.getCompany());
		
		companyService.insert(companyDto);
		
		System.out.println("companyDto.getSeq(): " + companyDto.getSeq());
		
		return "redirect:/company/companyXdmList";
	}
	
	@RequestMapping(value = "/company/companyXdmMfom")
	public String companyXdmMfom(Model model, CompanyDto companyDto) {
		
		System.out.println("companyDto.getSeq(): " + companyDto.getSeq());
		model.addAttribute("item", companyService.selectOne(companyDto));
		
		return "company/companyXdmMfom";
	}
	
	@RequestMapping(value = "/company/companyXdmUpdt")
	public String companyXdmUpdt(CompanyDto companyDto) {
		System.out.println("companyDto.getSeq(): " + companyDto.getSeq());
		companyService.update(companyDto);
		System.out.println("companyDto.getSeq(): " + companyDto.getSeq());
		return "redirect:/company/companyXdmList";
	}
	
}
