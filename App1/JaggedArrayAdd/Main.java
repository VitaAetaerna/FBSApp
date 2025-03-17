public class Main{
	public static void main(String[] args){
		ArrayHandler handler = new ArrayHandler();
		var arr = handler.CreateArray(3);
		System.out.println("");
		handler.AddArray(arr, arr);
	}
}