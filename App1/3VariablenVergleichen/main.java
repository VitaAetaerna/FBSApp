class Main {

	public static void main(String[] args){

		CheckOrder(1,3,2);
	}

	public static String CheckOrder(int a, int b, int c){
		if (a > b) {
			if (a > c){
				if (c > b){
				System.out.println(""+a+c+b);
				return ""+a+c+b;
				}
				else{
					System.out.println(""+a+b+c);
					return ""+a+b+c;
				}
			}else{
				System.out.println(""+c+a+b);
				return ""+c+a+b;
			}
		}
		else{
			if (b > c){
				System.out.println(""+b+c+a);
				return ""+b+c+a;
			}
			else{
				if (a>c){
					return ""+b+a+c;
				}
				else{
				System.out.println(""+c+b+a);
				return ""+c+b+a;

				}
			}
		}
	}
}