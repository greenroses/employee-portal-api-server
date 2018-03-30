package xiaodan.moonlighting.mvc;

import java.util.List;

public interface EmployeeDAO {

	public List<Employee> getEmployees();
	
	public List<Employee> getEmployeesSortByName();
	
	public List<Employee> getEmployeesSortBySalary();

	public List<Employee> getEmployeesSortByHiredate();

}
