public class StudentData{
//生徒名	
	private String name;
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
//アドレス	
	private int add;
	
	public int getAdd(){
		return this.add;
	}
	public void setAdd(int add){
		this.add = add;
	}
//アドレスのコンストラクタ指定
	public StudentData(int add) {
		this.add = add;
	}
	
//次に見に行くデータのアドレス	
	private int nextAdd;
	
	public int getNextAdd(){
		return this.nextAdd;
	}
	public void setNextAdd(int nextAdd){
		this.nextAdd = nextAdd;
	}
	
//前に見たデータのアドレス	
	private int prevAdd;
	
	public int getPrevAdd(){
		return this.prevAdd;
	}
	public void setPrevAdd(int prevAdd){
		this.prevAdd = prevAdd;
	}
	
}