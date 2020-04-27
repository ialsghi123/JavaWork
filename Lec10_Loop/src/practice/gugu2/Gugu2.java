package practice.gugu2;

public class Gugu2 {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i += 3) {
			for (int j = 1; j <= 9; j++) {
				for (int k = 0; k < 3; k++) {
					if (i + k == 10)
						break;
					System.out.print(i + k + "x" + j + "= " + ((i + k) * j) + "  \t");
				}
				System.out.println();

			}
			System.out.println();
		}

	}

}
