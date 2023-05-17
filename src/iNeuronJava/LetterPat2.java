package iNeuronJava;

public class LetterPat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		//for pattern Quetion number 3
		for (int i=0; i<n; i++)
		{
			for(int j=0; j<n;j++)
			{
				if((i+j)<=(n)/2 ||(j-i)>=(n-1)/2 ||j==0 && i<(n)||j==n-1 && i<(n)||i==n-1 &&j<n) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//System.out.println();
				
		
			System.out.println();
		
		}
		
		
		
	
	}

}
