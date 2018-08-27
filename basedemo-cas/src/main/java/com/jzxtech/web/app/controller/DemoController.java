package com.jzxtech.web.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jzxtech.web.app.entity.Demo;
import com.jzxtech.web.app.service.DemoSerivce;

@Controller
@RequestMapping
public class DemoController {

	@Autowired
	protected HttpServletRequest request;

	@Autowired
	protected HttpServletResponse response;

	@Autowired
	private DemoSerivce demoSerivce;

	/**
	 * 加载数据方法
	 * 所有用户权限可访问
	 * @param params
	 * @return
	 */
	@RequestMapping
	@ResponseBody
	public Object select(@RequestParam Map<String, Object> params) {
		List<Demo> demos = demoSerivce.select(params);
		return demos;
	}

	/**
	 * 新增数据访问
	 * 仅有ADMIN权限可访问
	 * @param demo
	 * @return
	 */
	@RequestMapping
	@ResponseBody
	public Object insert(Demo demo) {
		int ok = demoSerivce.add(demo);
		Map<String, Object> result = new HashMap<>();
		result.put("success", ok);
		return result;
	}

}
