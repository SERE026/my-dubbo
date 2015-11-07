package com.jw.api;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jw.model.Shop;

@Service("com.bs.api.ShopService")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
public class ShopServiceImpl implements ShopService {
	
	private final static Logger LOG = LoggerFactory.getLogger(ShopServiceImpl.class);

	@Override
	public List<Shop> getShopList() {
		List<Shop> list = new ArrayList<Shop>(1);
		Shop s0 = new Shop(1L, "NBA Adidas","peking", "1000001");
		list.add(s0);
		LOG.info("list的长度为：>"+list.size());
		
		Shop s1 = new Shop(1L, "NBA Adidas","peking", "1000001");
		list.add(s1);
		LOG.info("list的长度为：>"+list.size());
		
		Shop s2 = new Shop(1L, "NBA Adidas","peking", "1000001");
		list.add(s2);
		LOG.info("list的长度为：>"+list.size());
		
		Shop s3 = new Shop(1L, "NBA Adidas","peking", "1000001");
		list.add(s3);
		LOG.info("list的长度为：>"+list.size());
		return list;
	}

}
