
public class PrintU {

	public static void main(String[] args) {
		
		int n=15;
		
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((i==n-1 && j!=0 && j!=n-1)|| (j==0 && i!=n-1) || (j==n-1 && i!=n-1))
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
