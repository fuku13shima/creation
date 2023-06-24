public class UpDownMain{
	public static void main(String[] args){
	
		RandomNum base = new RandomNum();
		RandomNum next = new RandomNum();
		base.choose();
		
		next.choose();
		base.display();
		base.question(base.choose() , next.choose());
		base.display();
	}

}