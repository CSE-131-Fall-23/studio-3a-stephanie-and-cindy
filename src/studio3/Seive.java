package studio3;

import java.util.Scanner;
public class Seive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n.");
		int n = in.nextInt();
		int[] seive = new int[n+1];
		{
			for (int i=0; i < n+2 ; i++) 
			{
				System.out.print(seive[i]);
			}
		}}}