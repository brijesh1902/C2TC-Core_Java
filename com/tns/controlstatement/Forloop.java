package controlstatement;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for loop example
		for (int i = 0; i <= 2; i++) {
			System.out.println(i);
		}

		// nested for loop example
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.println(i+"   "+j);
			}
		}

		// enhanced for loop
		int a[] = { 0, 1, 2, 3 };
		for (int i : a) {
			System.out.println(i);
		}

		// continue example
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 5; j++) {
				if (j == 4) {
					continue;
				}
				System.out.println(j);
			}
		}

		// break example
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 5; j++) {
				if (j == 4) {
					break;
				}
				System.out.println(j);
			}
		}

		// infinite loop example
		for(;;){
			System.out.println("Infinite loop");
		}

	}

}
