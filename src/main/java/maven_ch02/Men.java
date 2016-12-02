package maven_ch02;

public class Men extends Person{

	public void aa() {
		// TODO Auto-generated method stub
		System.out.println("Human Name:" + human_name);
		System.out.println("Person Name:" + person_name);
	}

	public void bb() {
		// TODO Auto-generated method stub
		
	}

	public void cc() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 静态方法是编译器绑定的，虽然与父类的方法签名相同，但是不是父类方法的重写
	 */
	public static void sayHello() {
		System.out.println("Men say hello");
	}

}
