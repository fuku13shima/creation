public class printNum {
	public static void main (String[] args){
		int num;
		num=10;
		System.out.println(num);
		num=11;
		System.out.println(num);

		int num2;
		num2=33;
		System.out.println(num2);

		System.out.println(" ");
		System.out.println(num+"と"+num2+"を計算");

		int add=num+num2;
		int sub=num2-num;
		int mul=num*num2;
		int div=num2/num;

		System.out.println(" ");
		System.out.println("加算→"+add);
		System.out.println("減算→"+sub);
		System.out.println("乗算→"+mul);
		System.out.println("除算→"+div);

	}
}