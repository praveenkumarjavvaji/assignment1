package firstprog;

public class name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		for(int i=0;i<=n;i++) 
			{
			//I letter
				for(int j=0;j<=n;j++) 
				{
				if(i==0 || j==n/2 || i==n)
					System.out.print("*");
				else
					System.out.print(" ");
				}
				
				System.out.print("   ");
				//N letter
				for(int j =0;j<=n;j++)
				{
					if(j==0||i==j || j==n)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.print("   ");
				
				//E letter
				for(int j =0;j<=n;j++)
				{
					if(j==0||i==0&&j<=n/2 ||i==n/2&&j<=n/2 || i==n&&j<=n/2)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.print(" ");
				//U letter
				for(int j =0;j<=n;j++)
				{
					if(j==0&&i!=n||(j==3*n/4&&i!=n)||i==n&&j!=0&&j<3*n/4)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.print("   ");
				//R letter
				for(int j =0;j<=n;j++)
				{
					if(j==0||i==0&&j<(3*n)/4||j==(3*n)/4&&i<(n-1)/2&&i!=0||i==(n-1)/2&&j<=(3*n)/4&&j!=(3*n)/4||i-j==0&&j>=n/2)
						
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.print("   ");
				//O letter
				for(int j =0;j<=n;j++)
				{
					if((i==0&&j!=3*n/4&&j!=0&&j<3*n/4)||(j==3*n/4&&i!=0&&i!=n)||(i==n&&j<3*n/4&&j!=0)||(j==0&&i!=0&&i!=n))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.print("   ");
				//N letter
				for(int j =0;j<=n;j++)
				{
					if(j==0||i==j || j==n)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.print("   ");
		System.out.println();
			
			
	}

	}

}
