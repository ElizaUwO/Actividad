<%-- 
    Document   : index
    Created on : 7 abr. 2022, 20:07:57
    Author     : ferna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Actividad 12</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h2>Area y perimetro de un triangulo</h2>
        <form action="ServletXD">
            Area Triangulo <br>
            Ingrese la Base:<input type="text" name="base" value="" /><br><br>
            Ingrese la Altura:<input type="text" name="altura" value="" /><br><br>
            Perimetro Triangulo <br>
            Ingresa el lado A:<input type="text" name="ladoA" value="" /><br><br>
            Ingresa el lado B:<input type="text" name="ladoB" value="" /><br><br>
            Ingresa el lado C:<input type="text" name="ladoC" value="" /><br><br>
            <input type="submit" name = "accion" value="Enviar" />
            <br><br>
            <a href="ServletXD?accion=BD">Resultados </a>
        </form>
    </body>
</html>
