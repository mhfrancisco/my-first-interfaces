package com.gamesys.exercises.reimbursement;

public class ReimbursementRequest {
    private long reimbursableId;
    private double purchaseAmount;
    private long employeeId;

    public ReimbursementRequest(long reimbursableId, double purchaseAmount, long employeeId) {
        this.reimbursableId = reimbursableId;
        this.purchaseAmount = purchaseAmount;
        this.employeeId = employeeId;
    }

    public long getReimbursableId() {
        return reimbursableId;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public long getEmployeeId() {
        return employeeId;
    }
}
