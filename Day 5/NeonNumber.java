package basic;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int n=9;
		        int sum=0;
		        int sq=n*n;
		        while(sq>0)
		        {
		            int a=sq%10;
		            sum+=a;
		            sq=sq/10;
		        }
		        if(n==sum)
		        {
		            System.out.print("Neon");
		        }
		        else
		        {
		            System.out.print("Not Neon");
		        }
	}

}
