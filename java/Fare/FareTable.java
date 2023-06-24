public class FareTable{
	int [][] table = {
		{ 0, 350, 420, 600, 710, 830, 990},
		{ 0,   0, 240, 390, 530, 700, 800},
		{ 0,   0,   0, 260, 370, 490, 780},
		{ 0,   0,   0,   0, 300, 450, 600},
		{ 0,   0,   0,   0,   0, 380, 570},
		{ 0,   0,   0,   0,   0,   0, 350},
		{ 0,   0,   0,   0,   0,   0,   0}
	};
	
	int total = 0;
	String busStopName = "ABCDEFG";
	
	int getTotal(){
		return total ;
	}
	void calc(String from, String to){
		int f = busStopName.indexOf(from);
		int t = busStopName.indexOf(to);
		if(f == -1 || t == -1){
			System.out.println("Error");
			return;
		}
		if(f > t){
			int work = f;
			f = t;
			t = work;
		}
		total += table[f][t];
	}
}