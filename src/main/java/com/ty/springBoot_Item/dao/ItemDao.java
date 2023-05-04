package com.ty.springBoot_Item.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.springBoot_Item.Repo.ItemRepo;
import com.ty.springBoot_Item.dto.Item;

@Repository//to connect with database
public class ItemDao {
	
	@Autowired//to inject
	private ItemRepo repo;
	
	public Item saveItem(Item item) {
		return repo.save(item);//acting like persist
	}
	public Item update(int id,Item item) {
		Item item2 = repo.findById(id).get();
		if(item2!=null) {
			item.setId(id);
			return repo.save(item);
		}else {
			return null;
		}
	}
	public Item deleteItem(int id){
		Item item=repo.findById(id).get();
		repo.deleteById(id);
		return item;
	}
	public Item getItemById(int id){
		return repo.findById(id).get();
		}
	public List<Item> getAllItems(){
		return repo.findAll();
	}
}
