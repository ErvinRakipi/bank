package model;

import java.time.LocalDateTime;

public class AccountOperations {

	private int transactionAmount;
	private LocalDateTime dateTime;
	private int transactionID;
	
	public AccountOperations(int transactionID, int transactionAmount, LocalDateTime dateTime) {
		if (transactionAmount == 0)
			throw new RuntimeException("It is not possible to carry out operations with an amount equal to ZERO!");
		this.transactionAmount = transactionAmount;
		this.dateTime = dateTime;
	}

	public int getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	@Override
	public String toString() {
		return "AccountOperations [transactionAmount=" + transactionAmount + ", dateTime=" + dateTime
				+ ", transactionID=" + transactionID + ", getTransactionAmount()=" + getTransactionAmount()
				+ ", getDateTime()=" + getDateTime() + ", getTransactionID()=" + getTransactionID() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
