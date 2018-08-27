package com.jzxtech.web.app.service;

import java.util.List;
import java.util.Map;

import com.jzxtech.web.app.entity.Demo;

public interface DemoSerivce {

	List<Demo> select();

	int insert(Demo demo);
	
	int add(Demo demo);

	List<Demo> select(Map<String, Object> params);

}
