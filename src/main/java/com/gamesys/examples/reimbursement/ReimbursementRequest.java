package com.gamesys.examples.reimbursement;

public class ReimbursementRequest {

    private long reimbursableId;
    private double purchaseAmount;
    private long employeeId;

    public ReimbursementRequest(long reimbursableId,
                                double purchaseAmount,
                                long employeeId){
        this.setEmployeeId(employeeId);
        this.setPurchaseAmount(purchaseAmount);
        this.setReimbursableId(reimbursableId);
    }

    public long getReimbursableId() {
        return reimbursableId;
    }

    public void setReimbursableId(long reimbursableId) {
        this.reimbursableId = reimbursableId;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
}
