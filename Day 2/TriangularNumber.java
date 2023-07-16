package example;

public class TriangularNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			int k=i;
			for(int j=1;j<=n;j++)
			{
				System.out.print(k+" ");
				k++;
				if(k>n)
				{
					k=1;
				}
			}
			System.out.println();
	}

}
}

