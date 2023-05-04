package com.ty.springBoot_Item.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.springBoot_Item.dto.Item;

public interface ItemRepo extends JpaRepository<Item, Integer> {

}
