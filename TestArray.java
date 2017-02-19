
public class TestArray {
	
	public static void main(String args[]) {
		int[] numbers= {1,2,3,4,5};	 
		int[] oddNumbers = new int[numbers.length];
		
		 oddArray(numbers, numbers.length, oddNumbers);
		 System.out.println("Odd Numbers in Array: ");
		 printArray(oddNumbers,oddNumbers.length);
		
	}
	public static void oddArray(int numbers[], int length, int oddNumbers[]) { 
		length--;
		if(length>=0) {
			if((numbers[length] % 2) != 0) { 
				oddNumbers[length] =numbers[length]; 
			}
			oddArray(numbers, length, oddNumbers);
		}				
	}
	public static void printArray(int numbers[], int length) {
		length--;
		if(length>=0) {
			if(numbers[length]!=0)
				System.out.println(numbers[length]);
			printArray(numbers, length); 
		}
	}
	
}
