package maven_ch02;

public abstract class Person implements Human{
    protected static final String person_name = "person";
	
	public static void sayHello(){
		System.out.println("hello," + human_name);
		System.out.println("person say hello");
	}
}
