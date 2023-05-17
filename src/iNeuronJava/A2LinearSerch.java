package iNeuronJava;

import java.util.Scanner;

public class A2LinearSerch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar= {10,20,13,27,35,56};
		Boolean flag=false;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Key element");
		int key=scan.nextInt();
		
		for(int i=0; i<ar.length; i++)
		{
			if(key==ar[i])
			{
				System.out.println("Key "+key + " found at position " +i);;
				flag=true;
				break;
				
			}
		}
		
		if(flag==false)
		{
			System.out.println("Key not found");
		}

	}

}
