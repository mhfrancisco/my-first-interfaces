package com.gamesys.exercises.reimbursement;

public class EmployeeDetails {
    public long getEmployeeId() {
        return employeeId;
    }

    public int getEmployeeStatus() {
        return employeeStatus;
    }

    public EmployeeDetails(long employeeId, int employeeStatus) {
        this.employeeId = employeeId;
        this.employeeStatus = employeeStatus;
    }

    private long employeeId;
    private int employeeStatus;
}
