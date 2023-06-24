import java.util.*;

public class MapTest{
	public static void main(String[] args){
		int l = 0;
	//半角文字にしたらFormatで揃うよ
		Map<String,Character> seiseki = new HashMap<>();
		seiseki.put("概論１",'A');
		seiseki.put("概論２",'D');
		seiseki.put("概論３",'B');
		seiseki.put("アルゴリズム概論",'D');
		seiseki.put("プログラミング",'D');
		seiseki.put("ペン字",'A');
		
	//Formatの桁数に変数使いたかった（コンパイル〇、表示でエラー）
		for(String key : seiseki.keySet()){
			Character value = seiseki.get(key);
			if(l < key.length()){
				l = key.length();
			}
		}
		
	//Map seisekiに格納された情報を１つずつ取り出す（順序ランダム）
		for(String key : seiseki.keySet()){
			Character value = seiseki.get(key);
			System.out.printf("%-9s %-1c評価",key,value);
			
			if(value == 'D'){
				System.out.print("※" + key + "は不合格です。");
				if(key.startsWith("概論")){
					System.out.println(key + "の担当教員に追試の日程を確認してください。");
				}else{
				System.out.println("");
				}
			}else{
				System.out.println("");
			}
		}

	}
}