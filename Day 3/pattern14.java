package example;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		for(int i=1;i<=n;i++)
		{
			int a=0;
			int b=1;
			int c;
			for(int j=1;j<=i;j++)
			{
				c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
				
			}
			System.out.println();
		}
	}

}
