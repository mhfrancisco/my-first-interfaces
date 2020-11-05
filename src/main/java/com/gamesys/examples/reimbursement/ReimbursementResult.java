package com.gamesys.examples.reimbursement;

public class ReimbursementResult {
    private boolean approved;
    private double approvedAmount;

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public double getApprovedAmount() {
        return approvedAmount;
    }

    public void setApprovedAmount(double approvedAmount) {
        this.approvedAmount = approvedAmount;
    }
}
