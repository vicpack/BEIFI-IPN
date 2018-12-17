<%@taglib  uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <title>Editar Grupo</title>
    </head>
    <body>
           <s:form action="cambiarGrupo" >
            <s:textfield name="id" label="Id: " value="%{id}"/> 
            <s:textfield name="name" label="Nombre: "  value="%{name}"/> 
            <s:submit value="Modificar" />
            <s:actionmessage  />
        </s:form>
    </body>
</html>
