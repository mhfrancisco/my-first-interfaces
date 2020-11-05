package com.gamesys.exercises.reimbursement;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetailsProviderImpl implements EmployeeDetailsProvider {
    @Override
    public EmployeeDetails getEmployeeDetails(long employeeId) {
        System.out.println(employeeId);
        List<EmployeeDetails> employees = new ArrayList<>();
        employees.add(new EmployeeDetails(1L, 1));
        employees.add(new EmployeeDetails(2L, 0));

        EmployeeDetails employeeDetails = employees.stream()
                .filter(e -> e.getEmployeeId() == employeeId)
                .findFirst()
                .get();
        return employeeDetails;
    }
}
