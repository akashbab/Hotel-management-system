package com.service;

import com.bean.Payment;
import com.dao.PaymentDao;
public class PaymentService {
    private PaymentDao paymentDAO = new PaymentDao();

    public boolean processPayment(Payment payment) {
        return paymentDAO.processPayment(payment);
    }
}
