<%-- 
    Document   : Logout
    Created on : 18/09/2022, 06:58:37 PM
    Author     : User
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
        response.sendRedirect("/Proyecto_Cinyuje/Vistas/Index.jsp");
    %>
    
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
