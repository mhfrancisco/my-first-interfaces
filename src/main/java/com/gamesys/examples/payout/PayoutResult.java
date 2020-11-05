package com.gamesys.examples.payout;

public class PayoutResult extends PayoutRequest{
    private int payoutStatus;


    public int getPayoutStatus() {
        return payoutStatus;
    }

    public void setPayoutStatus(int payoutStatus) {
        this.payoutStatus = payoutStatus;
    }
}
