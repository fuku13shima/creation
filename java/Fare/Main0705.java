public class Main0705{
	public static void main(String[] args){
		
		FareTable ft = new FareTable();
		for(int i = 0; i < args.length; i += 2){
			ft.calc(args[i] , args[i + 1]);
		}
		int cnt = args.length / 2;
		System.out.println("乗車履歴" + cnt);
		System.out.println("Fare:\\" + ft.getTotal());
	}
}