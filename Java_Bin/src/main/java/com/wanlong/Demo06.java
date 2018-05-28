package wanlong;

public class Demo06 {
	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;
		System.out.println(
			Integer.toBinaryString(max));
		int min = Integer.MIN_VALUE;
		System.out.println(
			Integer.toBinaryString(min)); 
		max = 0x7fffffff;
		min = 0x80000000;
		int i = 0xffffffff;
		System.out.println(max);
		System.out.println(min);
		System.out.println(i);//-1
 	}
}





