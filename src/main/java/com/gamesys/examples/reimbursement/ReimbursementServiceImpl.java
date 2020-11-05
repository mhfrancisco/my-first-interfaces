package com.gamesys.examples.reimbursement;

import com.gamesys.examples.employee.EmployeeDetails;
import com.gamesys.examples.employee.EmployeeDetailsProvider;
import com.gamesys.examples.payout.PayoutManager;
import com.gamesys.examples.payout.PayoutResult;
import com.gamesys.examples.reimbursable.Reimbursable;
import com.gamesys.examples.reimbursable.ReimbursableProvider;

public class ReimbursementServiceImpl implements ReimbursementService {

    private PayoutManager payoutManager;
    private ReimbursableProvider reimbursableProvider;
    private EmployeeDetailsProvider employeeDetailsProvider;

    public ReimbursementServiceImpl(EmployeeDetailsProvider employeeDetailsProvider, ReimbursableProvider reimbursableProvider,
                                    PayoutManager payoutManager){
        this.employeeDetailsProvider = employeeDetailsProvider;
        this.payoutManager = payoutManager;
        this.reimbursableProvider = reimbursableProvider;
    }
    @Override
    public ReimbursementResult reimburse(ReimbursementRequest reimbursementRequest) {
        ReimbursementResult result = new ReimbursementResult();
        EmployeeDetails employeeDetails = employeeDetailsProvider.getEmployeeDetails(1);
        if (1 == employeeDetails.getEmoployeeStatus()) {
            Reimbursable reimbursable = reimbursableProvider.getReimbursable(1);
            double reimbursableAmount = 0;
            if (reimbursementRequest.getPurchaseAmount() > reimbursable.getAmount()) {
                reimbursableAmount = reimbursable.getAmount();
            } else {
                reimbursableAmount = reimbursementRequest.getPurchaseAmount();
            }
            PayoutResult payoutResult = new PayoutResult();
            payoutResult.setAmount(reimbursableAmount);
            payoutResult.setEmployeeId(employeeDetails.getEmployeeId());
            payoutManager.payoutEmployee(payoutResult);

            result.setApproved(true);
            result.setApprovedAmount(reimbursableAmount);
        }

        return result;
    }
}
