package example;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
