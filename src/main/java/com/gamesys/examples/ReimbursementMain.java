package com.gamesys.examples;

import com.gamesys.examples.employee.EmployeeDetailsProviderImpl;
import com.gamesys.examples.payout.PayoutManagerImpl;
import com.gamesys.examples.reimbursable.ReimbursableProviderImpl;
import com.gamesys.examples.reimbursement.ReimbursementRequest;
import com.gamesys.examples.reimbursement.ReimbursementResult;
import com.gamesys.examples.reimbursement.ReimbursementService;
import com.gamesys.examples.reimbursement.ReimbursementServiceImpl;

public class ReimbursementMain {
    public static void main (String[] args){
        ReimbursementService reimbursementService = new ReimbursementServiceImpl(
                new EmployeeDetailsProviderImpl(),
                new ReimbursableProviderImpl(),
                new PayoutManagerImpl()
        );
        ReimbursementRequest request = new ReimbursementRequest(1L, 11000.0, 1L);
        ReimbursementResult result = reimbursementService.reimburse(request);
        System.out.println("approved: " + result.isApproved());
        System.out.println("approvedAmount: " + result.getApprovedAmount());
    }
}
