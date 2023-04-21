<%-- 
    Document   : tabla
    Created on : 7 abr. 2022, 20:56:46
    Author     : ferna
--%>

<%@page import="java.util.Iterator"%>
<%@page import="modelos.Triangulo"%>
<%@page import="java.util.List"%>
<%@page import="modelos.Implementacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos en la Base</h1>
        <table>
            <tread>
                <tr>
                    <th>Id</th>
                    <th>Areas</th>
                    <th>Perimetros</th>
                </tr>
            </tread>
            <%
                Implementacion dao = new Implementacion();
                List<Triangulo> list = dao.listar();
                Iterator<Triangulo> iter = list.iterator();
                Triangulo figura = null;
                while (iter.hasNext()) {
                    figura = iter.next();

            %>
            <tbody>
                <tr>
                    <td><%= figura.getId()%></td>
                    <td><%= figura.getareasResult()%></td>
                    <td><%= figura.getperiResult()%></td>
                </tr>
            </tbody>
            <%}%>
        </table>

        <br>
        <a href="index.jsp"> Regresar</a>
    </body>
</html>
