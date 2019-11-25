package array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] meme1 = { 21, 42, 69, 333, 420, 666, 1337 }; // skapar en array och fyller den med 7 meme tal
		
		int[] meme2 = new int[7]; // skapar en array med 7 tomma lådor

		int[] summa = new int[7];
		
		for (int i = 0; i < meme2.length; i++) { // fyller Array2 med input från konsolen
			meme2[i] = input.nextInt();
		}

		for (int i = 0; i < summa.length; i++) {
			summa[i] = meme1[i] + meme2[i];
		}
		
		for (int i : summa) { // ett annat sätt att använda for loopar i arrayer
			System.out.print(i + ", ");
		}
	/*	
		for (int i = 0; i < meme1.length; i++) { // loopar gemom meme1[] och skriver ut innehållet
			System.out.print(meme1[i] + ", ");

		}
		System.out.println();
		System.out.println(Arrays.toString(meme1));

		for (int i : meme1) { // ett annat sätt att använda for loopar i arrayer
			System.out.print(i + ", ");
		}
*/
	}

}
