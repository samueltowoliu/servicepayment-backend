package com.prisma.servicepaymentbackend.data.repo;

import com.prisma.servicepaymentbackend.data.model.TbMerchant;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TbMerchantRepository extends CrudRepository<TbMerchant, Integer> {
    Optional<TbMerchant> findByEmail(String email);
}
