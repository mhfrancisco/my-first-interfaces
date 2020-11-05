package com.gamesys.exercises.reimbursement;

public class ReimbursementMain {
    public static void main(String[] args) {

        ReimbursementService reimbursementService = new ReimbursementServiceImpl(
                new EmployeeDetailsProviderImpl(),
                new ReimbursableProviderImpl(),
                new PayoutManagerImpl()
        );

        ReimbursementRequest request = new ReimbursementRequest(1L, 10000.0, 1L);
        ReimbursementResult result = reimbursementService.reimburse(request);

        System.out.println("approved: " + result.isApproved());
        System.out.println("approvedAmount: " + result.getApprovedAmount());

    }
}
