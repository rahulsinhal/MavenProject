<%@ include file="common/header.jspf"%>
<html>
<head>
<title>Add new Announcements</title>
</head>
<body>
<div class="container">

<form:form method="post" action="submitAnnouncement" commandName="announcementVO">

<fieldset>
	<form:label path="annType">Announcement type</form:label>
	<form:input path="annType" name="annType" type="text" class="form-control"/>
</fieldset>
<fieldset>
	<form:label path="companyName">Company Name</form:label>
	<form:input path="companyName" name="companyName" type="text" class="form-control"/>
</fieldset>
<fieldset>
	<form:label path="annText">Announcement Text</form:label>
	<form:input path="annText" name="annText" type="text" class="form-control"/>
</fieldset>
<fieldset>
	<form:label path="annSubject">Announcement subject</form:label>
	<form:input path="annSubject" name="annSubject" type="text" class="form-control"/>
</fieldset>
<fieldset>
	<form:label path="annDate">Announcement subject</form:label>
	<form:input path="annDate" name="annDate" type="text" class="form-control"/>
</fieldset>
<fieldset>
	<form:label path="annRemarks">Announcement Remarks</form:label>
	<form:input path="annRemarks" name="annRemarks" type="text" class="form-control"/>
</fieldset>
	<button type="submit" class="btn btn-success">Submit</button>
</form:form>
</div>
</body>
</html>