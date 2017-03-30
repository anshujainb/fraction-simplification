
public class Airthmetic  {
	int result=0;
	
 public int Add(int...num){
	 for(int x:num){
		 result+=x;
	 }
	 return result;
 }
 public void Simplify(int num1, int num2){
	 try{
		 if(num2==0){
			 throw new ZeroDivisorException(); 
		 }
		 else{
		 int max;
		 if (num1>num2){
			 max=num1;
		 }
		 max=num2;
		 System.out.println("max is:"+max);
		 for(int i=max; i>0; i--){
			 if(num1%i==0 && num2%i==0){
				 num1=num1/i;
				 num2=num2/i;
			 }
		 }
		 System.out.println("numerator:"+num1+"  "+"Denominator is:"+num2);
		 }
	 } 
 
 catch(ZeroDivisorException e){
	 System.out.println(e.getMessage());
 }
 
 }
 
public static void main(String[] args) {
	Airthmetic A=new Airthmetic();
	A.Simplify(8, 24);
}
}
