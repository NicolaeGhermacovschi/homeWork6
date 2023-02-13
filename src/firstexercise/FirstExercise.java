package firstexercise;

import java.util.Iterator;
import java.util.Random;

public class FirstExercise {
	private int arr[] = new int[50];
	
	
	
	public FirstExercise() {

	}

	public FirstExercise(int[] arr) {

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
	

}
