import java.util.Scanner;

public class Equation {

	private double SecondPower;
	private double FirstPower;
	private double Constant;

	public Equation(){
		Scanner scan = new Scanner(System.in);

		System.out.println("*** ax^2 + bx + c ***" + "\n");

		System.out.println("Enter the coeffisient of a: ");

		while(true){
			boolean isDouble = scan.hasNextDouble();

			if(isDouble){
				SecondPower = scan.nextDouble();
				break;
			}else{
				System.out.println("ENTER A VALUE OF TYPE DOUBLE");
			}

			scan.nextLine();
		}

		System.out.println("Enter the coeffisient of b: ");
		
		while(true){
			boolean isDouble = scan.hasNextDouble();

			if(isDouble){
				FirstPower = scan.nextDouble();
				break;
			}else{
				System.out.println("ENTER A VALUE OF TYPE DOUBLE");
			}

			scan.nextLine();
		}

		System.out.println("Enter the coeffisient of c: ");

		while(true){
			boolean isDouble = scan.hasNextDouble();

			if(isDouble){
				Constant = scan.nextDouble();
				break;
			}else{
				System.out.println("ENTER A VALUE OF TYPE DOUBLE");
			}

			scan.nextLine();
		}
		
		System.out.println('\n');

	}

	public Equation(double a2, double b2, double c2){
		this.SecondPower = a2;
		this.FirstPower = b2;
		this.Constant = c2;
	}

	public static void SolveValues(Equation a1, Equation b1){

		double a11 = a1.getA();
		double b11 = a1.getB();
		double c11 = a1.getC();

		double x1;
		double x2;
		double y1;
		double y2;
		double x2Original;
		double x1Original;
		double x1iOriginal;

		double x1i;
		double y1i;

		Equation solve = new Equation(a1.getA() - b1.getA(), a1.getB() - b1.getB(), a1.getC() - b1.getC());

		double a = solve.getA();
		double b = solve.getB();
		double c = solve.getC();

		if(a1.getA()!=0.0 || b1.getA()!=0.0){

			double delta = b*b - 4*a*c;

			if(delta>=0){

					x1 = round((-b + Math.sqrt(delta))/(2 * a));
					x2 = round((-b - Math.sqrt(delta))/(2 * a));

					y1 = round((a11*x1*x1) + (b11*x1) + c11);
					y2 = round((a11*x2*x2) + (b11*x2) + c11);

					System.out.println("Equation-A and Equation-B cross at points (" + x1 + ";" + y1 + 
										") and (" + x2 + ";" + y2 + ") \n");
			
			}else{

				x1 = round(-( (b) / (2*a) ));
				x1i = round( (Math.sqrt(-delta)) / (2*a) );

				x1Original = -( (b) / (2*a) );
				x1iOriginal = (Math.sqrt(-delta)) / (2*a) ;

				y1 = round(a11*x1Original*x1Original - a11*x1iOriginal*x1iOriginal  + b11*x1Original + c11);
				y1i = round(2*a11*x1Original*x1iOriginal + b11*x1iOriginal);

				if(x1i<0)
					x1i*=-1;

				if(y1i<0)
					y1i*=-1;

				System.out.println("Equation-A and Equation-B cross at points ( "+x1+" + "+x1i+" i ; "+ y1 + " + "+ y1i + " i ) and ( "
					+x1+" - "+x1i+" i ; "+ y1 + " - "+ y1i + " i ) \n");

			}

		 }else{

		 	x1 = (-c)/(b);
		 	y1 = x1*b11 + c;

		 	if(x1==-0.0)
		 		x1 = 0.0;

		 	System.out.println("Equation-A and Equation-B cross at points ( "+x1+" ; "+y1+" ) \n");

		 }
	}
	public double getA(){
		return this.SecondPower;
	}
	public double getB(){
		return this.FirstPower;
	}
	public double getC(){
		return this.Constant;
	}
	public static double round(double a){
		double b = a * 100;
		int c = (int) b;
		double d = (double) c/100;
		return d;
	}

}