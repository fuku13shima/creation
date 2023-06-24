public class Main0726{
	public static void main(String args[]){
//開始アドレス
		int start = 41;
//末尾アドレス
		int last = -1;

//配列に双方向リストでデータを格納
		StudentData[] st=new StudentData[10];

		st[0] = new StudentData(0);
		st[1] = new StudentData(1);
		st[2] = new StudentData(2);
		st[3] = new StudentData(3);
		st[4] = new StudentData(4);
		st[5] = new StudentData(5);
		st[6] = new StudentData(6);
		
			st[0].setName("青木");
			st[0].setAdd(0);
			st[0].setNextAdd(4);
			st[0].setPrevAdd(-2);

			st[1].setName("浅野");
			st[1].setAdd(4);
			st[1].setNextAdd(3);
			st[1].setPrevAdd(-2);
		
			st[2].setName("藤井");
			st[2].setAdd(3);
			st[2].setNextAdd(9);
			st[2].setPrevAdd(41);

			st[3].setName("宇野");
			st[3].setAdd(-2);
			st[3].setNextAdd(-2);
			st[3].setPrevAdd(-2);

			st[4].setName("岡本");
			st[4].setAdd(9);
			st[4].setNextAdd(8);
			st[4].setPrevAdd(3);
		
			st[5].setName("伊藤");
			st[5].setAdd(41);
			st[5].setNextAdd(3);
			st[5].setPrevAdd(-1);

			st[6].setName("しろくま先生");
			st[6].setAdd(8);
			st[6].setNextAdd(-1);
			st[6].setPrevAdd(9);
		
		System.out.println("◎リスト順に名前を表示");
		printList(st,start);
		System.out.println("◎リストの逆順に名前を表示");
		rePrintList(st,last);
	}
	
//名前を表示するメソッド
		public static void printList(StudentData[] st,int add){
			int num = 1;
			
			do{
				for(int i = 0; i < st.length; i++){
					
					if(add == st[i].getAdd()){
						System.out.println(num +st[i].getName());
						add = st[i].getNextAdd();
						num = num+1;
						
						break;
					}
				
				}
			}while(-1 != add);
		}
	
//名前を逆順に表示するメソッド
		public static void rePrintList(StudentData[] st,int seek){
			do{
				
				for(StudentData rs:st){
					if(rs.getNextAdd() == seek){
						System.out.println(rs.getName());
						seek = rs.getPrevAdd();
					}
				}
				
				for(int i = 0; i < st.length; i++){
						if(st[i].getAdd() == seek){
							System.out.println(st[i].getName());
							seek = st[i].getPrevAdd();
							break;
						}
				}
			}while(-1 != seek);
		}

}