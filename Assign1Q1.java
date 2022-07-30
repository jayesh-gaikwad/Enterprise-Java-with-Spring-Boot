package ClassAssignment;

public class Assign1Q1 {

	public static void main(String[] args) {
		
		int n=7;
		
		for(int i=0;i<7;i++)
		{
			//For Printing I
			for(int j=0;j<7;j++)
			{
				if(i==0||j==(n-1)/2||i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			//For Printing N
			for(int j=0;j<7;j++)
			{
				if(j==0||j==(n-1)||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
			System.out.print(" ");
			
			//For Printing E
			for(int j=0;j<7;j++)
			{
				if(j==0||i==0||i==(n-1)/2||i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print(" ");
			
			//For Printing U
			for(int j=0;j<7;j++)
			{
				if(j==0||i==n-1||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
			System.out.print(" ");
			
			//For Printing R
			for(int j=0;j<7;j++)
			{
						
				if(j == 0 && i >= 0 || i == n / 2 && j >= 0 || i == 0 && j >= 0 || j == n - 1 && i <= n / 2
						|| i >= n / 2 && i == j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
			System.out.print(" ");
			
			
			//For Printing O
			for(int j=0;j<7;j++)
			{
						
				if(j==0||i==n-1||j==n-1||i==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print(" ");
			
			//For Printing N
			for(int j=0;j<7;j++)
			{
				if(j==0||j==(n-1)||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println(" ");
		}
		

	}

}
