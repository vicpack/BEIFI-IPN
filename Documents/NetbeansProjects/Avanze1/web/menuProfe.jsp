<%@page contentType="text/html" pageEncoding="UTF-8"%>
<<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Menú Profesor</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
    </head>
    <body>
        <h1>Bienvenido Profesor! </h1>
        <table class="table table-bordered">
            <thead>
                <th>Grupos</th>
            </thead>
            <tbody>
                    <tr>
                        <td>
                            <s:form action="homeGrupo" namespace="/" >
                            <s:submit value="Grupos" />
                            <s:actionmessage  />
                            </s:form>
                        </td>
                    </tr>
            </tbody>
        </table>   
    </body>
</html>

