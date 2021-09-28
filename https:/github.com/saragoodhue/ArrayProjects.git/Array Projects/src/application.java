
public class application {

	public static void main(String[] args) {
		
		double[] values; 
		
		values = new double[10];
		double total = 0;
		
		values[0] = 8.6;
		values[1] = 2.9;
		values[2] = 6.3;
		values[3] = 4.4;
		values[4] = 3.9;
		values[5] = 2.7;
		values[6] = 11.3;
		values[7] = 8.4;
		values[8] = 1.2;
		values[9] = 5.8;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values[3]);
		System.out.println(values[4]);
		System.out.println(values[5]);
		System.out.println(values[6]);
		System.out.println(values[7]);
		System.out.println(values[8]);
		System.out.println(values[9]);
		
		for(int i=0; i<values.length; i++) {
			total = total + values[i];
		}
		
		double average = total / values.length;
		
		System.out.printf("The average is: " + average);
	}

	}



