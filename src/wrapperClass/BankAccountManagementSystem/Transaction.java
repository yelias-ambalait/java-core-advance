package wrapperClass.BankAccountManagementSystem;

import java.util.Date;

public class Transaction {
    private Integer transactionId;
    private Integer accountNumber;
    private Double transactionAmount;
    private Date date;
    private String type;

    public Transaction(Integer transactionId, Integer accountNumber, Double transactionAmount, Date date, String type) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionAmount = transactionAmount;
        this.date = date;
        this.type = type;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }
}
