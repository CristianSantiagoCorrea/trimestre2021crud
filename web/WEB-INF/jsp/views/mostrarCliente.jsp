<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@include file="cabecera.jsp"%>
<html>
      <head>
       <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- CSS -->
  <link rel="stylesheet" href="styles/styles.css">
  <!-- Font awesome -->
  <script src="https://kit.fontawesome.com/63d83764ab.js" crossorigin="anonymous"></script>


  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"
    integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous">
  </script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js"
    integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous">
  </script>

  <!-- fonts -->
  <link rel="preconnect" href="https://fonts.gstatic.com">
  <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@900&display=swap" rel="stylesheet">

        <title>ShopFAST</title>
    </head>
    <body>
         <div class="d-flex justify-content-center">
         <h1>Users</h1>
       </div>
        <a class="btn btn-primary mb-2" href="agregarCliente.htm">agregar cliente</a>
 
      
   <table class="table table-dark">
  <thead>
  <h2> ALL USERS </h2>
  
     <tr>
      <th scope="col">id</th>
      <th scope="col">Nombre</th>
      <th scope="col">Apellido</th>
      <th scope="col">Email</th>
      <th scope="col">Edad</th>
      <th scope="col">opciones</th>
    </tr>
   </thead>
  <tbody>
     <c:forEach items="${cliente}" var="dato"> 
     <tr>
      <th scope="row"><c:out   value="${dato.id}"></c:out></th>
      <td><c:out   value="${dato.nombre}">  </c:out> </td>
      <td><c:out   value="${dato.apellido}"></c:out></td>
      <td><c:out   value="${dato.correo}"></c:out></td>
      <td><c:out   value="${dato.edad}"></c:out></td>
       <td>   <a class="btn btn-success" href="actCliente.htm?id=${dato.id}">EDITAR</a>
   <a class="btn btn-danger" href="borrarCliente.htm?id=${dato.id}">BORRAR</a></td>
    </tr> 
      
         </c:forEach> 

  </tbody>
</table>
    
        
        
        
        <c:forEach items="${cliente}" var="dato">
     
  <div class="card mb-3" style="max-width: 540px;">
  <div class="row g-0">
    <div class="col-md-4">
        <img class="img-fluid"  src="https://cdn.icon-icons.com/icons2/1154/PNG/512/1486564400-account_81513.png" alt="...">
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title"> Name:<c:out   value="${dato.nombre}">  </c:out> 
         <c:out   value="${dato.apellido}"></c:out></h5>
        <p class="card-text">ID <c:out   value="${dato.id}"></c:out> Email: <c:out   value="${dato.correo}"></c:out></p>
        <p class="card-text"><small class="text-muted">AGE:<c:out   value="${dato.edad}"></c:out></small></p>
       <div class="card-footer text-muted">
       <a class="btn btn-success" href="actCliente.htm?id=${dato.id}">EDITAR</a>
   <a class="btn btn-danger" href="borrarCliente.htm?id=${dato.id}">BORRAR</a><br />
  </div>
      </div>
    </div>
  </div>
</div>
          </c:forEach>
    </body>
</html>
