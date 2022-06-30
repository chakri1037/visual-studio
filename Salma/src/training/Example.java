package training;
class Example2{
	 int a=10;
	public void dis()
	{
	    a=a+5;
		System.out.println(a);
	}
	public void show()
	{
		System.out.println(a);
	}
}
public class Example {

	public static void main(String[] args) {
		Example2 ex=new Example2();
		ex.show();
		ex.dis();
		ex.show();

	}

}
