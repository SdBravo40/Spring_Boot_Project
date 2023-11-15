<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>

     <link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
     <script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
     <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
     
      <script src="<c:url value="/js/register.js"/>" >  </script>
      <script src="<c:url value="/js/sweetalert.min.js"/>" >  </script> 
      
</head>
<body>

<div class="container pt-5">
 
 <form action="/">
 <div class="form-group row pt-2">
    <label for="colFormLabel" class="col-sm-2 col-form-label">Name:</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="name" placeholder="Enter Name" required>
    </div>
  </div>
  
  <div class="form-group row pt-2">
    <label for="colFormLabel" class="col-sm-2 col-form-label">Username:</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="username" placeholder="Enter Username" required>
    </div>
  </div>
  
  <div class="form-group row pt-2">
    <label for="colFormLabel" class="col-sm-2 col-form-label">Password:</label>
    <div class="col-sm-6">
      <input type="password" class="form-control" id="password" placeholder="***********" required>
    </div>
  </div>
  
  <div class="form-group row pt-2">
    <label for="colFormLabel" class="col-sm-2 col-form-label">Age:</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="age" placeholder="select Age" required>
    </div>
  </div>
  
  <div class="container-fluid pt-3 text-center">
        <button class="btn btn-primary" type="submit" id="submit" onclick="submitForm()">Submit</button>
  </div>
 </form>
</div>

</body>
</html>