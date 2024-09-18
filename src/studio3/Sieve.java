package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number to start with?");
		int n = sc.nextInt();
		int  myArray[] = new int[n];
		for (int z = 0; z<n;z++)
		{
			myArray[z]= z;
		}
		int num = 0; 
		while ( 2*num < n) 
		{
			num++;
		}
		
		int y= 2;
	
		int count = 0;
		while (count< num )
		{
			for( int i = 2; i<num;i++ )
			{
				if((i*y)<n)
				{
					myArray[i*y]= 0;
				}
				
			}
			y++;
			count++;
		}
		for (int x = 0; x<n;x++)
		{
			if(myArray[x]!=0)
			{
				System.out.println(myArray[x]);
			}
		}

	}
}

