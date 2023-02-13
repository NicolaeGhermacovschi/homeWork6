package Application;

import firstexercise.FirstExercise;
import secondexrcise.SecondExrcise;
import thirdexercise.ThirdExercise;

public class App {

	public static void main(String[] args) {
		System.out.println("============= EX 1 =============");
		FirstExercise exF = new FirstExercise();
		exF.insertArr();
		System.out.println("\n============= EX 2 =============");
		SecondExrcise exS = new SecondExrcise();
		exS.insertArr();
		exS.calculArr();
		exS.caluclParImpar();
		exS.insertMatrix();
		exS.calculMatrix();
		exS.caluclMatrixParImpar();
		
		System.out.println("============= EX 3 =============");
		ThirdExercise exT = new ThirdExercise();
		exT.insertArr();
		exT.copyArray();
	}

}
