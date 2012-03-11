<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/uepon.css')}" />
<title>ueponx</title>
</head>
<body>
<h1><a href="${f:url("/")}">SAStruts・S2JDBC製</a></h1>
<s:link href="insert">追加</s:link>
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
<c:forEach var="cmaster" items="${customerList}">
  <tr>
    <td>${cmaster.customerId}</td>
    <td>${cmaster.name}</td>
    <td>${cmaster.shozokuKigyo}</td>
    <td>${cmaster.yubinNo}</td>
    <td>${cmaster.jusho}</td>
    <td>${cmaster.tel}</td>
    <td>${cmaster.mobileTel}</td>
    <td><s:link href="edit/${cmaster.customerId}/">編集</s:link>・<s:link href="delete/${cmaster.customerId}/">削除</s:link></td>
  </tr>
</c:forEach>

</table>

<c:if test="${pageConditionDto.prevPage}" >
<a href="${f:url("/prev")}">前へ</a>
</c:if>

<c:if test="${pageConditionDto.nextPage}" >
<a href="${f:url("/next")}">次へ</a>
</c:if>

</body>
</html>