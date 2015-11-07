package com.test;

import java.util.List;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jw.api.ShopService;
import com.jw.model.Shop;

//@RunWith(SpringJUnit4ClassRunner.class)  
//@ContextConfiguration(locations = { "classpath*:/applicationContext.xml"/*, "classpath*:spring/dao-applicationContext.xml"*/ })
public class Consumer {
	public static void main(String[] args) {
		Logger LOG = LoggerFactory.getLogger(Consumer.class);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/spring/*Context.xml","classpath*:/dubbo/shop/*-consumer.xml");
		context.start();
		ShopService shopService = (ShopService)context.getBean("shopService"); // 获取远程服务代理
	   
		List<Shop> list = shopService.getShopList(); 
		
	    System.out.println(list);
	}
}
