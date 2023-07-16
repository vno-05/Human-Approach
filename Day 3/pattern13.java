package example;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("5 ");
			}
			System.out.println();
		}
	}

}
