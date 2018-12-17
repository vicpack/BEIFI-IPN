<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <title>JSP Page</title>
    </head>
    <body>
           <s:form action="createAdmin" >
            
            <s:textfield name="email" label="Email: " /> 
            <s:password name="password" label="Password: " />  
            <s:textfield name="tipo" label="Alumno/Profesor: " /> 
            <s:submit value="Crear Cuenta" />
            <s:actionmessage  />
        </s:form>
    </body>
</html>
