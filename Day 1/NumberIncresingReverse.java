package example;

public class NumberIncresingReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(j+" ");	
			}
			System.out.println();
		}

	}

}
