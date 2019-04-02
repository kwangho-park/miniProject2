package aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TimeAspect {

	// pointcut 표현식으로 bean객체를 지정함
	//@Pointcut("bean(print)")
	
	@Pointcut("execution(public * bean..*(..))")
	private void publicTarget() {
	}
	
	@Around("publicTarget()")
	public Object measure(ProceedingJoinPoint joinPoint) throws Throwable{

		long start = System.nanoTime();
		
		try {
			Object result = joinPoint.proceed();
			return result;
			
		}finally {
			long end = System.nanoTime();

			System.out.println("time for process : " + (end - start) + "ns");
			System.out.println("-----------------------------");
		}
	} // measure() END
	
}// PrintAspect END
