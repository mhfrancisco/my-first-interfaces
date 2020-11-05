package com.gamesys.exercises.reimbursement;

public class ReimbursementResult {
    private boolean approved;
    private double approvedAmount;

    public ReimbursementResult(boolean approved, double approvedAmount) {
        this.approved = approved;
        this.approvedAmount = approvedAmount;
    }

    public boolean isApproved() {
        return approved;
    }

    public double getApprovedAmount() {
        return approvedAmount;
    }
}
