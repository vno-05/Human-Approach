package example;
public class squareHallow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==n||i==1||j==1||j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
