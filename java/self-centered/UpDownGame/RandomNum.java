import java.util.*;

public class RandomNum{
	ArrayList<String> cardLog = new ArrayList<>();
	String[]  cards = {"「A」" , "「２」" , "「３」" , "「４」" , "「５」" , "「６」" , "「７」" , "「８」" , "「９」" , "「１０」" , "「J」" , "「Q」" , "「K」"};
	String card;
	private int num;
	private int ans;
	int i = 0;
	int cou = 0;
	
	//数値をランダム抽選
	public int choose(){
		this.num = new java.util.Random().nextInt(12);

		cardLog.add(cards[this.num]);
		
		return this.num;
	}
	
	//数値を表示
	public void display(){
		
		for(i = 0 ; i < cardLog.size() ; i++){
		System.out.print("_" + cardLog.get(i));
		}
		this.cou = i - 1;
	}
	
	//アップダウンの質問
	public void question(int base , int next){
		System.out.println(" ");
		System.out.println("Up or Down ?");
		System.out.println("1.Up / 2.Down");
		int ans = new java.util.Scanner(System.in).nextInt();
		if(ans == 1){
			if(base <= next){
				System.out.println("success!");
				System.out.println("\n" + this.cou + "回成功");
			}else if(base > next){
				System.out.println("game over");
				System.out.println("\n 記録" + this.cou + "回");
			}
		}else if(ans == 2){
			if(base >= next){
				System.out.println("success!");
				System.out.println("\n" + this.cou + "回成功");
			}else if(base < next){
				System.out.println("game over");
				System.out.println("\n 記録" + this.cou + "回");
			}
		}else if(ans != 1 && ans != 2){
			
		}
	}

	public int getNum(){
		return this.num;
	}
	public void setNum(int num){
		this.num = num;
	}
	
	public int getAns(){
		return this.ans;
	}
	public void setAns(int ans){
		this.ans = ans;
	}
	
}
