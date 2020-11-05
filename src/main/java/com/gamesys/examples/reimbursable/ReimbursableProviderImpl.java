package com.gamesys.examples.reimbursable;

public class ReimbursableProviderImpl implements ReimbursableProvider {

    @Override
    public Reimbursable getReimbursable(long reimbursableId) {
        Reimbursable reimbursable = new Reimbursable();
        reimbursable.setAmount(10000);
        reimbursable.setName("Work from home allowance");
        reimbursable.setReimbursableId(reimbursableId);
        return reimbursable;
    }
}
