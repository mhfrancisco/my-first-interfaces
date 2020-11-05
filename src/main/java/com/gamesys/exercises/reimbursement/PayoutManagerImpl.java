package com.gamesys.exercises.reimbursement;

public class PayoutManagerImpl implements PayoutManager {
    @Override
    public PayoutResult payoutEmployee(PayoutRequest request) {
        PayoutResult payoutResult = new PayoutResult(request.getEmployeeId(), request.getAmount(), 1);
        return payoutResult;
    }
}
