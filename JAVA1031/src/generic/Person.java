package generic;

public class Person { // extends Object
	String name;
	int age;
	
	public Person(String name, int age) {//alt+shift+s+o 파라미터 생성자
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() { // alt+shift+s+v
		return "Person [name = " + name + " , age = " + age + "]";
	}
	
}
