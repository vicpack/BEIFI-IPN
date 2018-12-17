<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Listado de Usuarios</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
    </head>
    <body>
        <h1>Listado de Usuarios </h1>
        <table class="table table-bordered">
            <thead>
                <th>IDUser</th>
                <th>E-mail</th>
                <th>Password</th>
                <th>Tipo</th>
            </thead>
            <tbody>
         <s:iterator value="datos" var="dato" status="estado">
                    <tr>
                        <td><s:property value="idUser" /></td>
                        <td><s:property value="email" /></td>
                        <td><s:property value="password" /></td>
                        <td><s:property value="tipo" /></td>
                         <td>
                             <s:url action="edite" var="idEditar" >
                                  <s:param name="id" value="idUser">
                                  </s:param>
                                </s:url>
                               <s:a href="%{idEditar}">
                                <i class="glyphicon glyphicon-pencil"></i>
                            </s:a>
                      
                            <s:url action="delete" var="idBorrar" >
                                  <s:param name="id" value="idUser">
                                  </s:param>
                                </s:url>
                            <s:a href="%{idBorrar}">
                                <i class="glyphicon glyphicon-trash"></i>
                            </s:a>
                        </td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>   
        <a href="CuentaAdmin.jsp" >Crear Usuario</a>
        <a href="menuAdmin.jsp" >Volver al Menú</a>
    </body>
</html>
