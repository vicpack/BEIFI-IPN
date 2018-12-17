<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <title>Creación de Grupo</title>
    </head>
    <body>
           <s:form action="createGroup" >
            <s:textfield name="name" label="Nombre del grupo: " /> 
            <s:submit value="Crear Grupo" />
            <s:actionmessage  />
        </s:form>
    </body>
</html>
