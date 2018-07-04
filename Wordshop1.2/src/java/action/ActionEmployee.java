/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import dal.EmployeeDAO;
import java.util.List;
import model.Employee;

/**
 *
 * @author tuans
 */
public class ActionEmployee extends ActionSupport {
    //a list of employee
    List<Employee> employees;
    public ActionEmployee() {
    }
    
    public String execute() throws Exception {
        employees=new EmployeeDAO().selectAll();
        return SUCCESS;
    }
    //add more function
    public Employee getEmployeeByID(){
        return null;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    
}
