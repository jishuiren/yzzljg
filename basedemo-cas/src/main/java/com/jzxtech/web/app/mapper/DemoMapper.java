package com.jzxtech.web.app.mapper;

import com.jzxtech.mybatis.mapper.OracleAdvancedWhereMapper;
import com.jzxtech.web.app.entity.Demo;

public interface DemoMapper extends OracleAdvancedWhereMapper<Demo> {


	public int add(Demo deom);
}
