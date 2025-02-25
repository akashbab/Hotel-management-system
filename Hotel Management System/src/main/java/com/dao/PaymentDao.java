package com.dao;
import com.bean.Payment;
import com.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PaymentDao {
    public boolean processPayment(Payment payment) {
        String query = "INSERT INTO payments (user_id, booking_id, amount, payment_date) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, payment.getUserId());
            stmt.setInt(2, payment.getBookingId());
            stmt.setDouble(3, payment.getAmount());
            stmt.setString(4, payment.getPaymentDate());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
