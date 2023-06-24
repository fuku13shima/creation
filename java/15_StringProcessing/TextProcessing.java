import java.util.*;

public class TextProcessing{
	public static void main (String[] args){
		List<String> s1 = new ArrayList<>();
		s1.add ("概論１");
		s1.add ("概論２");
		s1.add ("概論３");
		s1.add ("アルゴリズム概論");
		s1.add ("ビジネスアプリケーション");
		
		for (String c1 : s1){
			if(c1.startsWith("概論")){
				System.out.println(c1 + "は概論科目です");
			}
		}
		for (String c2 : s1){
			if(c2.contains("概論")){
				System.out.println("\n〇" + c2 + "は主要科目です");
			}else{
				System.out.println("\n〇" + c2 + "は副科目です");
			}
		}
	}
}