<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
hiiiiiiiiiiiiiiiiiiiiiiii
</head>
<body>
<h1>Value passing within jsp</h1>
${name}<br> ${dept}<br>${phone}

<table>
    <thead>

    <tr>
        <td>Name</td>
        <td>Dept</td>
        <td>phone</td>
        <td>action</td>
    </tr>
    </thead>

    <c:forEach items="${mylist}" var="std" varStatus="idx">
        <tr>
            <td>${idx.count}</td>
            <td>${std.name}</td>
            <td>${std.dept}</td>
            <td>${std.phone}</td>
            <td>delete</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>