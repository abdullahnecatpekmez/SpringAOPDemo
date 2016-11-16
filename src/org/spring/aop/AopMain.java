package org.spring.aop;

import org.spring.aop.service.FactoryService;
import org.spring.aop.service.ShapeService;
import org.spring.aop.service.ShapeServiceProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		/*ApplicationContext ctx=new ClassPathXmlApplicationContext("springAop.xml");
		ShapeService shapeService=ctx.getBean("shapeService",ShapeService.class);
		//shapeService.getCircle().setNameAndReturn("Dummy name");
//		shapeService.getCircle().setName("Dummy1 name");
		shapeService.getCircle();
		//System.out.println(shapeService.getCircle().getName());
		
		*/
		 FactoryService factoryService= new FactoryService();
		ShapeService shapeService=(ShapeServiceProxy) factoryService.getBean("shapeService");
		shapeService.getCircle();
		 

	}

}
