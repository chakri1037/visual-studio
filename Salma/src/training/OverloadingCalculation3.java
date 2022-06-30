package training;

class OverloadingCalculation3{  
	  void sum(float a,float b){System.out.println("a method invoked");}  
	  void sum(long a,long b){System.out.println("b method invoked");}  

	  public static void main(String args[]){  
	  OverloadingCalculation3 obj=new OverloadingCalculation3();  
	  obj.sum(20,20);//now ambiguity  
	  }  
	}  
