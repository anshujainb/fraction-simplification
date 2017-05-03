
public class StringZeroException extends Exception {
	public StringZeroException(String Msg){
		System.out.println(Msg);
	}
	public StringZeroException(){
		System.out.println("string cannot be zero");
	}

}
