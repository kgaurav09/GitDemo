
public class ClassB extends ClassA {
	
	public void mul()
	{
			System.out.println("mul method");
		
	}
	public void div()
	{
			System.out.println("div method");
		
	}

	public static void main(String[] args) {
		
	ClassB a= new ClassB();
	a.add();
	a.sub();
	a.mul();
	a.div();
	 
	ClassA a1= new ClassA();
	a1.add();
	a1.sub();
	
	//ClassB a2= new ClassA();
	
	ClassA a3= new ClassB();
	a3.add();
	a3.sub();

	}

}
