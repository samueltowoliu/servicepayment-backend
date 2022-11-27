package com.prisma.servicepaymentbackend.controllers;

import com.prisma.servicepaymentbackend.data.model.TbMerchant;
import com.prisma.servicepaymentbackend.data.model.TbTransactions;
import com.prisma.servicepaymentbackend.data.repo.TbMerchantRepository;
import com.prisma.servicepaymentbackend.data.repo.TbTransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

public class TransactionsController {

    @Autowired
    TbTransactionsRepository tbTransactionsRepository;

    @RequestMapping(value = "/create-transactions", method = RequestMethod.POST, produces = "application/json")
    public Map createMerchant(@RequestBody Map bodyRequest) {
        TbTransactions tbTransactions = new TbTransactions();
        tbTransactions.setCreated_dt(bodyRequest.get("created_dt").toString());
        tbTransactions.setTransaction_date(bodyRequest.get("transaction_date").toString());
        tbTransactions.setCheckout_amount(bodyRequest.get("checkout_amount").toString());
        tbTransactions.setMerchant_name(bodyRequest.get("merchant_name").toString());
        tbTransactions.setPayment_method(bodyRequest.get("payment_method").toString());
        System.out.println("payment_method="+tbTransactions.getPayment_method());

        tbTransactions = tbTransactionsRepository.save(tbTransactions);

        Map response = new HashMap();
        response.put("data", tbTransactions);
        return response;
    }
}
