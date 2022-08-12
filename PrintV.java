
public class PrintV {
	
	public static void main(String[] args) {
		int n=15;
		
//		Logic to print Letter V
		
		for (int i=0;i<=n-1;i++) {
			for (int j=0; j<=n-1; j++) {
				
				if((i%2==0 && j==i/2) || (i%2==0 && i/2==n-1-j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
