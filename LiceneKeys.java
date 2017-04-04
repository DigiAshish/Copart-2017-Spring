//package com.AshishMAC;

import java.util.Scanner;

public class LiceneKeys {

	private static Scanner in;

	public static void main(String[] args) {
			int count=0;String ProcessedString="";
			in = new Scanner(System.in);
			System.out.println("Enter the value for s");
			String License=in.next().toUpperCase();
			System.out.println("Enter the value for k");
			int k=in.nextInt();
			char[] charArray = License.toCharArray();
			System.out.println(License);
			for(int i=0;i<License.length();i++)
			{
				if ( charArray[i]=='-')
					continue;
				else
				{
					if(count<k)
					{
						System.out.print(charArray[i]);
						ProcessedString+=charArray[i];
						count++;
					}
					else
					{
						count=0;
						System.out.print("-");
						ProcessedString+="-";
						System.out.print(charArray[i]);
						ProcessedString+=charArray[i];
					}
				}
			}
			System.out.println();
			System.out.println(ProcessedString);
	}

}
