package training;

interface I1{
      
      default void run()
      {
    	  System.out.println("default");
      }
      void dis();
       void show();
      void view();
      }
interface I2 extends I1{
	
	default void show()
    {
		I1.super.run();
  	  System.out.println("i2 default");
    }
	
}

class Final implements I1,I2{


	public void dis()
	
	{
		//I1.super.run();
		System.out.println("dis");
	}

	
	public void show() {
		System.out.println("show");
	
	}

	
	public void view() {
		System.out.println("view");
		
	}
}
	


	
	


public class Interface {

	public static void main(String[] args) {
		
		Final f=new Final();
		f.show();
			
		
		
	}

}
