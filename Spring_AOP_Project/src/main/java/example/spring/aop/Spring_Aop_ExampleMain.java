package example.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Spring_Aop_ExampleMain {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(SprinAopConfig.class);
	//its object proxy class
	Musician musicianRef= 
			context.getBean(Musician.class);
	musicianRef.perform();
	
	String className=
			musicianRef.getClass().getName();
	System.out.println(className);
	System.out.println("===============================================");
	
	Singer singerRef = context.getBean(Singer.class);
	singerRef.perform();
	 className= singerRef.getClass().getName();
	System.out.println(className);
	System.out.println("===============================================");
	
	Dancer DancerRef = context.getBean(Dancer.class);
	DancerRef.perform();
	 className= DancerRef.getClass().getName();
	System.out.println(className);
}
}
