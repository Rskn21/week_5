package week5;

import java.util.Arrays;

public class week5 {
	public static void main(String[] args) {

	// step 1 : count even numbers to determine new array size
		int[] array1 = new int[] {2,4,6,8,10,11};
		
		int count = 0;
		for (int num : array1) {
			if (num % 2 == 0 ) {
				count++;
			}
		}
		
		// step 2 : array for even number
		int[] evenArray1 = new int[count];
		int index = 0;
		for(int num : array1) {
			if (num % 2 == 0) {
				evenArray1[index++] = num;
			}
		}
		
		//step 3 : print the result
		System.out.println(Arrays.toString(evenArray1));
		
		//find the even numbers sum
		// Declaration programming
		
		int[] array = new int[] {2,4,6,8,10,11};
		int[] evenArray = Arrays.stream(array).filter(a -> a % 2 == 0).toArray();
		System.out.println(Arrays.toString(evenArray));
		
		// more functions
		// sum of even numbers
		
		int sumEven = Arrays.stream(evenArray).sum();
		System.out.println("Sum of even numbers: "+ sumEven);
		
		//count the number of even numbers
		long countEven = Arrays.stream(evenArray).count();
		System.out.println("Number of even numbers: "+ countEven);
		
		// sort the ven numbers
		Arrays.sort(evenArray);
		System.out.println("Sorted even numbers:" + Arrays.toString(evenArray));
		
	};
		
}
