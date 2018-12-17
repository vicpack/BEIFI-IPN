<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Menú Administrador</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
    </head>
    <body>
        <h1>Menú Principal </h1>
        <table class="table table-bordered">
            <thead>
                <th>Usuarios</th>
                <th>Grupos</th>
            </thead>
            <tbody>
                    <tr>
                        <td><s:form action="homeAdmin" namespace="/" >
                            <s:submit value="Usuarios" />
                            <s:actionmessage  />
                            </s:form>
                        </td>
                        <td><a href="homeGrupos.jsp" >Grupos</a></td>
                    </tr>
            </tbody>
        </table>   
    </body>
</html>

