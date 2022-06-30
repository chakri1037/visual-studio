package training;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str)
	{
		super(str);
	}
}

 class MyException {

	static void check(int age) throws InvalidAgeException
	 {

		if(age<18)
		 throw new InvalidAgeException("age is not valid");
			
		else
			System.out.println("welcome to vote");
		}
	

}
 public class MyOwn extends MyException
 
 {
	 public static void main(String args[])
	 {
		 try
		 {
			 check(16);
		 }
		 catch(InvalidAgeException ex)
		 {
		 System.out.println("expetion occured :"+ex);
		 }
	 }
 }
