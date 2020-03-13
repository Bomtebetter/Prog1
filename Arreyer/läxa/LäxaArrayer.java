package läxa;

import java.util.Arrays;

public class LäxaArrayer {

	public static void main(String[] args) {

		// 100 tal i intervallet [0-9]
		int[] numbers1 = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};
		int[] numbers2 = new int[100];
		
		// 100 namn
		String[] names = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};
		
		
		System.out.println(Antal7(numbers1));	
		System.out.println("Det finns " + AntalTom(names) + " Toms i names");
		System.out.println("Det finns mest av: " +MostNumbers(numbers1));
		System.out.println("Det finns minst av: " + LeastNumbers(numbers1));
		System.out.println("Namnet Drusilla ligger på plats: " + PlatsDrus(names));
		System.out.println("Summan av alla jämna tal är: " + SumEven(numbers1));
		System.out.println("Det finns: " + AntalTal(numbers1) + " av de olika nummerna");
		System.out.println(BörjaL(names) + " Namn börjar på L");
		System.out.println("Det finns " + Femlånga(names) + " namn som är 5 bokstäver långa");
	}

	/**
	 * Tar och läser av arrayen numbers1 (jag vet att det är jätte onödigt att skapa den andra men orkar inte ändra tillbaka nu)
	 * och ger mig hur många 7:or finns i den
	 * @param numbers1
	 * @return
	 */
	private static int Antal7(int[] numbers1) {
		int sum = 0;
		for (int i = 0; i < numbers1.length; i++) {
			if (numbers1[i] == 7) {
					sum++;
			}
		}
		return sum;
	}
	/**
	 * Tar in names och läser hur många namn som heter Tom. Returnerar hur en intager på hur många toms det finns
	 * @param names
	 * @return
	 */
	private static int AntalTom(String[] names) {
		int sum = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Tom")) {
				sum++;
			}
		}
		return sum;
	}
	/**
	 * Tar in numbers1 och läser hur många av varje siffra finns och returnerar den med flest i formen av en intager
	 * @param numbers1
	 * @return
	 */
	private static int MostNumbers(int[] numbers1) {
		int Most = 0;
		int Max = 0;
		
		for (int i = 0; i < 10; i++) {
			int Amount = 0;
			for (int j = 0; j < numbers1.length; j++) {
				if (numbers1[j] == i) {
					Amount++;
				}
			}
			if (Max <= Amount) {
				Most = i;
				Max = Amount;
			}
		}
		return Most;
	}
	/**
	 * Tar in numbers1 och läser hur många av varje siffra finns och returnerar den med minst i formen av en intager
	 * @param numbers1
	 * @return
	 */
	private static int LeastNumbers(int[] numbers1) {
		int Least = 0;
		int Min = 1111111;
		
		for (int i = 0; i < 10; i++) {
			int Amount = 0;
			for (int j = 0; j < numbers1.length; j++) {
				if (numbers1[j] == i) {
					Amount++;
				}
			}
			if (Amount < Min) {
				Least = i;
				Min = Amount;
			}
		}
		
		return Least;
	}
	/**
	 * Tar in names och letar fram Drusilla och skriver ut på vilken plats i arrayen namnet ligger på och returnerar en int med tlatsen
	 * @param names
	 * @return
	 */
	private static int PlatsDrus(String[] names) {
		int Ant = 0;
		int Pos = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Drusilla")) {
				Pos = Ant;
			}
			Ant++;
		}
		return Pos;
	}
	/**
	 *  Läser in numbers1 tar in alla jämna tal och adderar ihop dem och returnerar en int med det värdet
	 * @param numbers1
	 * @return
	 */
	private static int SumEven(int[] numbers1) {
		int sum = 0;
		for (int i = 0; i < numbers1.length; i++) {
			if (numbers1[i] % 2 == 0) {
				sum = sum + numbers1[i];
			}
		}
		return sum;
	}
	/**
	 * Läser av numbers1 och lägger räknar hur många det finns av varje tal
	 * @param numbers1
	 * @return
	 */
	private static String AntalTal(int[] numbers1){
		int[] antal = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < numbers1.length; j++) {

                if (numbers1[j] == i) {

                    antal[i]++;
                }
            }
        }

        return Arrays.toString(antal);
	}
	/**
	 * Läser in names och tittar vilka som börjar med L och skickar tillbaka en int med hur många namn som började med L
	 * @param names
	 * @return
	 */
	private static int BörjaL (String[] names) {
		int a = 0;
		for (int i = 0; i < names.length; i++) {
			if(names[i].startsWith("L")){
			a++;}
		}
		
		return a;
	}
	/**
	 * Läser in names och tittar vilka namn som är 5 bokstäver långa och skickar tillbaka en int med hur många det är
	 * @param names
	 * @return
	 */
	private static int Femlånga(String[] names) {
		int b = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() == 5) {
				b++;
			}
		}
		return b;
	}
	
}
