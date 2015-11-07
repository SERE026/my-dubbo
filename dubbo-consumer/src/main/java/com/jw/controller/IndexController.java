package com.jw.controller;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jw.api.ShopService;
import com.jw.model.Shop;


@Controller
public class IndexController {
	
	private static Logger LOG = LoggerFactory.getLogger(IndexController.class);
	
	public static volatile Map<Object, Object> map = new ConcurrentHashMap<Object, Object>();
	
	@Autowired
	private ShopService shopService;

	/**
	 * 首页测试
	 */
	@RequestMapping("/")
	public String index(HttpServletRequest request) {
		Object referer = request.getHeader("Referer");
		LOG.info("上一个地址来源：{}",referer);
		return "index";
	}

	@ResponseBody
	@RequestMapping("/index")
	public String index(HttpServletRequest request,HttpServletResponse response) {
		Object referer = request.getHeader("Referer");
		LOG.info("上一个地址来源：{}",referer);
		
		List<Shop> list = shopService.getShopList();
		JSONObject json = new JSONObject();
		json.put("shop", list);
		
		return json.toString();
	}
	
}
