package com.a2a2lab.fapp.company;

public class CompanyDto {

//	int -> Integer
//	varchar -> String
	
	private String seq;
	private Integer main;
	private String company;
	private String team;
	private String position;
	private Integer delNy;
	public Integer getDelNy() {
		return delNy;
	}
	public void setDelNy(Integer delNy) {
		this.delNy = delNy;
	}
	private String contact_seq;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public Integer getMain() {
		return main;
	}
	public void setMain(Integer main) {
		this.main = main;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getContact_seq() {
		return contact_seq;
	}
	public void setContact_seq(String contact_seq) {
		this.contact_seq = contact_seq;
	}
	
}
