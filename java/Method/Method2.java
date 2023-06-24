public class Method2{
	public static void main(String[] args){

		add(100, 20);
		sub(100, 20);
		mul(100, 20);
		div(100, 20);
	}


	public static void add(int x,int y){
		int ans = x + y;

		System.out.println(x + "+" + y + "=" + ans);
	}


	public static void sub(int x,int y){
		int ans = x - y;

		System.out.println(x + "-" + y + "=" + ans);
	}

	public static void mul(int x,int y){
		int ans = x * y;

		System.out.println(x + "×" + y + "=" + ans);
	}

	public static void div(int x,int y){
		int ans = x / y;
		int sur = x % y;

		System.out.println(x + "÷" + y + "=" + ans + "…" + sur);
	}
}