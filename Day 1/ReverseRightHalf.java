package example;

public class ReverseRightHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("* ");	
			}
			System.out.println();
		}

	}

}
