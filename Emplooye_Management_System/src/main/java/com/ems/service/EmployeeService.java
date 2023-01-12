package com.ems.service;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployees(Employee employees);
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(Long id);
    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
