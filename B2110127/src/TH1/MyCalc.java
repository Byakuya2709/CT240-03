package TH1;

public class MyCalc {
	public MyCalc(){
		
	}
	public int add(int num1, int num2){
		return num1+num2;
	}
	public int sub(int num1, int num2){
		return num1-num2;
	}
	public int mul(int num1, int num2){
		return num1*num2;
	}
	public int div(int num1, int num2){
		if (num2==0)
			throw new ArithmeticException("div by zero");
		return num1/num2;
	}
	public int min(int num1, int num2){
		if (num1==num2) return num1;
		else
			if (num1>num2) return num2;
			else
				return num1;
	}
	public int max(int num1, int num2){
		if (num1==num2) return num1;
		else
			if (num1>num2) return num1;
			else
				return num2;
	}
	public boolean equal(int num1, int num2){
		return (num1==num2) ? true:false;
	}
	public int mux(int num, int exponent){
		return (int)Math.pow(num, exponent);
	}
	public int qrt(int num){
		return num*num;
	}
	public int procession(int x, int d, int n){
		if (d==0 || d <0 )
			throw new ArithmeticException("false");
		return x+(n-1)*d;
		
	}
	public int sumProcession(int x, int d, int n){
		return (n*(x+ procession(x,d,n)))/2;
	}
	public static void main(String arr[]){
		System.out.print(3+2*19);
	}
}
