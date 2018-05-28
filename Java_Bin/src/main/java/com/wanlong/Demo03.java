package wanlong;

/**
 * @author wanlong
 * Date:
 */
public class Demo03 {
    public static void main(String[] args) {
        int n = 0x693ba5e5;
        System.out.println(
                Integer.toBinaryString(n));
        // 将2进制缩写为16进制，并且验证缩写的正确性
        // 01110101 11111101 10101111 01011110
        // 7   5    f   d    a   f    5   e
        n = 0x75fdaf5e;
        System.out.println(
                Integer.toBinaryString(n));
        n = 50;
        System.out.println(
                Integer.toBinaryString(n));
    }
}
