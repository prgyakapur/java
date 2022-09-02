package bitmanipulation;

public class Mainclass {
	
	
	static int fintIthbit(int n, int i) {
		int mask = 1<<i; //left shift operator 
		int result = n&mask;
		
		if(result ==0) return 0;
		else return 1;
	}

	public static void main(String[] args) {
	
		int n=5;
		System.out.println(fintIthbit(n,9));
		 
		

	}

}
