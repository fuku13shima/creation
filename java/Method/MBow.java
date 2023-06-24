public class MBow {
	public static void main(String[] args){ 
		System.out.println("動物の数を数字で入力してください。");
		int cnt = new java.util.Scanner(System.in).nextInt();

		System.out.println("動物の鳴き声を入力してください。");
		String naku = new java.util.Scanner(System.in,"sjis").nextLine();		
		System.out.println(" ");

		bow(cnt, naku);
		
	}

	public static void bow(int cnt, String naku){

		if(cnt == 0 || naku.equals(" ")){
		System.out.println("動物はいません");
		}

		/* 変数nakuに空欄が入力されたときも
			if文を実行するようにしたかったのですが上手くいきませんでした。 */	

		for(; cnt > 0; cnt--){
			System.out.println(naku);
		}


	}
}