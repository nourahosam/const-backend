package backend.construction.service;

import backend.construction.DAO.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee create(Employee request);
    public List<Employee> getAll();
    public Employee getById(Long id);
}
