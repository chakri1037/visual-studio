package training;

class Static extends Object{
	
	int a=10;
 Static()
	{
		
		System.out.println("parent");	
	}
	public void dis()
	{
	
		System.out.println("dis");	
	}
	public void show()
	{
		System.out.println("show");	
	}
}
class Inher extends Static{
	Inher()
	{
		System.out.println("child con");
	}
	public void dis()
	{
		System.out.println(super.a);	
		//super.dis();
		System.out.println("dis");	
	}
	public void show()
	{
		//this.show();
		System.out.println("show");	
	}
}


public class Inheritance {

	public static void main(String[] args) {
     Inher s=new Inher();
	//Static s1=new Static();
	s.show();
	s.dis();
	//s1.show();
	
	

	}

}
