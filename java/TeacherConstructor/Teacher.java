public class Teacher{
	String name;
	int age;
	String tannin;
	String kuse;

	public void jikosyoukai(){
		System.out.println("●" + name + "は" + age + "歳で、" + tannin + "の担任です。");
	}

	public void kuchiguse(){
		System.out.println(name + "「" + kuse + "」");
	}

	public void ageQuiz(){
		System.out.println(" ");
		System.out.println("☆年齢当てゲーム☆");
		System.out.println(name + "先生の年齢を当ててみよう！");

		for(int i = 5 ; i > 0 ; i--){
		System.out.println("《残り" + i + "回》");
		int quiz = new java.util.Scanner(System.in).nextInt();

			if(quiz == age){
				System.out.println("あたりです！おめでとう！！");
				break;

			} else if (quiz < age){
				System.out.println("もっと年上です");
				System.out.println(" ");

			} else if (quiz > age){
				System.out.println("もっと若いです");
				System.out.println(" ");			
			} 

			if (i == 1){
				System.out.println("残念でしたー");	
			
			}
		}
	}
}