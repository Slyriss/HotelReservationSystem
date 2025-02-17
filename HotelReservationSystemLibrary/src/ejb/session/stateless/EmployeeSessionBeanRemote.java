/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionRemote.java to edit this template
 */
package ejb.session.stateless;


import entity.EmployeeEntity;
import java.util.List;
import javax.ejb.Remote;
import util.exception.InvalidLoginCredentialException;

/**
 *
 * @author zchoo
 */
@Remote
public interface EmployeeSessionBeanRemote {
    
    public void createEmployee(EmployeeEntity employee);
    
    public List<EmployeeEntity> viewAllEmployees();

    public EmployeeEntity employeeLogin (String username, String password) throws InvalidLoginCredentialException;

}
