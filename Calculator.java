import java.util.HashMap;
import java.util.Map;

public class Calculator extends StringZeroException {
	
	public  static void stringInput (String S1, String S2){	
	try{
		if(S2.equals("")){
			throw new StringZeroException("denominator cant be zero");
		}
		
		else if(S1.equals("")){
			System.out.println("0");
			
		}
		else if(S1.equals(S2)){
			System.out.println("1");
		}
		
		else{

			Map<Character,Integer> sortedArray1= new HashMap<>();
			Map<Character,Integer> sortedArray2= new HashMap<>();
			sortedArray1=new Algebra().countRepeat(S1);
			sortedArray2=new Algebra().countRepeat(S2);
			char[] Array1copy=S1.toCharArray();
			char[] Array2copy=S2.toCharArray();
			new Algebra().CheckCommonElement(sortedArray1,sortedArray2,Array1copy,Array2copy);
		}
		
	}
	catch(StringZeroException e){
		System.out.println(e.getMessage());
	}
		
}
		

public static void main(String[] args) {
	
		stringInput("abcd", "abcd");
		
}

}
