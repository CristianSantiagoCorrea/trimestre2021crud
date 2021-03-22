<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@include file="cabecera.jsp"%>
<html>
      <head>
       <!-- Required meta tags -->
  <meta charset="utf-8">
  
       <script src="  https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="  https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"></script>
<script src="  https://cdn.datatables.net/1.10.24/js/dataTables.bootstrap5.min.js"></script>
<script src="  https://cdn.datatables.net/buttons/1.7.0/js/dataTables.buttons.min.js"></script>
<script src="  https://cdn.datatables.net/buttons/1.7.0/js/buttons.bootstrap5.min.js"></script>
<script src="  https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
<script src="  https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js"></script>
<script src="  https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js"></script>
<script src="  https://cdn.datatables.net/buttons/1.7.0/js/buttons.html5.min.js"></script>
<script src="  https://cdn.datatables.net/buttons/1.7.0/js/buttons.print.min.js"></script>
<script src="  https://cdn.datatables.net/buttons/1.7.0/js/buttons.colVis.min.js"></script>
  
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.24/css/dataTables.bootstrap5.min.css">
<link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.7.0/css/buttons.bootstrap5.min.css">
  
  
  
  
  <title>ShopFAST</title>
    </head>
    <body>
       <script>$(document).ready(function() {
    var table = $('#example').DataTable( {
        lengthMenu: [[5],[5]],
        lengthChange: false,
        buttons: [ 'copy', 'excel', 'pdf', 'colvis' ]
    } );
 
    table.buttons().container()
        .appendTo( '#example_wrapper .col-md-6:eq(0)' );
} );</script>
        
        
        <div class="d-flex justify-content-center">
         <h1>Users</h1>
       </div>
        <a class="btn btn-primary mb-2" href="agregarCliente.htm">agregar cliente</a>
 
      
   <table id="example" class="table table-striped" style="width:100%">
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
   <tfoot>
   <th>id</th>
   <th>Nombre</th>
   <th>Apellido</th>   
   <th>Email</th> 
   <th>Edad</th>
      <th>Opciones</th>
  </tfoot>
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
   
   <script>
$(document).ready( function () {
    $('tabladata').DataTable();
} );</script> 
    <%@include file="footer.jsp" %>
    </body>
</html>
