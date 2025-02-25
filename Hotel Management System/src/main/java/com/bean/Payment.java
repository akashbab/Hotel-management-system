package com.bean;

public class Payment {
	 private int paymentId;
	    private int userId;
	    private int bookingId;
	    private double amount;
	    private String paymentDate;

	    public Payment() {}

	    public Payment(int paymentId, int userId, int bookingId, double amount, String paymentDate) {
	        this.paymentId = paymentId;
	        this.userId = userId;
	        this.bookingId = bookingId;
	        this.amount = amount;
	        this.paymentDate = paymentDate;
	    }

	    public int getPaymentId() { return paymentId; }
	    public void setPaymentId(int paymentId) { this.paymentId = paymentId; }
	    public int getUserId() { return userId; }
	    public void setUserId(int userId) { this.userId = userId; }
	    public int getBookingId() { return bookingId; }
	    public void setBookingId(int bookingId) { this.bookingId = bookingId; }
	    public double getAmount() { return amount; }
	    public void setAmount(double amount) { this.amount = amount; }
	    public String getPaymentDate() { return paymentDate; }
	    public void setPaymentDate(String paymentDate) { this.paymentDate = paymentDate; }

}
