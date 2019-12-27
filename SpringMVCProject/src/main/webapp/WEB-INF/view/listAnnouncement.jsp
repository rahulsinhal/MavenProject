<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Manager Home</title>
    </head>
<title>Announcement Page</title>
</head>

<body>
<div align="center">
            <h1>Announcement List</h1>
            <h3><a href="/SpringMVCProject/addAnnouncement">New Announcement</a></h3>
            <table border="1">
                <th>Id</th>
				<th>Ann Id</th>
                <th>Ann Type</th>
                <th>Ann Subject</th>
                <th>Ann Text</th>
                <th>Company Name</th>
                <th>Ann Date</th>
				<th>Ann Remarks</th>
                 
                <c:forEach var="ann" items="${annList}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${ann.annId}</td>
                    <td>${ann.annType}</td>
					<td>${ann.annSubject}</td>
                    <td>${ann.annText}</td>
                    <td>${ann.companyName}</td>
					 <td>${ann.annDate}</td>
					 <td>${ann.annRemarks}</td>				 
                                                
                </tr>
                </c:forEach>             
            </table>
 </div>
</body>
</html>