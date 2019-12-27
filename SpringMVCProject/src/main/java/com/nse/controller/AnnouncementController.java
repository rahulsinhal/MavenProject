package com.nse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nse.business.AnnouncementBO;
import com.nse.vo.AnnouncementVO;




@Controller
public class AnnouncementController {
	
	@Autowired
	AnnouncementBO annBO;
	
	@RequestMapping(value = "/list-announcements",method = RequestMethod.GET)
	public String listAnnouncements(ModelMap map)
	{
		System.out.println("In the listAnnouncements");
		
		List<AnnouncementVO> annList =  annBO.listAnnouncement();
		map.addAttribute("annList",annList);
		return "listAnnouncement";
	}
	
	@RequestMapping(value = "/addAnnouncement", method = RequestMethod.GET)
	public String addAnnouncement(ModelMap map)
	{
		System.out.println("In the addAnnouncement");
		map.addAttribute("announcementVO", new AnnouncementVO());
		return "addAnnouncement";
	}

	@RequestMapping(value = "/submitAnnouncement", method = RequestMethod.POST)
	public String submiAnnouncement(ModelMap map, AnnouncementVO annVO)
	{
		System.out.println("In the submitAnnouncement");
		System.out.println(annVO.getAnnSubject());
		System.out.println(annVO.getAnnText());
		System.out.println(annVO.getAnnType());
		System.out.println(annVO.getCompanyName());
		System.out.println(annVO.getAnnDate());
		System.out.println(annVO.getAnnRemarks());
		
		return "redirect:/list-announcements";
	}

	
}
