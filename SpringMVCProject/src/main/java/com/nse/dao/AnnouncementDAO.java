package com.nse.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nse.vo.AnnouncementVO;

@Repository
public class AnnouncementDAO {
	
	public JdbcTemplate jdbcTemplate;
	
	@Autowired
	private DataSource dataSource;
	
	public void saveAnnouncement(AnnouncementVO annVO)
	{
		System.out.println("In the saveAnnouncement of AnnouncementDAO");
	}

/*	public AnnouncementVO getAnnouncementById(int annId)
	{
		
		
	}*/
	public List<AnnouncementVO> listAnnouncement()
	{
		 
		System.out.println("In the listAnnouncement of AnnouncementDAO");
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.getDataSource();
		String sql = "SELECT * FROM announcements";
		    List<AnnouncementVO> listAnnouncement = jdbcTemplate.query(sql, new RowMapper<AnnouncementVO>() {
		 
		        public AnnouncementVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		        	AnnouncementVO annVO = new AnnouncementVO();
		        	
		        	System.out.println(rs.getLong("ANN_ID"));
		        	System.out.println(rs.getString("ANN_SUBJECT"));
		        	System.out.println(rs.getDate("ANN_DATE"));
		        	
		        	annVO.setAnnId(rs.getLong("ANN_ID"));
		        	annVO.setAnnSubject(rs.getString("ANN_SUBJECT"));
		        	annVO.setAnnType(rs.getString("ANN_TYPE"));
		        	annVO.setAnnText(rs.getString("ANN_TEXT"));
		        	annVO.setCompanyName(rs.getString("ANN_COMPANY"));
		        	annVO.setAnnDate(rs.getDate("ANN_DATE"));
		        	annVO.setAnnRemarks(rs.getString("ANN_REMARKS"));
		            return annVO;
		        }
		 
		    });
		 
		    return listAnnouncement;
	}
}
