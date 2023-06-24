public class Car1 implements Norimono{
	//燃費[km/l]
	private int consum;
	//燃料残量
	private int nokori;
	//満タンの燃料量
	private int full;
	
	public Car1(int consum, int full){
		this.consum = consum;
		this.nokori = 0;
		this.full = full;
	}
	
	//走行距離分燃料を減らす
	public boolean run(int km){
		boolean x = true;
		this.nokori -= km/this.consum;
		if(this.nokori <= 0){
			System.out.println("燃料切れです");
			return x = false;
		}
		return x;
	}
	//残りの燃料、走行可能距離
	public void nokori(){
		System.out.println("残り燃料：" + this.nokori + " L");
		System.out.println("走行可能距離：" + nokori*consum + " km");
	}
	//燃料を満タンにする
	public void refueling(){
		this.nokori = this.full;
		System.out.println("ガソリン満タン：" + nokori + " L");
	
	}
	
	public int getNokori(){
		return this.nokori;
	}
	public void setNokori(int nokori){
		this.nokori = nokori;
	}
	
	public int getFull(){
		return this.full;
	}
	
	

}