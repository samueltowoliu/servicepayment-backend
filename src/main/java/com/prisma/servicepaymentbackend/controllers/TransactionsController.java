package com.prisma.servicepaymentbackend.controllers;

import com.prisma.servicepaymentbackend.data.model.TbMerchant;
import com.prisma.servicepaymentbackend.data.model.TbTransactions;
import com.prisma.servicepaymentbackend.services.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = {"/transaction"})
public class TransactionsController {
    @Autowired
    TransactionsService transactionsService;

    @RequestMapping(value = "/submit-trx", method = RequestMethod.POST, produces = "application/json")
    public Map submitTrx(@RequestBody Map bodyRequest) {
        Map response = new HashMap();
//        1.1. Terima request
        String amount = bodyRequest.get("amount").toString();
        String transactionDate = bodyRequest.get("transaction_date").toString();
        String paymentMethod = bodyRequest.get("payment_method").toString();
        String merchantName = bodyRequest.get("merchant_name").toString();

        response = transactionsService.submitTrx(amount, transactionDate, paymentMethod, merchantName);
        return response;
    }
}
