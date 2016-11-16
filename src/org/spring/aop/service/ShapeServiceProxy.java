package org.spring.aop.service;

import org.spring.aop.aspect.LoggingAspectXLM;
import org.spring.aop.model.Circle;

public class ShapeServiceProxy extends ShapeService {
	public Circle getCircle() {
		new LoggingAspectXLM().loggingAdvice();
		return super.getCircle();
	}

}
