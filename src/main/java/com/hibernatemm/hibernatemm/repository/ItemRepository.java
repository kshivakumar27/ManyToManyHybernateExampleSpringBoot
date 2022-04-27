package com.hibernatemm.hibernatemm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernatemm.hibernatemm.entity.Item;

public interface ItemRepository extends JpaRepository<Item,Integer> {
}
