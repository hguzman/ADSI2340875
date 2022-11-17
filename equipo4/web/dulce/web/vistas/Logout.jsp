<%-- 
    Document   : Logout
    Created on : 28/09/2022, 10:06:11 AM
    Author     : HPLAPTOP01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        HttpSession sesion = request.getSession();
        sesion.invalidate();
        response.sendRedirect("/dulce/vistas/login.jsp");
    %>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
