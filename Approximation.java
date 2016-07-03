package quadratwurzel;

public class Approximation {

	//natürliche Zahl p für die Methode rootGreaterThanOne()
	private static int p = 2;
	
	private static int nrOfIterations = 10;
	
	//reele Zahl a zwischen 0 und 1 für die root() 
	private static double a = 0.99999999;
	
	//Quadratwurzel 0 < a < 1
	public static double root(double a, int nrOfIterations) {
		System.out.println("root()");
		
		double approx = a;
		
		for(int i = 0; i < nrOfIterations; i++) {
			
			//Heron Verfahren
			approx = (0.5 * (approx + a / approx));
			
			System.out.println(approx);
		}
		
		System.out.println("\n");
		
		return approx;
	}
	//Quadratwurzel von natürlichen Zahlen
	public static double rootGreaterOne(int p) {
		System.out.println("rootGreaterThanOne()");
		
		double approx = p;
		
		for(int i = 0; i < nrOfIterations; i++) {
			//Heron Verfahren
			approx = ((Math.pow(approx, 2) + p) / (2 * approx));
			System.out.println(approx);
		}
		
		System.out.println("\n");
		
		return approx;
		
	}
	
	public static void main(String[] args) {
		rootGreaterOne(p);
		root(a, nrOfIterations);
	}

}