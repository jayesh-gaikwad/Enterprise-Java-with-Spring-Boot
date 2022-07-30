package ClassAssignment;

public class Assign1Q5 {

	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==0||i-j>=4||i+j<=4)
					System.out.print("*");
				else
					System.out.print(" ");				
			}
			System.out.println(" ");
		}

	}

}
