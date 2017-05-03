
public class ZeroDivisorException extends Exception {
 public ZeroDivisorException (String msg){
	 super(msg);
 }
 public ZeroDivisorException (){
	 super("divisor can't be zero");
 }
 
}
