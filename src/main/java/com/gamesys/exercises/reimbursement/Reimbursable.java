package com.gamesys.exercises.reimbursement;

public class Reimbursable {
    private long reimbursableId;
    private double amount;
    private String name;

    public Reimbursable(long reimbursableId, double amount, String name) {
        this.reimbursableId = reimbursableId;
        this.amount = amount;
        this.name = name;
    }

    public long getReimbursableId() {
        return reimbursableId;
    }

    public double getAmount(){
        return amount;
    }
}
