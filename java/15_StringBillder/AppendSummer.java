public class AppendSummer{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		sb.append("夏休み");
		
		for(int i = 0; i<5000 ; i++){
			sb.append("とても");
		}
		
		sb.append("楽しかった");
	
		System.out.println(sb.toString());
	}
}