package com.gamesys.exercises.reimbursement;

public class PayoutRequest {
    private long employeeId;
    private double amount;

    public PayoutRequest(long employeeId, double amount) {
        this.employeeId = employeeId;
        this.amount = amount;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public double getAmount() {
        return amount;
    }
}
