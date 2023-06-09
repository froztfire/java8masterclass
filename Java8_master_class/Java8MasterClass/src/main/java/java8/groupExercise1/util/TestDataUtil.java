package java8.groupExercise1.util;

import java8.groupExercise1.model.Employee;
import java8.groupExercise1.service.EmployeeService;
import java8.groupExercise1.serviceimpl.util.EmployeeServiceImpl;

public class TestDataUtil {
    private TestDataUtil() {}

    public static void generateTestData() {
        EmployeeService employeeService = new EmployeeServiceImpl();

        Employee emp1 =
                Employee.builder()
                        .employeeNumber(20220607)
                        .firstName("Aaron")
                        .hiringDate("2022-06-07")
                        .lastName("Macandili")
                        .middleName("B")
                        .build();

        Employee emp2 =
                Employee.builder()
                        .employeeNumber(20230105)
                        .firstName("Jerome")
                        .hiringDate("2023-01-05")
                        .lastName("Garcia")
                        .middleName("A")
                        .build();

        Employee emp3 =
                Employee.builder()
                        .employeeNumber(20231005)
                        .firstName("Alejandro Jr")
                        .hiringDate("2023-10-05")
                        .lastName("Alinsangan")
                        .middleName("Z")
                        .build();

        employeeService.addEmployee(emp1);
        employeeService.addEmployee(emp2);
        employeeService.addEmployee(emp3);
    }
}
