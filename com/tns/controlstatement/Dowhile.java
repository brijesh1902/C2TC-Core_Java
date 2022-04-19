package controlstatement;

public class Dowhile {

	public static void main(String[] args) {
		
		// do while loop
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i <= 10);

		// infinite while loop
		do {
			System.out.println("Infinite loop");
		} while(true);

	}

}
