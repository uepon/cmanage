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
<a href="<s:url value="insert"/>">追加</a>

<table class="ctable">
  <tr>
    <th scope="col">No</th>
    <th scope="col">名前</th>
    <th scope="col">所属企業</th>
    <th scope="col">郵便番号</th>
    <th scope="col">住所</th>
    <th scope="col">電話番号</th>
    <th scope="col">携帯電話</th>
    <th scope="col">編集・削除</th>
  </tr>
<s:iterator value="viewDto.customerList" >
  <tr>
    <td>${customerId}</td>
    <td>${name}</td>
    <td>${shozokuKigyo}</td>
    <td>${yubinNo}</td>
    <td>${jusho}</td>
    <td>${tel}</td>
    <td>${mobileTel}</td>
    <td>
<s:url id ="edit_link" action="edit">
<s:param name="customerId">${customerId}</s:param>
</s:url>
<s:a href="%{edit_link}">編集</s:a>
    ・
<s:url id ="delete_link" action="delete">
<s:param name="customerId">${customerId}</s:param>
</s:url>
<s:a href="%{delete_link}">削除</s:a>
    </td>
  </tr>
</s:iterator>

</table>

<s:if test="%{viewDto.pageConditionDto.prevPage}">
<s:url id ="prev_link" action="prev"/>
<s:a href="%{prev_link}">前へ</s:a>
</s:if>

<s:if test="%{viewDto.pageConditionDto.nextPage}">
<s:url id ="next_link" action="next"/>
<s:a href="%{next_link}">次へ</s:a>
</s:if>

</body>
</html>