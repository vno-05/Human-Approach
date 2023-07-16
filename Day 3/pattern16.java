package example;

public class pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=1;i<=(2*n);i++)
		{
			if(i<=n)
			{
				for(int j=1;j<=n-i+1;j++)
				{
					System.out.print(j+" ");
				}
			}
			else
			{
				for(int k=1;k<=i-n;k++)
				{
					System.out.print(k+" ");
				}
			}
			System.out.println();
		}

	}

}
