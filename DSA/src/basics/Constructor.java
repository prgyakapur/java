package basics;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		System.out.println(p2.count);

	}

}

class Person{
	int age;
	static int count;
	
	Person(){
		count++;
		System.out.println("hello");
	}
	
}
