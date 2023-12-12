package java_programs;

public class remove_Junk_Character_From_string {
public static void main(String[] args) {
	  String s = "sElenium123@3$%#";
	  
	  String s1 = s.replaceAll("[^A-Z0-9$%#]", " ");
	  System.out.println(s1);
}
}
