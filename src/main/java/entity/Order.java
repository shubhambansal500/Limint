package entity;

import com.opencsv.bean.CsvBindByName;

public class Order {
    @CsvBindByName(column = "OrderID")
    private String orderId;

    @CsvBindByName(column = "amount")
    private String amount;

    @CsvBindByName(column = "currency")
    private String currency;

    @CsvBindByName(column = "comment")
    private String comment;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
