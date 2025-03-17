class  Main{
	public static void main(String[] args){
		System.out.println(VersandBerechnen(300));
	}

	public static String VersandBerechnen(int einkaufsPreis){
		var versandkosten = 8;

		if (einkaufsPreis < 150){
			return ""+versandkosten;
		}
		if (einkaufsPreis >= 300){
			return "Geschenk";
		}
		else {
			return "Zwischen 150 und 300";
		}
	}
}