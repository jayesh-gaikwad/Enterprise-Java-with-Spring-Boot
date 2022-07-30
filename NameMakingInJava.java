package ClassAssignment;

public class NameMakingInJava {

	public static void main(String[] args) {
		int n = 7;

		for (int i = 0; i < n; i++) {

				// For Letter J
				for (int j = 0; j < n; j++) {
					if(i==0||j==(n-1)/2||j==0 && i > (n - 1) / 2||i==n-1&&j<(n-1)/2)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.print(" ");
			

				// For Letter A
				for (int j = 0; j < n; j++) {
					if(j==0&&i!=0||i==0&&j!=0&&j!=n-1||i==(n-1)/2||j==n-1&&i!=0)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.print(" ");
			
				//For Letter Y
				for (int j = 0; j < n; j++) {
					if(j>=0&&i == j && i <= (n - 1) / 2||j >= 0&&i+j==n-1&&i <= (n - 1) / 2||j==(n-1)/2&&i>(n-1)/2)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.print(" ");
			
				
				//For Letter E
				for (int j = 0; j < n; j++) {
					if (i == 0  || j == 0 || i == n - 1 || i == (n - 1) / 2)
						System.out.print("* ");
					else
						System.out.print("  ");
					}
					System.out.print(" ");
				
				//For Letter S

				for (int j = 0; j < n; j++) {
					if (i == 0 || j == 0 && i < n / 2 || i == (n - 1) / 2 || i == (n - 1)
							|| j == (n - 1) && i > (n - 1) / 2)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.print("  ");

				//For Letter H

				for (int j = 0; j < n; j++) {
					if (j == 0 || j == n - 1 || i == (n - 1) / 2)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println("");
		}
		
		System.out.println(" ");
	}
}