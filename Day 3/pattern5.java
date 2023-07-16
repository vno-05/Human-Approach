package example;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		int n=4;
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				c=a+b;
				a=b;
				b=c;
				System.out.print(a + " ");
			}
			System.out.println();
		}

	}

}
