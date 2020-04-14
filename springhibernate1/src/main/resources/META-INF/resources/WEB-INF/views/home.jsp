<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    Spring with hibernate
</head>
<body>
<h1>
    Hibernate connection established
</h1>

<form action="save" method="post">
    <input type="text" name="name" placeholder="Enter name">
    <input type="text" name="des" placeholder="Enter description">
    <input type="submit" value="Save">
</form>


<table border="1px">
    <thead >
    <tr>
        <th>SL No.</th>
        <th>ID</th>
        <th>name</th>
        <th>Description</th>
        <th>action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${stuList}" var="stu" varStatus="loop">
<tr>
    <td>${loop.count}</td>
    <td>${stu.id}</td>
    <td>${stu.name}</td>
    <td>${stu.description}</td>
    <td><a href="/delete?studentId=${stu.id}" style="color: coral">Delete</a></td>
</tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>