public class Kameru extends Zenigame{
	public void attack(){
		System.out.println("　<" + getName() + "：HP" + getHp() + ">");
		System.out.println("てきの　" + getName() + "の");
		System.out.println(getAttacks() + "　こうげき！");
		System.out.println("");
	}
}