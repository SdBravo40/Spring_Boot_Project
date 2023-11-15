<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>

     <link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
     <script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
     <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
     
      <script src="<c:url value="/js/register.js"/>" >  </script>
      <script src="<c:url value="/js/sweetalert.min.js"/>" >  </script> 
</head>
<body>
 
  <div class="container pt-2 text-center">
       <h3>Welcome to Home Page!</h3>
  </div>
  
  <div class="container pt-5 text-center">
        <a href="/signup" class="btn btn-primary">Register</a>
  </div>
  
   <div class="container pt-5 text-center">
       <a href="/getTable" class="btn btn-primary">Show Table </a>
       <!-- <button class="btn btn-primary" onclick="showTable()">Show Table</button> -->
        <button class="btn btn-secondary" onclick="hideTable()">Hide Table</button>
        
  </div>
  
  <div class="container pt-5">
       <table class="table table-bordered table-striped table-hover" id="tableid">
           <thead>
           <tr>
              <!--  <th>Id</th> -->
               <th>Age</th>
               <th>Date</th>
               <th>Name</th>
               <th>Password</th>
               <th>Username</th>
           </tr>
           </thead>
           
           <tbody>
           <c:forEach var="user" items="${userlist}">
               <tr>
                  <%--  <td>${user.id}</td> --%>
                   <td>${user.age}</td>
                   <td>${user.date}</td>
                   <td>${user.name}</td>
                   <td>${user.password}</td>
                   <td>${user.username}</td>
               </tr>
           </c:forEach>
           
           </tbody>
           
           <tfoot>
                 
           </tfoot>
       </table>
  </div>
</body>
</html>