package wanlong;

import java.util.ArrayList;

public class Demo09 {
	public static void main(String[] args)
		throws Exception{
		int c = '中';
        //UTF-8编码的最后一个字节
        //将字符的最后6位切下来 c & 0x3f
        //拼接最后字节的格式 0x80|c&0x3f
		System.out.println(
				Integer.toBinaryString(c));
		System.out.println(
				Integer.toBinaryString(c&0x3f));
		System.out.println(
				Integer.toBinaryString(
						0x80 |(c & 0x3f)));
		
		int b3 = 0x80|c&0x3f;
		int b2 = 0x80|(c>>>6) & 0x3f;
		int b1 = 0xe0|(c>>>12) & 0xf;
		
		//利用java的字符解码API验证编码的正确性
		byte[] bytes = 
			{(byte)b1, (byte)b2, (byte)b3,
			(byte)b1, (byte)b2, (byte)b3};
        //将bytes按照utf-8规则解码为字符串
		String s=new String(bytes, "utf-8");
		System.out.println(s); //中
		
		int cc =((b1 & 0xf)<<12) | 
				((b2 & 0x3f)<<6) | 
				(b3 & 0x3f);
		char ch = (char)cc;
		System.out.println(ch); 
		
		//ArrayList  list = new ArrayList();
		//list.add(e)
	}
	

}








