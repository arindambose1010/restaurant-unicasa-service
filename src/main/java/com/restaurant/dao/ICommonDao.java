package com.restaurant.dao;

import com.restaurant.model.ServiceResponse;

public interface ICommonDao {

	
	ServiceResponse getAllMasterData(String... keyDetails);

	void getAllConfigData();
}
