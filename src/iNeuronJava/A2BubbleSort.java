package iNeuronJava;

public class A2BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {7,5,2,1,1,4,6};
		
		for(int i= 0;i< ar.length;i++)
		{
			for(int j=1; j<ar.length-i; j++)
			{
				if(ar[j]<ar[j-1])
				{
					int temp =ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=temp;
					
				}
				
			}
			
		}
		for(int elem:ar)
		{
		System.out.println(elem);
		}
		

	}

}
