package com.appetite.appetite_order_delivery_management.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.appetite.appetite_order_delivery_management.entity.Food;

public interface iFoodRepository extends JpaRepository<Food, Long> {

    @Override
    public List<Food> findAll();

}
