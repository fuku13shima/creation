public abstract class Monster{
	private String name;
	private String type;
	private String attacks;
	private int hp;
	
	public abstract void attack();
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getType(){
		return this.type;
	}
	
	public String getAttacks(){
		return this.attacks;
	}
	public void setAttacks(String attacks){
		this.attacks = attacks;
	}
	
	public int getHp(){
		return this.hp;
	}
	public void setHp(int hp){
		this.hp = hp;
	}
}