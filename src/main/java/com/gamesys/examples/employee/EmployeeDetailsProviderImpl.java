package com.gamesys.examples.employee;

public class EmployeeDetailsProviderImpl implements EmployeeDetailsProvider {

    @Override
    public EmployeeDetails getEmployeeDetails(long employeeId) {
        EmployeeDetails employee = new EmployeeDetails();
        employee.setEmployeeId(employeeId);
        employee.setEmoployeeStatus(1);
        return employee;
    }
}
