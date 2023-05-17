package iNeuronJava;

public class LetterPat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		//for I
		for (int i=0; i<n; i++)
		{
			for(int j=0; j<n;j++)
			{
				if((i==0 && j < (3*n)/4)||(j<(3*n)/4 && i==(n-1)) || (j==(3*n)/4/2 && i<(n-1))) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//System.out.println();
			
			//For N
			for(int j=0; j<n;j++)
			{
				if((i==j)&& i<(n-1)|| (j==0 &&  i<(n))||(i<(n) &&  j== ((3*n)/4)+1))  
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		
		//For E
			for(int j=0; j<n;j++)
			{
				if((i==0 && j < (n-1))||(j<=(3*n)/4 && i==(n-1))|| (i==(n-1)/2 && j<(3*n)/4) || (j==0 &&  i< (n-1))) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//for U
			for(int j=0 ; j<n; j++)
			{
				if((j==0 && i< (n-1)) ||(i==(n-1)&&j>0 && j<(3*n)/4) && j<(n-1)||
						(j==(3*n)/4 && i<(n-1)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			//for R
			for(int j=0 ; j<n; j++)
			{
				if((j==0 && i>0 && i< (n)) || (i==0 && j>0 && j<(3*n)/4)||(i==(n-1)/2 && j>0 && j<(3*n)/4)|| ((i-j)==5 &&j< (3*n)/4)||
				(j==(3*n)/4 && i<(n-1)/2 && i>0))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			
			//for O
			for(int j=0 ; j<n; j++)
			{
				if((j==0 && i>0 && i< (n-1)) ||(i==(n-1)&&j>0 && j<(3*n)/4)|| (i==0 && j>0 && j<(3*n)/4)||
						(j==(3*n)/4 && i<(n-1) && i>0))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			
			//For N
			for(int j=0; j<n;j++)
			{
				if((i==j)&& i<(n-1)|| (j==0 &&  i<(n))||(i<(n) &&  j== ((3*n)/4)+1)) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		
			}
		
		
		
	}

}
