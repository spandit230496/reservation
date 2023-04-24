package com.irctc.reservation.repository;

import com.irctc.reservation.entity.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<FoodOrder,Integer> {
}
