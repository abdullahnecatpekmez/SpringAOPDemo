package spring.app;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware ,Shape{
	private List<Point> points;
    private ApplicationContext context=null;
	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}


	public void draw()
	{
		for(Point point:points)
		{
			System.out.println(point.getX()+"test"+point.getY());
		}
	}


	@Required
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context=context;
		
	}


	@Override
	public void setBeanName(String bean) {
		// TODO Auto-generated method stub
		System.out.println("Bean name is:"+bean);
	}
}
