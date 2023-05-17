package iNeuronJava;

public class LetterPat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		//for pattern Quetion number 3
		for (int i=0; i<n; i++)
		{
			for(int j=0; j<n;j++)
			{
				if((i+j)<=(n)/2 ||(i-j)>=(n-1)/2 ||i==0 && j<(n)||i==n-1 && j<(n))
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
