import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Number: ");

		int number = scanner.nextInt();
		if (number == 0){
			System.out.println("Can't Divide 0");
			System.exit(0);
		}
		System.out.println(GetDigitCount(number));
		System.out.println(GetCrossSum(number));
	}
	public static String GetDigitCount(int number){
		var counter = 1;
		while(number / 10 != 0)
		{
			counter++;
			number = number / 10;
		}
		return "Digit count: "+counter;
	}

	public static String GetCrossSum(int number){
		int crosssum = 0;
		do {
			crosssum += number % 10;
			number = number / 10;

		}while (number / 10 != 0);
		crosssum += number;
		return "Cross Sum: "+crosssum;
	}
}
