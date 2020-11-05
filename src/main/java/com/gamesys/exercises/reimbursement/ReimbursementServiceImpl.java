package com.gamesys.exercises.reimbursement;

public class ReimbursementServiceImpl implements ReimbursementService {

    private EmployeeDetailsProvider employeeDetailsProvider;
    private ReimbursableProvider reimbursableProvider;
    private PayoutManager payoutManager;

    public ReimbursementServiceImpl(EmployeeDetailsProvider employeeDetailsProvider, ReimbursableProvider reimbursableProvider, PayoutManager payoutManager) {
        this.employeeDetailsProvider = employeeDetailsProvider;
        this.reimbursableProvider = reimbursableProvider;
        this.payoutManager = payoutManager;
    }

    @Override
    public ReimbursementResult reimburse(ReimbursementRequest request) {
        EmployeeDetails employee = employeeDetailsProvider.getEmployeeDetails(request.getEmployeeId());
        double reimbursableAmount = 0.0;
        if (employee.getEmployeeStatus() == 1) {
            Reimbursable reimbursable = reimbursableProvider.getReimbursable(request.getReimbursableId());
            reimbursableAmount = (request.getPurchaseAmount() >= reimbursable.getAmount()) ?
                    reimbursable.getAmount() : request.getPurchaseAmount();
            PayoutRequest payoutRequest = new PayoutRequest(request.getEmployeeId(), reimbursableAmount);
            PayoutResult payoutResult = payoutManager.payoutEmployee(payoutRequest);
            ReimbursementResult result = new ReimbursementResult(true, payoutResult.getAmount());
            return result;
        } else {
            ReimbursementResult result = new ReimbursementResult(false, reimbursableAmount);
            return result;
        }

    }
}
