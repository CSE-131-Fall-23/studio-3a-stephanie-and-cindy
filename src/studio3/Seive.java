package studio3;

import java.util.Scanner;
public class Seive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n.");
		int n = in.nextInt();
		boolean[] seive = new boolean[n+1];
		{
			for (int i=0; i < n+2 ; i++) 
			{
				seive[i] = (i % 2 > 0) || i==2;
				seive[i] = (i % 3 > 0) || i==3;
				if(seive[i]= true);
				{
					System.out.println(i);
				}
			}
		}
	}}}