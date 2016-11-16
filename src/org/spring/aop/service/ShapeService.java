package org.spring.aop.service;

import org.spring.aop.aspect.Loggable;
import org.spring.aop.model.Circle;
import org.spring.aop.model.Triangle;


public class ShapeService {
	private Triangle triangle;
	@Loggable
	private Circle  circle;
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	

}
