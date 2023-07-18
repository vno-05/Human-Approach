package array;

public class ElementsOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,1,2,2,2,2,3};
		int x=3;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(x==arr[i])
			{
				count+=1;
			}
		}
		if(count==0)
		{
			System.out.print("-1");;
		}else
		{
			System.out.print(count);
		}

	}

}
