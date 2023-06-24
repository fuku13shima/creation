public class MainNorimono{
	public static void main(String[] args){
		
		System.out.println("車１");
		Car1 m1 = new Car1(10, 100);
		m1.refueling();
		m1.run(500);
		m1.nokori();
		m1.run(500);
		
		System.out.println("");
		System.out.println("車２");
		Car1 m2 = new Car1(5, 20);
		m2.refueling();
		while(m2.getNokori() > 0){
			if(m2.run(5)){
			m2.nokori();
			}
		}
		
	}
}