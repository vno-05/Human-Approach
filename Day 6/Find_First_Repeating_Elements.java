package array;

public class Find_First_Repeating_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[]= {10,5,3,4,3,5,6};
		int arr[]= {6,10,5,4,9,120,4,6,10};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]);
					return;
				}
			}
		}

	}

}
