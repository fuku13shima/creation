public class MainMonster2{
	public static void main(String[] args){
		int i = 0;
		
		Monster m1 = new Zenigame();
		m1.setName("ゼニガメ");
		m1.setAttacks("みずでっぽう");
		m1.setHp(22);
		
		System.out.println(" ＿＿＿＿＿＿＿＿＿");
		System.out.println("｜あ！　やせいの");
		System.out.println("｜" + m1.getName() + "が　とびだしてきた！");
		System.out.println(" ―――――――――");
		m1.attack();
		
		Monster m2 = new Kameru();
		m2.setName("カメール");
		m2.setAttacks("なみのり");
		m2.setHp(42);
		
		System.out.println(" ＿＿＿＿＿＿＿＿＿");
		System.out.println("｜あ！　やせいの");
		System.out.println("｜" + m2.getName() + "が　とびだしてきた！");
		System.out.println(" ―――――――――");
		m2.attack();
		
		Monster m3 = new Kamekkusu();
		m3.setName("カメックス");
		m3.setAttacks("ハイドロポンプ");
		m3.setHp(102);
		
		System.out.println(" ＿＿＿＿＿＿＿＿＿");
		System.out.println("｜あ！　やせいの");
		System.out.println("｜" + m3.getName() + "が　とびだしてきた！");
		System.out.println(" ―――――――――");
		m3.attack();
		
		System.out.println(" ＿＿＿＿＿＿＿＿＿");
		System.out.println("｜ジムリーダーの　ルリナが");
		System.out.println("｜しょうぶを　しかけてきた！");
		System.out.println(" ―――――――――");
		
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
						am.setName("ゼニガメ") ;
						am.setAttacks("みずでっぽう");
						am.setHp(30);
						break;
					case 1:
						am.setName("タマザラシ");
						am.setAttacks("アイスボール");
						am.setHp(22);
						break;
					case 2:
						am.setName("カメール");
						am.setAttacks("なみのり");
						am.setHp(66);
						break;
					case 3:
						am.setName("アシレーヌ");
						am.setAttacks("うたかたのアリア");
						am.setHp(130);
						break;
					case 4:
						am.setName("カメックス") ;
						am.setAttacks("ハイドロポンプ");
						am.setHp(262);
						break;
					case 5:
						am.setName("ウッウ");
						am.setAttacks("はきだす");
						am.setHp(155);
				}
			am.attack();
			i++;
		}
	}

}