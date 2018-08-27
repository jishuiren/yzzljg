package com.jzxtech.web.app.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzxtech.web.app.entity.Demo;
import com.jzxtech.web.app.mapper.DemoMapper;
import com.jzxtech.web.app.service.DemoSerivce;

@Service
public class DemoServiceImpl implements DemoSerivce {

	@Autowired
	private DemoMapper demoMapper;

	@Override
	public List<Demo> select() {
		return demoMapper.select();
	}

	@Override
	public List<Demo> select(Map<String, Object> params) {
		return demoMapper.select(params);
	}

	@Override
	public int insert(Demo demo) {
		return demoMapper.insert(demo);
	}

	@Override
	public int add(Demo demo) {
		return demoMapper.add(demo);
	}

}
