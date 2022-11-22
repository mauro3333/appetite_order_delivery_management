package com.appetite.appetite_order_delivery_management.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.appetite.appetite_order_delivery_management.entity.Client;

public interface iClientRepository extends JpaRepository<Client, Long> {

    @Override
    // We overide this function because we want to return Project type instead of
    // generic type
    public List<Client> findAll();

}
