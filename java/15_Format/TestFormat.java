public class TestFormat{
	public static void main(String[] args){
	//全角日本語のとき
		String s1 = "あ";
		String s2 = "ああ";
		String s3 = "ああああ";
		String s4 = "ああああああああ";
		String s5 = "ああああああああああああああああ";
	
		System.out.printf( "%-5sあ\n",s1);
		System.out.printf( "%-5sあ\n",s2);
		System.out.printf( "%-5sあ\n",s3);
		System.out.printf( "%-5sあ\n",s4);
		System.out.printf( "%-5sあ\n",s5);
		
	//半角アルファベットのとき
		String t1 = "a";
		String t2 = "aa";
		String t3 = "aaaa";
		String t4 = "aaaaaaaa";
		String t5 = "aaaaaaaaaaaaaaaaaaaa";
	
		System.out.printf( "%-20sa\n",t1);
		System.out.printf( "%-20sa\n",t2);
		System.out.printf( "%-20sa\n",t3);
		System.out.printf( "%-20sa\n",t4);
		System.out.printf( "%-20sa\n",t5);
		
	//全角アルファベットのとき
		String u1 = "Ａ";
		String u2 = "ＡＡ";
		String u3 = "ＡＡＡＡ";
		String u4 = "ＡＡＡＡＡＡＡＡ";
		String u5 = "ＡＡＡＡＡＡＡＡＡＡＡＡＡＡＡＡ";
	
		System.out.printf( "%-20sＡ\n",u1);
		System.out.printf( "%-20sＡ\n",u2);
		System.out.printf( "%-20sＡ\n",u3);
		System.out.printf( "%-20sＡ\n",u4);
		System.out.printf( "%-20sＡ\n",u5);
	}
}