public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static boolean validIndex(int[] intArray, int index) {
		try {
			int temp = intArray[index];
			return true;

		}
		catch(ArrayIndexOutOfBoundsException e) {
			return false;
		}
	}

	public static int divide(int one, int two) {
		try {
			return one/two;
		} catch(ArithmeticException e) {
			return 0;
		}
		
	}

	public static int safeConvertStringtoInt(String string) {
		try {
			return Integer.parseInt(string);
		} catch (NumberFormatException e) {
			return 0;
		}
		//Write question 3 code here
	}


	public static int sum2D(int[][] arr) {
		int sum = 0;
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
				sum += arr[x][y];
			}
		}
		return sum;
	}

	public static int sumRow(int[][] arr, int r) {
		int sum = 0;
		for (int y = 0; y < arr[r].length; y++) {
			sum += arr[r][y];
		}
		return sum;
	}

	public static int sumColumn(int[][] arr, int c) {
		int sum = 0;
		for (int x = 0; x < arr.length; x++) {
			sum += arr[x][c];
		}
		return sum;
	}
}

/*
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18520748)
# Instructions  

  ## Questions
  1. Complete the _sum2D_ method by writing a method that calculates the sum of all the element in the 2D integer array passed as a parameter. Return the sum.

2. Complete the _sumRow_ method. The method should take in an 2D integer array and a row number. The method should return the sum of the elements in a given row.</br>
For example, if row = 0, you should return the sum of all the elements in the topmost row.

3. Complete the _sumColumn_ method so that given a 2-D int array and an integer representing the column to sum, sum up the all elements in that column in the given array.


*/