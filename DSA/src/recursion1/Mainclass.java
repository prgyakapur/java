package recursion1;

public class Mainclass {
	
	static void printNaturalNumbers(int n) {
		 
		if (n==0) return;
		printNaturalNumbers(n-1);
		System.out.println(n);
	}
	
	static int printSumofNaturalNumbers(int n) {
		if (n==0) return 0;
		return printSumofNaturalNumbers(n-1) + n;
	}
	
	static int powerOfaNumber(int a, int b) {
		if (b==0) return 1;
		if (b==1) return a;
		return powerOfaNumber(a,b-1) * a;
	}
	static int pathsinMatrix(int row, int col) {
		if(row == 1 || col == 1) return 1;
		
		int rightsidepaths = pathsinMatrix(row, col-1);
		int downsidepaths = pathsinMatrix(row-1, col);
		
		return rightsidepaths + downsidepaths;
	}
	public static void main(String[] args) {
		printNaturalNumbers(5);
		System.out.println(printSumofNaturalNumbers(10));
		System.out.println(powerOfaNumber(2,5));
		System.out.println(pathsinMatrix(3, 4));
	}

}
