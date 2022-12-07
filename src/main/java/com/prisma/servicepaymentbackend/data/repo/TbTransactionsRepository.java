package com.prisma.servicepaymentbackend.data.repo;

import com.prisma.servicepaymentbackend.data.model.TbTransactions;
import org.springframework.data.repository.CrudRepository;

public interface TbTransactionsRepository extends CrudRepository<TbTransactions, Integer> {
}
