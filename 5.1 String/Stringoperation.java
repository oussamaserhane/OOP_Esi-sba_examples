public class Stringoperation {  
	public static void main(String ar[]) {  
			String s="oop";
			System.out.println(s.toUpperCase());//OOP
			System.out.println(s);//oop(no change in original)
			System.out.println(s.toLowerCase());//oop
			System.out.println(s.isEmpty());//false
			System.out.println(s.replace('o', 'p'));// ppp
			String edit = s.concat(" lessons");
			System.out.println(edit);// oop lessons
			System.out.println(edit.indexOf('s')); // 6
			}  
}  