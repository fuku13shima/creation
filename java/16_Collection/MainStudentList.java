import java.util.*;

public class MainStudentList{
	public static void main(String args[]){
		List<StudentList> sList = new ArrayList<>();
		sList.add(new StudentList());
		sList.get(0).no = 1;
		sList.get(0).name = "あおき";
		sList.get(0).score.put("概論Ⅰ",12);
		sList.get(0).score.put("ペン字",26);
		sList.get(0).score.put("アルゴ",16);
		
		sList.add(new StudentList());
		sList.get(1).no = 2;
		sList.get(1).name = "あさの";
		sList.get(1).score.put("概論Ⅰ",36);
		sList.get(1).score.put("ペン字",99);
		sList.get(1).score.put("アルゴ",76);
		
		System.out.println(sList.get(0).no + "番　" + sList.get(0).name+ "　概論Ⅰ：" + sList.get(0).score.get("概論Ⅰ") + "点");
		System.out.println(sList.get(1).no + "番　" + sList.get(1).name + "　概論Ⅰ：" + sList.get(1).score.get("概論Ⅰ") + "点");
		System.out.println(sList.get(0).no + "番　" + sList.get(0).name+ "　ペン字：" + sList.get(0).score.get("ペン字") + "点");
		System.out.println(sList.get(1).no + "番　" + sList.get(1).name + "　ペン字：" + sList.get(1).score.get("ペン字") + "点");
		System.out.println(sList.get(0).no + "番　" + sList.get(0).name+ "　アルゴ：" + sList.get(0).score.get("アルゴ") + "点");
		System.out.println(sList.get(1).no + "番　" + sList.get(1).name + "　アルゴ：" + sList.get(1).score.get("アルゴ") + "点");
	}
}