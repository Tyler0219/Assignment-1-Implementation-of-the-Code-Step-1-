package com.unit6.springbootunit6.repository;
import com.unit6.springbootunit6.Entity.orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ordersRepository extends JpaRepository<orders, Integer>{

    
}
