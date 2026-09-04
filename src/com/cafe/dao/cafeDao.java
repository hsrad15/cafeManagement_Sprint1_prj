package com.cafe.dao;

import java.util.List;

import com.cafe.pojo.cafe;


public  interface cafeDao {

	void addcafe(cafe item);
	
	List<cafe> getAllCafe();
	
	void updateCafe(cafe item);
	
	void deleteCafe(int id);
	
	
}
