package com;

import com.testBean.MyTestBean;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest
{
	@Test
	public void test_beanLoad() {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean) beanFactory.getBean("myTestBean");
		assertEquals("testStr", bean.getTestStr());
	}
}