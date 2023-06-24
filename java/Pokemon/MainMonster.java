public class MainMonster{
	public static void main(String[] args){
		int i = 0;
		
		Monster m1 = new Zenigame();
		m1.name = "ゼニガメ";
		m1.attacks = "みずでっぽう";
		m1.ttype = "みず";
		m1.hp = 22;
		
		System.out.println("あ！　やせいの");
		System.out.println(m1.getName() + "が　とびだしてきた！");
		m1.attack();
		
		Monster m2 = new Kameru();
		m2.name = "カメール";
		m2.attacks = "なみのり";
		m2.type = "みず";
		m2.hp = 42;
		
		System.out.println("あ！　やせいの");
		System.out.println(m2.getName() + "が　とびだしてきた！");
		m2.attack();
		
		Monster m3 = new Kamekkusu();
		m3.name = "カメックス";
		m3.attacks = "ハイドロポンプ";
		m3.type = "みず";
		m3.hp = 72;
		
		System.out.println("あ！　やせいの");
		System.out.println(m2.getName() + "が　とびだしてきた！");
		m3.attack();
		
		System.out.println("――――――――――");
		System.out.println("ジムリーダーの　ルリナが");
		System.out.println("しょうぶを　しかけてきた！");
		
		Monster [] tm = new Monster[6];
		tm[0] = new Zenigame();
		tm[1] = new Zenigame();
		tm[2] = new Zenigame();
		tm[3] = new Zenigame();
		tm[4] = new Zenigame();
		tm[5] = new Zenigame();
		
		for (Monster am : tm ){
				switch (i){
					case 0:
						am.name = "ゼニガメ" ;
						am.attacks = "みずでっぽう";
						break;
					case 1:
						am.name = "タマザラシ" ;
						am.attacks = "アイスボール";
						break;
					case 2:
						am.name = "カメール" ;
						am.attacks = "なみのり";
						break;
					case 3:
						am.name = "アシレーヌ" ;
						am.attacks = "うたかたのアリア";
						break;
					case 4:
						am.name = "カメックス" ;
						am.attacks = "ハイドロポンプ";
						break;
					case 5:
						am.name = "ウッウ" ;
						am.attacks = "はきだす";
				}
			am.attack();
			i++;
		}
	}

}