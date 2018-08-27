//package com.jzxtech.web.controller;
//
//import java.util.List;
//import java.util.Map;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//
//import com.jzxtech.utils.JsonUtil;
//import com.jzxtech.web.BaseTest;
//
//public class DemoControllerTest extends BaseTest {
//
//	private String baseUrl = "/demo/";
//
//	@Test
//	public void select() throws Exception {
//		String url = baseUrl + "select";
//		MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
//		params.add("rows", "10");
//		params.add("page", "2");
//		params.add("intarray", "2");
//		params.add("intarray", "3");
//		params.add("intarray", "4");
//		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(url).params(params).accept(MediaType.APPLICATION_JSON)).andReturn();
//		int status = mvcResult.getResponse().getStatus();
//		Assert.assertTrue("请求异常，未正常返回200状态码", status == 200);
//
//		String content = mvcResult.getResponse().getContentAsString();
//		List<Map<String, ?>> rst = JsonUtil.Parse2List(content);
//		int size = rst.size();
//		Assert.assertTrue("预期结果不一致 ", size > 0);
//		Assert.assertTrue("预期结果不一致 ", rst.get(0).get("id") != null);
//	}
//
////	@Test
////	public void insert() throws Exception {
////		String url = baseUrl + "insert";
////		MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
////		params.add("createdate", "1988-02-22");
////		params.add("createtime", "2017-08-29 11:30:21");
////		params.add("name", "这个哪个帅哥");
////		params.add("intarray", "2");
////		params.add("intarray", "3");
////		params.add("intarray", "4");
////		params.add("txtarray", "a");
////		params.add("txtarray", "b");
////		params.add("txtarray", "c");
////		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(url).params(params).accept(MediaType.APPLICATION_JSON)).andReturn();
////		int status = mvcResult.getResponse().getStatus();
////		Assert.assertTrue("请求异常，未正常返回200状态码", status == 200);
////
////		String content = mvcResult.getResponse().getContentAsString();
////		Map<String, ?> rst = JsonUtil.Parse2Map(content);
////		int success = (int) rst.get("success");
////		Assert.assertTrue("预期结果不一致 ", success == 1);
////	}
//
//}
