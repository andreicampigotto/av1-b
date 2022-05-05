<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.util.*"
        import="modelo.Compania" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listagem de companias</h1>
        <%
            
        // goncalves2007, pg 420
        ArrayList<Compania> registros = (ArrayList<Compania>) request.getAttribute("registros");
                 
        for (Compania i : registros) {
        
        %>

        <%= i.getNome() %>, 
        <h>|</h>
        <%= i.getLocalizacao() %>, 
        <h>|</h>
        <%= i.getTamanho() %>
        <h>|</h>
        <%= i.getDominio() %>   
        <h>|</h>
        <%= i.getAno()%>
        <h>|</h>
        <%= i.getIndustria()%>
        <h>|</h>
        <%= i.getTamanho()%>
        <h>|</h>
        <%= i.getPais()%>
        <h>|</h>
        <%= i.getLinkedin()%>
        <h>|</h>
        <%= i.getEmpregados_atual()%>
        <h>|</h>
        <%= i.getEmpregados_total()%>
        <br></br>
        <%
            }
        %>

        Fim da listagem

    </body>
</html>
