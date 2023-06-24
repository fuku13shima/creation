public class DecToBin {
	public static void main (String[] args) {

	System.out.println("2進数に変換したい10進数の整数を入力してください");
	System.out.println(" ");
	int dec = new java.util.Scanner(System.in).nextInt();
	System.out.println(" ");
	

		while(dec >= 1 ){
			int sur = dec%2;
			dec /= 2;

			System.out.println("  2 │ " + dec + " … " + sur);
			System.out.println("     ￣￣");

			
		}
	}
}