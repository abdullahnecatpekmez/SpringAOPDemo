package org.spring.aop.service;

import org.spring.aop.model.Circle;
import org.spring.aop.model.Triangle;

public class FactoryService {
	public Object getBean(String beanType)
	{
		if(beanType.equals("shapeService")) return new ShapeServiceProxy();
		if(beanType.equals("circle")) return new Circle();
		if(beanType.equals("triagle")) return new Triangle();
		return null;
	}

}
