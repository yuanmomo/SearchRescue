package net.yuanmomo.searchrescue.test;

import net.yuanmomo.searchrescue.web.mapper.UserInfoMapper;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMybatisGeneratorPagingMain {
	private static BeanFactory beanFactory = null;
	private static UserInfoMapper userMapper=null;
	
	public static void main(String args[]){
		beanFactory = new ClassPathXmlApplicationContext("net/yuanmomo/searchrescue/config/ApplicationContext.xml");
		userMapper=beanFactory.getBean(UserInfoMapper.class);
		
		System.out.println(userMapper.hashCode());
		System.out.println(userMapper);
		
		userMapper=null;
		beanFactory = null;
	}
}
