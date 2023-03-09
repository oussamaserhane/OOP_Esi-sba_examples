class Main{
	public static void main(String args[])  {
		 B obj = new B();
		 obj.methodA(); //calling super class(A) method
		 obj.methodB(); //calling B method
		 
		 C obj1 = new C();
		 obj1.methodA(); //calling super class(A) method
		 obj1.methodC(); //calling C method
     }
}


