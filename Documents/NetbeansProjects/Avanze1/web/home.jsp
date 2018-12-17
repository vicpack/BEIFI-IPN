<%@taglib  uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <title>Log In</title>
    </head>
    <body>
         <s:form action="ingresar" namespace="/" >
            <s:textfield name="email" label="Email : " />
            <s:password name="password" label="Password: " />
            <s:submit value="ingresar" />
            <s:actionmessage  />
            <br>No tienes cuenta?<br>
            <a href="sign.jsp" >Crear Cuenta</a>
        </s:form>
    </body>
</html>
