
public class PrintK {
	
	public static void main(String[] args) {
		
		int n=15;
		
//		Logic to print letter K
		
		for (int i=0;i<=n-1; i++) {
			for(int j=0;j<=n-1;j++) {
				
				if(j==0 || ((2*i)+j==(n-1) && j%2==0 && i<(n-1)/2)  || ((2*i)-j==n-1 && j%2==0 && i>(n-1)/2 ) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
			System.out.println();
		}
	}

}
