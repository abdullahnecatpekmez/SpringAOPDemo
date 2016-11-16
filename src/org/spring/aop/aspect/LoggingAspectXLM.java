package org.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspectXLM {

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
	public void loggingAdvice()
	{
		System.out.println("logging from Advice");
	}
}
