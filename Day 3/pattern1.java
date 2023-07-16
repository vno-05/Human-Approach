package example;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int alpha=64;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(alpha+i)+" ");
			}
			System.out.println();
			
		}

	}

}
