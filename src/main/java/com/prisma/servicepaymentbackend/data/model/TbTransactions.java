package com.prisma.servicepaymentbackend.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.DateTimeException;

@Entity
public class TbTransactions {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private DateTimeException created_dt;
    private DateTimeException transaction_date;
    private Double checkout_amount;
    private String merchant_name;
    private String payment_method;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DateTimeException getCreated_dt() {
        return created_dt;
    }

    public void setCreated_dt(DateTimeException created_dt) {
        this.created_dt = created_dt;
    }

    public DateTimeException getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(DateTimeException transaction_date) {
        this.transaction_date = transaction_date;
    }

    public Double getCheckout_amount() {
        return checkout_amount;
    }

    public void setCheckout_amount(Double checkout_amount) {
        this.checkout_amount = checkout_amount;
    }

    public String getMerchant_name() {
        return merchant_name;
    }

    public void setMerchant_name(String merchant_name) {
        this.merchant_name = merchant_name;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {this.payment_method = payment_method;}
}
