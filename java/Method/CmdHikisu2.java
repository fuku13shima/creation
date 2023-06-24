public class CmdHikisu2 {
	public static void main(String[] args){

		printName(args);

	}

	public static void printName(String[] args){

		for(int i = 0; i < args.length; i++){
			if(args[i].equals("藤井")){
				System.out.println("スぺ一年");
			}else if(args[i].equals("宇野")){
				System.out.println("スぺ二年");
			}else {

				System.out.println(args[i]);
			}
		}


	}	

}