package iNeuronJava;

import java.util.Scanner;

public class A2BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] ar= {10,20,30,40,50,72,84,90,95};
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Key element");
		int key=scan.nextInt();
		int low=0;
		int high= ar.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==ar[mid])
			{
	         System.out.println("Key "+key + " found at position " +mid);
			break;
			}
			else if (key<ar[mid])
			{
				high=mid-1;
			}
			else if (key>ar[mid])
			{
				low=mid+1;
			}
			
			
		}
	}

}
