package com.gamesys.exercises.reimbursement;

import java.util.ArrayList;
import java.util.List;

public class ReimbursableProviderImpl implements ReimbursableProvider {
    @Override
    public Reimbursable getReimbursable(long reimbursableId) {

        List<Reimbursable> reimburses = new ArrayList<>();
        reimburses.add(new Reimbursable(1l, 1000, "Gym Allowance"));
        reimburses.add(new Reimbursable(2L, 2000, "Phone Allowance"));

        Reimbursable reimbursable = reimburses.stream()
                .filter(r -> r.getReimbursableId() == reimbursableId)
                .findFirst()
                .get();

        return reimbursable;
    }
}
