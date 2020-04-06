
public class VarArgsTest {
	
	public static double average(double... numbers) {
		double total = 0.0;
		
		//enhanced for to calculate the total
		for(double d: numbers) {
			total += d;
		}
		return total / numbers.length;
	}
	
	

	public static void main(String[] args) {
		double d1 = 10.0;
		double d2 = 20.0;
		double d3 = 30.0;
		double d4 = 40.0;
		
		System.out.printf("d1 = %.1f%n"
				+ "d2 = %.1f%n"
				+ "d3 = %.1f%n"
				+ "d4 = %.1f%n", d1,d2,d3,d4);
		
		//we can only call a static cannot make a static reference to the non-static method average(double[]) from the type VarArgsTest
		System.out.printf("average of d1 and d2 = %.1f%n", average(d1,d2));
		System.out.printf("average of d1 and d2 and d3 = %.1f%n", average(d1,d2,d3));
		System.out.printf("average of d1 and d2 and d3 and d4 = %.1f%n", average(d1,d2,d3,d4));

	}

}
