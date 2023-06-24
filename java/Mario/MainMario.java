public class MainMario{
	public static void main(String[] args){
		Mario m2 = new Mario();
		m2.jump();
		m2.dush();
		
		FireMario fm2 = new FireMario();
		fm2.jump();
		fm2.fire();
		
		Mario m2 = new FireMario();
		FireMario fm2 = (FireMario) m2;
		fm2.jump();
		fm2.fire();
		
	}
}