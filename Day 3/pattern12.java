package example;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("1 ");
			}
			for(int j=1;j<=i;j++)
			{
					System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
