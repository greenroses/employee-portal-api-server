# Employee Portal API Server

## Files
1. `employee-portal.sql`: creates the specific user(moonlighting) and password(moonlighting) and the database required for the program. 
2. `employee-portal-api.war`

## Installation
1. Run `employee-portal.sql` file using the command line in MySQL or through MySQLWorkbench. This will create the specific user, password and the required database for the application.
2. Run `employee-portal-api.war` file in Tomcat by performing the following steps:
   1) Copy the `employee-portal-api.war` file into the `webapps` directory of Tomcat
   2) Start Tomcat
   3) Go to browser and access the following URL 
      `http://localhost:8080/employee-portal-api/`
      Unless modified, the server will use port 8080


## API
Use an Accept header to work with your own data. 
Example code:
`fetch("http://localhost:8080/employee-portal-api/employees", { headers: {'Accept': 'application/json'}})`
    `.then((resp) => {`
      `resp.json().then((data) => {`
        `console.log(data);`
      `})`
    `})`

The following endpoints are available:  

`GET /employees`  
  **USAGE:**   
    Get all of the employees available for the app.   

`GET /employees-sort-by-name`  
  **USAGE:**    
    Get all of the employees sorted by name. 

`GET /employees-sort-by-salary`  
  **USAGE:**    
    Get all of the employees sorted by salary.   

`GET /employees-sort-by-hiredate`  
  **USAGE:**    
    Get all of the employees sorted by hire date.

 
