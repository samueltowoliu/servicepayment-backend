package com.prisma.servicepaymentbackend.data.repo;

import com.prisma.servicepaymentbackend.data.model.TbUser;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TbUserRepository extends CrudRepository<TbUser, Integer> {
    Optional<TbUser> findByEmail(String email);
}
