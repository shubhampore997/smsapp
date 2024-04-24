<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<div class="d-flex justify-content-center align-center" style="background-image: url(images/attendance.jpg);background-size: 800px;background-repeat: no-repeat;
   height: 800px;margin-top: 50px">   
<div class="w-50 align-middle border border-info  border-3 mt-2"    
style="height: 500px; margin-left: 700px;" > 

<h6 class="p-3 text-primary " style="text-align:center; font-size:40px">     
<u>Student Attendance :-</u>    
</h6>     
<div class="border border-secondary m-3 p-2">           
<table class="table table-hover border border-secondary ">       
<tbody>    
      
<tr class="table-primary fs-6">            
<th>Student Id</th>            
<td>${ats.studentId}</td>          
</tr>     
       
<tr class="table-primary fs-6">            
<th>Student Name</th>            
<td>${ats.studentFullName}</td> 
                   
<tr class="table-primary fs-6">            
<th>Course Name</th>            
<td>${ats.studentCourse}</td>          
</tr>    
               
<tr class="table-primary fs-6">            
<th>Batch Number</th>            
<td>${ats.batchNumber}</td>          
</tr>          
</tr>   

              
</tbody>       
</table> 
<span class="badge rounded-pill bg-success">Present</span>
<span class="badge rounded-pill bg-warning">Absent</span>
<span class="badge rounded-pill bg-danger">Holiday</span>

<br>           
<form action="studentattendance">         
<input type="text" name="studentid" value="${ats.studentId}" hidden="true">         
         
         <br>
         <div class="progress">
  <div class="progress-bar bg-success" style="width:70%">
    70%
  </div>
  <div class="progress-bar bg-warning" style="width:10%">
    20%
  </div>
  <div class="progress-bar bg-danger" style="width:20%">
    Holiday
  </div>
</div>
         
         
         
         
<div class="d-flex justify-content-center pt-5">         
<button class="btn btn-success btn-sm ">Home</button>         
</div>         
</form>         
</div>   
</div>     
</div> 



</body>
</html>