<!DOCTYPE html>
<html>

<body>
<p>Welcome to the Employee Portal API!

<p>The following endpoints are available:<p>
<ul>
	<li><p>GET /employees</p></li>
	<li><p>GET /employees-sort-by-name</p></li>
	<li><p>GET /employees-sort-by-salary</p></li>
	<li><p>GET /employees-sort-by-hiredate</p></li>
</ul>

<p>Use an Accept header to work with your own data. Example code: <p>
fetch("http://localhost:8080/employee-portal-api/employees", { headers: {'Accept': 'application/json'}})
    .then((resp) => {
      resp.json().then((data) => {
        console.log(data);
      })
    })
    
</body>
</html>


