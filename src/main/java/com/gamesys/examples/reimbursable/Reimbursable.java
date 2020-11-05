package com.gamesys.examples.reimbursable;

public class Reimbursable {

    private long reimbursableId;
    private double amount;
    private String name;

    public long getReimbursableId() {
        return reimbursableId;
    }

    public void setReimbursableId(long reimbursableId) {
        this.reimbursableId = reimbursableId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
