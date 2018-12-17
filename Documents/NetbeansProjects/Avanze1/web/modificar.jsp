<%@taglib  uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <title>JSP Page</title>
    </head>
    <body>
           <s:form action="cambiarDatos" >
            <s:textfield name="id" label="Id: " value="%{id}"/> 
            <s:textfield name="email" label="Email: " value="%{email}"/> 
            <s:textfield name="tipo" label="Alumno/Profesor: "  value="%{tipo}"/> 
            <s:submit value="Modificar" />
            <s:actionmessage  />
        </s:form>
    </body>
</html>
