public class isDrink {
	public static void main (String[] args){
		System.out.println("あなたの名前を入力してください。");
		String name = new java.util.Scanner(System.in, "sjis").nextLine();

		System.out.println("あなたの年齢を入力してください。");
		int age = new java.util.Scanner(System.in).nextInt();

			
		if(age >= 20){
			System.out.println("お酒が飲めますね");

		}else{
			System.out.println("お酒はまだですね");
		
			
		}if(age >= 18){
			System.out.println("成人していますね");
		}
	}
}
