<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
         <h1>Actualizar cliente</h1>
       </div>
       
            
        <form action="" method="post" >
          <div class="container">
              <div class="row">
            <div class="col-sm-2  align-self-center">
             <label>nombre</label>
             <input type="text" name="nombre" 
             class="form-control" value='<c:out   value="${cliente[0].nombre}">  </c:out>' />
            </div>  
      
            <div class="col-sm-2  align-self-center">
            <label>apellido</label>
            <input type="text" name="apellido" 
              class="form-control "     value= '<c:out   value="${cliente[0].apellido}"></c:out>' />
            </div> 
            
           <div class="col-sm-2  align-self-center"> 
            <label>correo</label>
            <input type="text" name="correo" 
             class="form-control"      value='<c:out   value="${cliente[0].correo}">  </c:out>' />
           </div> 
          
            <div class="col-sm-2  align-self-center"> 
           <label>edad</label>
           <input type="text" name="edad"  class="form-control"
                   value='<c:out   value="${cliente[0].edad}">    </c:out>' />
          </div> 
              <div class="col-sm-2  align-self-center"> 
          <input type="reset" value="borrar" class="btn btn-warning mt-2"/>
        <input type="submit" value="confirmar datos" class="btn btn-success mt-2"/>
        </div> 
          </div>
          </div>
</form> 
          
    </body>
    
</html>
