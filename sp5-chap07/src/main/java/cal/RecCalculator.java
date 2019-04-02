package cal;

// 재귀함수를 이용한 factorial 연산
public class RecCalculator implements Calculator{

	@Override
	public long factorial(long num) {
		if(num ==0) {
			return 1;
		}else {
			return num * factorial(num -1);
		}
	}
}
