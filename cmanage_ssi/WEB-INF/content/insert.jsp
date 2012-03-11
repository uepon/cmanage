<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="<s:url value="/css/uepon.css"/>" />
<title>ueponx</title>
</head>
<body>
<h1><a href="<s:url value="/"/>">Struts2・Spring・iBatis製</a></h1>
<s:actionerror />

<s:form>
<s:textfield label="名前" name="viewDto.customerDto.name" size="25" maxlength="15" />
<s:textfield label="所属企業" name="viewDto.customerDto.shozokuKigyo" size="25" maxlength="15" />
<s:textfield label="郵便番号" name="viewDto.customerDto.yubinNo" size="25" maxlength="15" />
<s:textfield label="住所" name="viewDto.customerDto.jusho" size="25" maxlength="15" />
<s:textfield label="電話番号" name="viewDto.customerDto.tel" size="25" maxlength="15" />
<s:textfield label="携帯電話" name="viewDto.customerDto.mobileTel" size="25" maxlength="15" />
<s:submit value="追加" method="execInsert" />
</s:form>
<s:url id ="back_link" action="back"/>
<s:a href="%{back_link}">戻る</s:a>

</body>
</html>