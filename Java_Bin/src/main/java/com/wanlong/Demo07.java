package wanlong;

public class Demo07 {
	public static void main(String[] args) {
		int n = -3;
		System.out.println(
				Integer.toBinaryString(n));
		System.out.println(
				Integer.toBinaryString(~n));
		System.out.println(
				Integer.toBinaryString(~n+1));
		int m = ~n+1;
		System.out.println(m);//3
	}
}
