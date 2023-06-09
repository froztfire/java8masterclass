package java8.groupExercise1.service;

import java8.groupExercise1.model.Employee;
import java8.groupExercise1.util.SortEnum;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    int addEmployee(Employee employee);

    Optional<Employee> getEmployeeByEmployeeNumber(int employeeNumber);

    List<Employee> getEmployeeByFirstName(String firstName, SortEnum sortEnum);

    List<Employee> getEmployeeByLastName(String lastName, SortEnum sortEnum);

    List<Employee> getEmployeeByMiddleName(String middleName, SortEnum sortEnum);

    List<Employee> getEmployeeByHiringDate(String hiringDate, SortEnum sortEnum);

    List<Employee> getAll(SortEnum sortEnum);

    Optional<Employee> deleteEmployeeByEmployeeNumber(int employeeNumber);

}
