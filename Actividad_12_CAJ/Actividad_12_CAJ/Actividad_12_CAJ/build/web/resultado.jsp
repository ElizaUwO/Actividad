<%-- 
    Document   : resutado
    Created on : 7 feb. 2022, 20:40:44
    Author     : ferna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <%
            String area = (String) request.getAttribute("area"), perimetro = (String) request.getAttribute("perimetro");
            
            out.print("<br>El area es: " + area);
            out.print("<br>El perimetro es: " + perimetro);
        %>
        <br>
        <a href="index.jsp">Regresar</a>
    </body>
</html>
