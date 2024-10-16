package com.cheolhyeon.ecm.repository;

import com.cheolhyeon.ecm.domain.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepository extends JpaRepository<Customer, Long> {
}
