
public class StringZeroException extends Exception {
	public StringZeroException(String Msg){
		super(Msg);
	}
	public StringZeroException(){
		System.out.println("string cannot be zero");
	}

}
