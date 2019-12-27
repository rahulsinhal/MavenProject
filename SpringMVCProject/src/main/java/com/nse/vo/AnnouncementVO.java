package com.nse.vo;

import java.util.Date;

public class AnnouncementVO {

	public Long annId;
	public String annType;
	public String annText;
	public String companyName;
	public Date annDate;
	public String annSubject;
	public String annRemarks;
	
	public AnnouncementVO() {
		
	}
	
	public Long getAnnId() {
		return annId;
	}
	public void setAnnId(Long annId) {
		this.annId = annId;
	}
	public String getAnnType() {
		return annType;
	}
	public void setAnnType(String annType) {
		this.annType = annType;
	}
	public String getAnnText() {
		return annText;
	}
	public void setAnnText(String annText) {
		this.annText = annText;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getAnnDate() {
		return annDate;
	}
	public void setAnnDate(Date annDate) {
		this.annDate = annDate;
	}
	public String getAnnSubject() {
		return annSubject;
	}
	public void setAnnSubject(String annSubject) {
		this.annSubject = annSubject;
	}
	public String getAnnRemarks() {
		return annRemarks;
	}
	public void setAnnRemarks(String annRemarks) {
		this.annRemarks = annRemarks;
	}

}
