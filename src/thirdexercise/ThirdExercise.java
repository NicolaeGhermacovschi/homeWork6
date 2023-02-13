package thirdexercise;

import java.util.Random;

public class ThirdExercise {
	private int arr[] = new int[50];
	
	
	
	public ThirdExercise() {

	}

	public ThirdExercise(int[] arr) {
		this.arr = arr;
	}


	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	public void insertArr() {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void copyArray() {
		int arrCopy[] = new int[arr.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			arrCopy[k] = arr[i];
			k++;
		}
		
		System.out.println("\nCopy Arr");
		for (int i = 0; i < arrCopy.length; i++) {
			System.out.print(arrCopy[i] + " ");
		}
	}
	
	

}
