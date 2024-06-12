package example.spring.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect()

@Component
public class AudiancewithAround {
	@Pointcut("execution(* example.spring.aop.*n*.perform(..))")
	private void myPointCut() {}
	
	
	//point cut expression-->
	
	private void takeSeats() {
		System.out.println("Audiance please take your seats:Around");
	}

	
	private void turnOffMobile() {
		System.out.println("please turn off your mobile:Around");
	}

	
	private void clap() {
		System.out.println("clap clap clap:Around");

	}

	
	private void demandForRefund() {
		System.out.println("please give our money back:Around");
	}

	private void leave() {
		System.out.println("Bye leaving Now!:Around");
	}
	@Around("myPointCut()")
	public void monitarPerformance(ProceedingJoinPoint joinpoint) {
		takeSeats();
		turnOffMobile();
		try {
			joinpoint.proceed();//Proceed to words target
			clap();
		} catch (Throwable e) {
			demandForRefund();
		}
		
		leave();
		
	}
}
