package example;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*   ");
			}
			System.out.println();
		}
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("*   ");
			}
			System.out.println();
		}

	}

}
