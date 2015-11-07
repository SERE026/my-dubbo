package com.test;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jw.api.ShopService;
import com.jw.model.Shop;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath*:/applicationContext.xml"/*, "classpath*:spring/dao-applicationContext.xml"*/ })
public class Provider {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/*Context.xml");
		context.start();
		ShopService shopService = (ShopService)context.getBean(ShopService.class); // 获取远程服务代理
	    List<Shop>  list = shopService.getShopList();
	    		
	    System.out.println(list);
	}
}
