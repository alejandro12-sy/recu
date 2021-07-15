<%-- 
    Document   : index
    Created on : 15 jul. 2021, 14:17:53
    Author     : SERGESAN PCS2021
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
      
    </head>
    <body>
    <center>
        <div>
            <h3>productos</h3>
            <form action="Controla" method="POST">
            <input type="submit" name="accion" value="Listar">
            
            </form>
            <div>
                <table border="2" width="2">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>NOMBRE</th>
                            <th>PRECIO</th>
                            <th>STOCK</th>
                            <th>CATEGORIA</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach  var="dato" items="${datos}">
                        <tr>
                            <td>${dato.getIdproducto()}</td>
                            <td>${dato.getNombre()}</td>
                            <td>${dato.getPrecio()}</td>
                            <td>${dato.getStock()}</td>
                            <td>${dato.getCATEGORIA_IDCATEGORIA()}</td>
                        <form >
                            <input type="type" name="name">
                            
                        </form>
                        </tr>
                      
                         </c:forEach>  
                    </tbody>
                </table>

                
                
            </div>
    </div>
    </center>
    
    
        
       
    </body>
</html>
