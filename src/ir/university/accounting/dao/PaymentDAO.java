package ir.university.accounting.dao;

public class PaymentDAO {
    public void addPayment(int projectId, double amount, String date) {

        String sql = " INSERT INTO payments" +
                "(project_id, amount, payment_date)" +
                " VALUES (?, ?, ?)";
    }
}
