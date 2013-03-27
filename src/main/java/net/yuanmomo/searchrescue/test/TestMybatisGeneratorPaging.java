package net.yuanmomo.searchrescue.test;

import java.util.List;

import net.yuanmomo.searchrescue.web.bean.BoughtBeacon;
import net.yuanmomo.searchrescue.web.business.BeaconBusiness;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMybatisGeneratorPaging {
	private BeanFactory beanFactory = null;
	private BeaconBusiness beaconBusiness=null;
	
	// Before的含义是在运行这个类中的测试方法的时候，首先会运行这个方法，对一些属性进行初始化，

	// 比如说这里我们是要读取Spring的配置文件，然后初始化Spring的容器以及其它的一些信息

	@Before
	public void setUp() throws Exception {

		beanFactory = new ClassPathXmlApplicationContext("net/yuanmomo/searchrescue/config/ApplicationContext.xml");
		this.beaconBusiness=beanFactory.getBean(BeaconBusiness.class);
	}

	@After
	public void tearDown() throws Exception {
		this.beaconBusiness=null;
		beanFactory = null;
	}

	@Test
	public void saveUserTest() {
		List<BoughtBeacon> list=this.beaconBusiness.queryBoughtBeacon("admin", "2",null,null);
		System.out.println(list);
	}
}
