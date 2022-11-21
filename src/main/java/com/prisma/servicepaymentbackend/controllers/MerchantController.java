package com.prisma.servicepaymentbackend.controllers;

import com.prisma.servicepaymentbackend.data.model.TbMerchant;
import com.prisma.servicepaymentbackend.data.repo.TbMerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = {"/merchant"})
public class MerchantController {

    @Autowired
    TbMerchantRepository tbMerchantRepository;

    @RequestMapping(value = "/get-all-merchant", method = RequestMethod.GET, produces = "application/json")
    public Iterable<TbMerchant> getAllMerchant(){
        Iterable<TbMerchant>allMerchant = tbMerchantRepository.findAll();
        return allMerchant;
    }

    @RequestMapping(value = "/by_id/{id}", method = RequestMethod.GET, produces = "application/json")
    public Map getMerchantById(@PathVariable("id") Integer id) {
        Map response = new HashMap();
        TbMerchant tbMerchant = tbMerchantRepository.findById(id).orElse(null);
        response.put("data", tbMerchant);
        return response;
    }

    @RequestMapping(value = "/create-merchant", method = RequestMethod.POST, produces = "application/json")
    public Map createMerchant(@RequestBody Map bodyRequest) {
        TbMerchant tbMerchant = new TbMerchant();
        tbMerchant.setName(bodyRequest.get("name").toString());
        tbMerchant.setEmail(bodyRequest.get("email").toString());
        tbMerchant.setAddress(bodyRequest.get("address").toString());
        System.out.println("address="+tbMerchant.getAddress());



        tbMerchant = tbMerchantRepository.save(tbMerchant);

        Map response = new HashMap();
        response.put("data", tbMerchant);
        return response;
    }
}