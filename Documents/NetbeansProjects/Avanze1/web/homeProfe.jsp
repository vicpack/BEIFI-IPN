<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Listado de Grupos</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
    </head>
    <body>
        <h1>Listado de Grupos </h1>
        <table class="table table-bordered">
            <thead>
                <th>IdGrupo</th>
                <th>Nombre</th>
            </thead>
            <tbody>
         <s:iterator value="datos" var="dato" status="estado">
                    <tr>
                        <td><s:property value="idGrupo" /></td>
                        <td><s:property value="name" /></td>
                         <td>
                             <s:url action="editeGrupo" var="idEditar" >
                                  <s:param name="id" value="idGrupo">
                                  </s:param>
                                </s:url>
                               <s:a href="%{idEditar}">
                                <i class="glyphicon glyphicon-pencil"></i>
                            </s:a>
                      
                            <s:url action="deleteGrupo" var="idBorrar" >
                                  <s:param name="id" value="idGrupo">
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
        <a href="newGrupo.jsp" >Crear Grupo</a>
    </body>
</html>
