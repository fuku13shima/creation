public class Main0627{
	public static void main(String[] args){
		Teacher fujii = new Teacher();
		fujii.name = "藤井";
		fujii.age = 36;
		fujii.tannin = "１年生";
		fujii.kuse = "ガシガシ";

		Teacher uno = new Teacher();
		uno.name = "宇野";
		uno.age = 36;
		uno.tannin = "2年生";
		uno.kuse = "ぶるーの";

		Teacher okamoto = new Teacher();
		okamoto.name = "岡本";
		okamoto.age = 23;
		okamoto.tannin = "3年生";
		okamoto.kuse = "23歳だよ";


		fujii.kuchiguse();
		uno.jikosyoukai();
		okamoto.jikosyoukai();
		okamoto.kuchiguse();

		fujii.ageQuiz();

	}
}