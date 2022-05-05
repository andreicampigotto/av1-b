<%-- 
    Document   : form
    Created on : Mar 17, 2022, 3:09:25 PM
    Author     : friend
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Compania</h1>
        <form action="compania" method="post">
            Nome: <input type="text" name="nome" value="Empresa sem nome"> <br>
            Localização: <input type="text" name="localizacao" value="Na esquina"> <br>
            Tamanho: <input type="text" name="telefone" value="tamanho"> <br>
            <input type="submit" value="Cadastrar">
        </form>
    </body>
</html>
