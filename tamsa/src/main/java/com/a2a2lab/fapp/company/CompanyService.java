package com.a2a2lab.fapp.company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

	// 로직 정의
	
	// 여러건의 데이터를 가지고 온다
	
	@Autowired
	CompanyDao companyDao;
//	CompanyDao companyDao = new CompanyDao();
	
//	public List<CompanyDto> selectList() {
//		List<CompanyDto> companyDtos = new ArrayList<>();
//		
//		companyDtos = companyDao.selectList();
//		
//		return companyDtos;
//	}
	
	public List<CompanyDto> selectList() {
		return companyDao.selectList();
	}
	
	public CompanyDto selectOne() {
		return companyDao.selectOne();
	}
}
