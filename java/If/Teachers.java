public class Teachers {
	public static void main (String[] args){
		System.out.println("教師の名前を入力してください。");
		String name = new java.util.Scanner(System.in, "sjis").nextLine();

		if(name.equals("藤井") || name.equals("ふじい")) {
			System.out.println("情報スペシャリスト学科1年の担任ですね");
	
		}else if(name.equals("宇野") || name.equals("うの")){
			System.out.println("情報スペシャリスト学科2年の担任ですね");
		
		}else if(name.equals("岡本") || name.equals("おかもと")){
			System.out.println("情報スペシャリスト学科3年の担任ですね");

		}else if(name.equals("伊藤") || name.equals("いとう")){
			System.out.println("情報スペシャリストの学科長ですね");

		}else{
			System.out.println("情報スペシャリストの担任ではありません");
		}
	}
}
