package xiaodan.moonlighting.mvc;

/*
import java.util.ArrayList;
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
*/

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
	/* list employees without using database
	@ResponseBody
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ArrayList<Employee> getEmployeeList() {
		Employee employee1 = new Employee();
		employee1.setName("Alice Hanna");
		employee1.setSalary(60000);
		employee1.setHiredate("20160520");
		employee1.setId(1);
		employee1.setEmail("Alice@gmail.com");
		
		Employee employee2 = new Employee();
		employee2.setName("Ryan Florence");
		employee2.setSalary(90000);
		employee2.setHiredate("20161201");
		employee2.setId(2);
		employee2.setEmail("Ryan@gmail.com");
		
		Employee employee3 = new Employee();
		employee3.setName("Gayle Mcdowell");
		employee3.setSalary(100000);
		employee3.setHiredate("20151201");
		employee3.setId(3);
		employee3.setEmail("Gayle@gmail.com");
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

		return employeeList;
	}
	*/
	
	
}
