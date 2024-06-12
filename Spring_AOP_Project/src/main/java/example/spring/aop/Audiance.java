package example.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
public class Audiance {
	@Pointcut("execution(* example.spring.aop.*n*.perform(..))")
	private void myPointCut() {}
	
	
	//point cut expression-->
	@Before("myPointCut()")
	public void takeSeats() {
		System.out.println("Audiance please take your seats");
	}

	@Before("myPointCut()")
	public void turnOffMobile() {
		System.out.println("please turn off your mobile");
	}

	@AfterReturning("myPointCut()")
	public void clap() {
		System.out.println("clap clap clap");

	}

	@AfterThrowing("myPointCut()")
	public void demandForRefund() {
		System.out.println("please give our money back");
	}

	@After("myPointCut()")
	public void leave() {
		System.out.println("Bye leaving Now!");
	}
}
