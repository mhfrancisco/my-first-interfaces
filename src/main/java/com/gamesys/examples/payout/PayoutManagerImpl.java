package com.gamesys.examples.payout;

public class PayoutManagerImpl implements PayoutManager {


    @Override
    public PayoutResult payoutEmployee(PayoutRequest payoutRequest) {
        PayoutResult payoutResult = new PayoutResult();
        payoutResult.setPayoutStatus(1);
        payoutResult.setAmount(payoutRequest.getAmount());
        payoutResult.setEmployeeId(payoutRequest.getEmployeeId());
        return payoutResult;
    }
}
