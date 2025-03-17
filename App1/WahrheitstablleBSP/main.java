class Main{

	public static void main(String[] args){
		boolean lustAufLernen = false;
		boolean denktAnPrüfung = false;
		boolean nachtschicht = false;

		if (lustAufLernen && nachtschicht){
			System.out.println("Ganze Vorlesung");
		}

		if (lustAufLernen && !nachtschicht){
			System.out.println("Vorbereitung aber geht in der Pause");
		}

		if (!lustAufLernen && !denktAnPrüfung){
			System.out.println("Keine Vorlesung");
		}

		if (!lustAufLernen && denktAnPrüfung && nachtschicht){
			System.out.println("Ganze Vorlesung");
		}else if (!lustAufLernen && denktAnPrüfung && !nachtschicht)
		{
			System.out.println("Vorbereitung aber geht in der Pause");
		}
	}
}