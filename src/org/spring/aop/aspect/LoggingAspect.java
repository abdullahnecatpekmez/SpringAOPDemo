package org.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allGetters()&&allCircleMethod()")
	public void loggingAdvice(JoinPoint joinPoint)
	{
		System.out.println(joinPoint.toString());
	}
	@Before("allGetters()")
	public void secondAdvice()
	{
		System.out.println("Second method called");
	}
	@AfterReturning(pointcut="args(name)",returning="returnString")
	public void stringArgmentsMethods(String name,String returnString)
	{
		System.out.println("A method that takesString arguments has been called.The value is: "+name+"The output is :"+returnString);
	}
	@AfterThrowing(pointcut="args(name)",throwing="ex")
	public void exeptionAdvice(String name,Exception ex)
	{
		System.out.println("An exeception: "+ex);
	}
	@Around("@annotation(org.spring.aop.aspect.Loggable)")
	public Object myAroundAdvice(ProceedingJoinPoint projessingJoint)
	{
		Object returnValue=null;
		try {
			System.out.println("Before Advice");
			returnValue=projessingJoint.proceed();
			System.out.println("After running");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
		System.out.println("Finally Advice");
		return returnValue;
	}
	@Pointcut("execution(public * get*(..))")
	public void allGetters(){}
	
	@Pointcut("within(org.spring.aop.model.Circle)")
	public void allCircleMethod(){}
}
