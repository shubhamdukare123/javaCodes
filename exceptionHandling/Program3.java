class Demo{
	void m1(){
		System.out.println("In m1");
		m2();
		System.out.println(10/0);
	}

	void m2(){
		System.out.println("In m2");
	}
	public static void main(String[] args){
		System.out.println("Start Main");
		Demo obj = new Demo();
		obj.m1();
		System.out.println("End main");

	}
}
