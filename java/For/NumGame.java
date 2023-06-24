public class NumGame {
	public static void main (String [] args){
	System.out.println("【数あてゲーム】");

	int ans = new java.util.Random().nextInt(10);

		for(int i = 1 ; i <= 5 ; i++){
			System.out.println("0～9の数字を入力してください");
			
			int num = new java.util.Scanner(System.in).nextInt();

			if(num == ans){
				System.out.println("アタリ！");
				break;
			} else if (num == ans + 1 || num == ans - 1){
				System.out.println("おしい！");

			} else{
				System.out.println("違います");
			
			}

		}

	System.out.println("ゲームを終了します");


	}

}