package aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

// 공통기능
@Aspect
public class ExeTimeAspect {
	
	// advice가 적용된부분
	// cal pakage 와 그 하위 pakage에 위치한 public method를  PointCut로 지정
	@Pointcut("execution(public * cal..*(..))")
	private void publicTarget() {
	}

	// around advice (=세부공통기능)
	@Around("publicTarget()")
	public Object measure(ProceedingJoinPoint joinPoint) throws Throwable{

		long start = System.nanoTime();
		
		try {
			Object result = joinPoint.proceed();
			return result;
			
		}finally {
			
			long finish = System.nanoTime();
			Signature sig = joinPoint.getSignature();
			
			// 출력
			System.out.printf("%s,%s(%s) 실행시간 : %d ns \n",
					joinPoint.getTarget().getClass().getSimpleName(),
					sig.getName(),
					Arrays.toString(joinPoint.getArgs()),
					(finish - start));
		}	
	} // measure() END
}// ExeTimeAspect END
