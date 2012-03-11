<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/uepon.css')}" />
<title>ueponx</title>
</head>
<body>
<h1><a href="${f:url("/")}">SAStruts・S2JDBC製</a></h1>
<html:errors />
<s:form>
名前：<html:text property="name" size="25" maxlength="15" />
<br/>
所属企業：<html:text property="shozokuKigyo" size="25" maxlength="15" />
<br/>
郵便番号：<html:text property="yubinNo" size="25" maxlength="15" />
<br/>
住所：<html:text property="jusho" size="25" maxlength="15" />
<br/>
電話番号：<html:text property="tel" size="25" maxlength="15" />
<br/>
携帯電話：<html:text property="mobileTel" size="25" maxlength="15" />
<br/>
<html:submit property="execInsert" value="登録"/>
</s:form>
<a href="${f:url("/back")}">戻る</a>
</body>
</html>