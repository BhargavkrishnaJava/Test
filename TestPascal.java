import java.util.Scanner;

public class TestPascal {

	public static void main(String[] args) {
		int rows, i, k, count = 1, j;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number of Rows : ");
		rows = scan.nextInt();
		for (i = 0; i < rows; i++) {
			for (k = rows; k > i; k--) {
				System.out.print(" ");
			}
			count = 1;
			for (j = 0; j <= i; j++) {
				System.out.print(count + " ");
				count = count * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

}
