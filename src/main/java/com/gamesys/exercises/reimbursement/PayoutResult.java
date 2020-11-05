package com.gamesys.exercises.reimbursement;

public class PayoutResult {
    private long employeeId;
    private double amount;
    private int payoutStatus;

    public PayoutResult(long employeeId, double amount, int payoutStatus) {
        this.employeeId = employeeId;
        this.amount = amount;
        this.payoutStatus = payoutStatus;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public double getAmount() {
        return amount;
    }

    public int getPayoutStatus() {
        return payoutStatus;
    }
}
