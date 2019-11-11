package methodlibrary;

import java.util.Scanner;

public class methodLibrary {

	public static Void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(FahTillKel(3));
		System.out.println(KTillC(2));
		
		
		/**
		 * Får in värdet av Fahrenheit som görs om till kelvin
		 * @param fahrenheit
		 * @return kelvin
		 */
		public static double FahTillKel(double fahrenheit) {
			System.out.println("Skriv in Fahrenheit och få det i Kelvin");
			Scanner input = new Scanner(System.in);
			double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
			return kelvin;
			
		}
		
		/**
		 * Får in värdet av Kelvin som görs om till celsius
		 * @param kelvin
		 * @return celsius
		 */
			public static double KTillC(double kelvin) {
			System.out.println("Skriv in Kelvin och få det i Celsius");
			Scanner input = new Scanner(System.in);
			double celsius = kelvin - 273.15;
			return celsius;
		}
		
	}
}
