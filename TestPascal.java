import java.util.Scanner;

public class TestPascal {

	public static void triangle(int rows)
	{
		for (int i = 0; i < rows; i++) {
			for (int k = rows; k > i; k--) {
				System.out.print(" ");
			}
			int count = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(count + " ");
				count = count * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number of Rows : ");
		int rows = scan.nextInt();
		triangle(rows);
		
	}

}
