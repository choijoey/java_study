package algo_study;

public class factorial {

	//이코테 132pg 팩토리얼 재귀
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=4;
		
		int ans1 = factorial(num);
		
		System.out.println("재귀로 팩토리얼 연산 결과"+ans1);
		
		
		int ans2=1;
		
		for(int i =1; i<=num;i++ ) {
			ans2*=i;
		}
		System.out.println("반복문으로 팩토리얼 연산 결과 "+ans2);
		
	}

	
	static int factorial(int num) {
		
		if(num==1)
			return num;
		
		return num*factorial(num-1);
	}
	
}
