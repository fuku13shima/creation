import java.util.*;

public class SetList{
	public static void main(String[] args){
	//TreeSetで五十音昇順に表示
		System.out.println("〇TreeSet");
		Set<String> listT = new TreeSet<>();
		listT.add("ふじい");
		listT.add("うの");
		listT.add("おかもと");
		
		for(String t : listT){
			System.out.println(t);
		}
			
		
	//HashSetでランダム順に表示
		System.out.println("〇HashSet");
		Set<String> listH = new HashSet<>();
		listH.add("ふじい");
		listH.add("うの");
		listH.add("おかもと");
		
		for(String h : listH){
			System.out.println(h);
		}	
			
		
	//LinkedHashSetで格納順に表示
		System.out.println("〇LinkedHashSet");
		Set<String> listL = new LinkedHashSet<>();
		listL.add("ふじい");
		listL.add("うの");
		listL.add("おかもと");
		
		for(String l : listL){
			System.out.println(l);
		}
	}
}