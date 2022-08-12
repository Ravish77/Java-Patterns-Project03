
public class PrintI {
	
	public static void main(String[] args) {
		int n=15;
		
//		Logic to print letter I
		
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				
				if( j==(n-1)/2 || i==0 || i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
					
				
			}
			System.out.println();
		}
	}

}
