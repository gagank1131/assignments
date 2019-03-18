<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
${heading}

<form method="post" action="/demoForm/submitForm">
    <label>Username</label>
    <input name="username" type="text">
    <label>Password</label>
    <input name="password" type="password">
    <input type="submit">
</form>

<br>
<br>
for 9th Answer

<form method="post" action="/coDemo/submitForm">
    <label>First Name</label>
    <input name="firstName" type="text">
    <label>Last Name</label>
    <input name="lastName" type="text">
    <input type="submit">
</form>


</body>
</html>