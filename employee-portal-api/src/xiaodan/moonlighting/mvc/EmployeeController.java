package xiaodan.moonlighting.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

	// need to inject the employee dao
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@ResponseBody
	@GetMapping("/employees")
	public List<Employee> listEmployees() {
		
		// get the employees from the dao
		List<Employee> theEmployees = employeeDAO.getEmployees();
		
		return theEmployees;
	}
	
	@ResponseBody
	@GetMapping("/employees-sort-by-name")
	public List<Employee> listEmployeesSortByName() {
		
		// get the employees from the dao
		List<Employee> theEmployeesSortByName = employeeDAO.getEmployeesSortByName();
		
		return theEmployeesSortByName;
	}
	
	@ResponseBody
	@GetMapping("/employees-sort-by-salary")
	public List<Employee> listEmployeesSortBySalary() {
		
		// get the employees from the dao
		List<Employee> theEmployeesSortBySalary = employeeDAO.getEmployeesSortBySalary();
		
		return theEmployeesSortBySalary;
	}
	
	@ResponseBody
	@GetMapping("/employees-sort-by-hiredate")
	public List<Employee> listEmployeesSortByHiredate() {
		
		// get the employees from the dao
		List<Employee> theEmployeesSortByHiredate = employeeDAO.getEmployeesSortByHiredate();
		
		return theEmployeesSortByHiredate;
	}
	
}
