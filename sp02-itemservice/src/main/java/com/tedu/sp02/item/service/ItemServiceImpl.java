package com.tedu.sp02.item.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.sp01.service.ItemService;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class ItemServiceImpl implements ItemService{

	@Override
	public List<Item> getItems(String orderId) {
		log.info("获取订单的商品列表:"+orderId);
		ArrayList<Item> list=new ArrayList<Item>();
		list.add(new Item(1, "商品1", 1));
		list.add(new Item(2, "商品2", 100));
		list.add(new Item(3, "商品3", 15));
		list.add(new Item(4, "商品4", 12));
		list.add(new Item(5, "商品5", 11));
		return list;
	}

	@Override
	public void decreaseNumbers(List<Item> list) {
		for(Item item:list) {
			log.info("减少商品库存:"+item);
		}
		
	}

}
