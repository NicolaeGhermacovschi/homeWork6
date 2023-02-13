package secondexrcise;

import java.util.Random;

public class SecondExrcise {
	private int arr[] = new int[50];
	private int matrix[][] = new int[10][10];
	
	
	
	public SecondExrcise() {

	}

	public SecondExrcise(int[] arr, int martix[][]) {
		this.matrix = martix;
		this.arr = arr;
	}


	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
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
	
    public void calculArr() {
	
		int suma = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			suma += arr[i];
		}
		double media = suma / arr.length;
		
		System.out.println("\nSuma = " + suma);
		System.out.println("Media = " + media);	
	}
    public void caluclParImpar() {
    	
		int pare = 0;
		int impare = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				pare++;
		
			} else {
				impare++;
			}
			 
		}
		
		
		// afisre
		System.out.println("\nElemente pare = " + pare);
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " " );
		
			} else {
				System.out.print( "* " );
			}
			 
		}
		System.out.println("\nElemete impare = " + impare);	
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " " );
		
			} else {
				System.out.print( "* " );
			}
			 
		}
		System.out.println("\n");
	}
    
    
    
	public void insertMatrix() {
		Random rand = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				matrix[i][j] = rand.nextInt(10);
			}
		}
			for (int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix.length; j++) {
					System.out.print(matrix[i][j] + " " );
				}
				System.out.println();
			}
	
		
	}
	
    public void calculMatrix() {
	
		int suma = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				 suma += matrix[i][j]; 	
			}
			
		}
		double media = suma / arr.length;
		
		System.out.println("\nSuma = " + suma);
		System.out.println("Media = " + media);	
	}
    public void caluclMatrixParImpar() {
    	
		int pare = 0;
		int impare = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] % 2 == 0) {
					pare++;
				} else {
					impare++;
				}
			}
		}
		
		
		System.out.println("\nElemente pare = " + pare);
		
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] % 2 == 0) {
					System.out.print(matrix[i][j] + " " );
					
				} else {
					System.out.print( "* " );
				}
			}
			System.out.println();
		}
		
		System.out.println("\nElemete impare = " + impare);	
		
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] % 2 != 0) {
					System.out.print(matrix[i][j] + " " );
					
				} else {
					System.out.print( "* " );
				}
			}
			System.out.println();
		}
	}
    
    
    
}
