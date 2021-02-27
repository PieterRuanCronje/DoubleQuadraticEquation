class Main {
	public static void main(String[] args){

		while(true){

			System.out.println("      ENTER ANY 2 EQAUTIONS UP TILL THE SECOND POWER \n" + 
							   "THE PROGRAM WILL RETURN THE QOORDINATES OF THE INTERSECTIONS \n");

			System.out.println("      Equation-A");
			Equation EQUATION_1 = new Equation();


			System.out.println("      Equation-B");
			Equation EQUATION_2 = new Equation();


			Equation.SolveValues(EQUATION_1, EQUATION_2);

		}

	}
}