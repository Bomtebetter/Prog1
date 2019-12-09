package array;

public class Array2Lektion2 {

	public static void main(String[] args) {

		double[] numbers = new double[20];
		double[] numbers2 = {21, 42.42, 69.69};
		
		int antA = 0;
		
		String[] namn = {"Billskog Gabriel", "Bratland Petter", "Gustafsson Emil", "Erlandsson Malte", "Dahlqvist Ida"};
		
		for (int i = 0; i < namn.length; i++) {
			
			for (int j = 0; j < namn[j].length(); j++) {
				if (namn[j].contains("a")){
					antA++;
				}
				
			}
			
		}
		System.out.println("Antal a:n är" + antA);
	}

}
