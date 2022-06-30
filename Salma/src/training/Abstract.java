package training;

abstract class Practice{
  static int a=0;
  public Practice()
  {
	  System.out.println("abstarct");
  }
  static {
	  System.out.println("static block");
  }
  {
	  System.out.println("ana block");
  }
  public void dis()
	{
		System.out.println("dis");
	}
	abstract void show();
	
}
 class Practice1 extends Practice{
	int b;
	public void show()
	{
		super.dis();
		System.out.println("show");
		System.out.println(a);
	}
}
class Practice2 extends Practice{
	int b;
	 public Practice2()
	  {
		  System.out.println(" child abstarct");
	  }
	
	 public void dis()
		{
			System.out.println(" p2 dis");
		}
	public void show()
	{
		System.out.println("p2 show");
		System.out.println(a);
	}
}
public class Abstract {

	public static void main(String[] args) {
		
	Practice2 p=new Practice2();
	//System.out.println(p.a);
	p.show();
	p.dis();
	

	}

}
