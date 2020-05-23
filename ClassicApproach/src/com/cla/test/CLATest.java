package com.cla.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cla.bo.Block;
import com.cla.dao.BlockDao;

public class CLATest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cla/common/application-context.xml");
		BlockDao blockdao = context.getBean("blockDao", BlockDao.class);
		List<Block> blocks = blockdao.getBlockByZone("south");
		for (Block block : blocks) {
			System.out.println(block);
		}

	}

}
