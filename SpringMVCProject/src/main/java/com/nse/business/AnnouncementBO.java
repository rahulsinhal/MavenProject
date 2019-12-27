package com.nse.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nse.dao.AnnouncementDAO;
import com.nse.vo.AnnouncementVO;


@Service
public class AnnouncementBO {
	
	@Autowired
	AnnouncementDAO annDao;

	public void saveAnnouncement(AnnouncementVO annVO)
	{
		System.out.println("In the saveAnnouncement of AnnouncementBO");
		annDao.saveAnnouncement(annVO);
	}
	
	public List<AnnouncementVO> listAnnouncement()
	{
		System.out.println("In the listAnnouncement of AnnouncementBO");
		return annDao.listAnnouncement();
	}
}
