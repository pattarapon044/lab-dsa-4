package lab.in_class;

public class AlgorithmTest {

	static int[] n1 = { 10000, 20000, 30000, 40000, 50000 };
	static int[] n2 = { 1000, 1100, 1200, 1300, 1400 };

	public double algorithm1(int n) {
		@SuppressWarnings("unused")
		int result = 0;

		// Start time
		double startTime = System.currentTimeMillis();

		// Algorithm
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				result = i + j;
			}
		}

		// End Time
		double endTime = System.currentTimeMillis();

		return endTime - startTime;

	}

	public double algorithm2(int n) {
		@SuppressWarnings("unused")
		int result = 0;

		// Start Time
		double startTime = System.currentTimeMillis();

		// Algorithm
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					result = i + j + k;
				}
			}
		}

		double endTime = System.currentTimeMillis();

		return endTime - startTime;
	}

	public static void main(String[] args) {
		
		AlgorithmTest test = new AlgorithmTest();
		
		//Test algorithm1
		System.out.println("The times of algorithm1");
		for (int n:n1) {
			System.out.println("case "+ n + " : " + test.algorithm1(n) + " ms");
		}
		
		System.out.println();
		
		//Test algorithm2
		System.out.println("The times of algorithm1");
		for (int n:n2) {
			System.out.println("case "+ n + " : " + test.algorithm2(n) + " ms");
		}
		
	}
	
	
}
