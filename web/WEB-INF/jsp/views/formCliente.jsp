


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<%@include file="cabecera.jsp"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
       
        <form:form commandName="cliente" method="post">
          
            
            <form:label path="nombre"></form:label>
            <form:input path="nombre"></form:input>
            
            <form:label path="apellido"></form:label>
            <form:input path="apellido"></form:input>
            
            <form:label path="correo"></form:label>
            <form:input path="correo"></form:input>
            
            <form:label path="edad"></form:label>
            <form:input path="edad"></form:input>
            
            <form:button name="Enviar">enviar</form:button>
            
        </form:form>
        
    </body>
</html>
