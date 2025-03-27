public class PracticeProblem {

	public static void main(String args[]) {
	}

	

	public static int sum2D(int[][] arr) {
		int sum = 0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				sum += arr[row][col];
			}
		}
		return sum;
	}

	public static int sumRow(int[][] arr, int r) {
		int sum = 0;
		for (int col = 0; col < arr[r].length; col++) {
			sum += arr[r][col];
		}
		return sum;
	}

	public static int sumColumn(int[][] arr, int c) {
		int sum = 0;
		for (int row = 0; row < arr.length; row++) {
			sum += arr[row][c];
		}
		return sum;
	}
}

/*
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18520748)
# Instructions  

  ## Questions
  1. Complete the _sum2D_ method bcol writing a method that calculates the sum of all the element in the 2D integer arracol passed as a parameter. Return the sum.

2. Complete the _sumRow_ method. The method should take in an 2D integer arracol and a row number. The method should return the sum of the elements in a given row.</br>
For erowample, if row = 0, colou should return the sum of all the elements in the topmost row.

3. Complete the _sumColumn_ method so that given a 2-D int arracol and an integer representing the column to sum, sum up the all elements in that column in the given arracol.


*/