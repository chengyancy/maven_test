package maven_ch02;

import java.util.Arrays;

public class Demo {
	static String ss;
	String str1;
	
	public static String getName(){
		ss = "df";
		return "CY";
		
	}
	
	public  void getId(){
		ss = "df";
		str1 = "";
	}
	
	public static void main(String[] args) {
		/*Men men1 = new Men();
		Men men2 = new Men();
		Men[] mens = {men1,men2};
		Arrays.sort(mens, new MyCompare<Men>());
		Women women1 = new Women();
		Women women2 = new Women();
		Women[] womens = {women1,women2};
		Arrays.sort(womens);*/
		
		Men women = new Men();
		women.sayHello();
		
		Person peroson = new Men();
		peroson.sayHello();
	}

}
