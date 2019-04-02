package cal;

// 반복문을 이용한 factorial 연산
public class ImpeCalculator implements Calculator{
	

	@Override
	public long factorial(long num) {
		long result = 1;
		
		for(long i=1 ; i<= num ; i++) {
			result *= 1;
		}
		
		return result;
	}
}
