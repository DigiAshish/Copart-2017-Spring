//package com.AshishMAC;
/*
 * To accept a software license key and a value for k and partition the string with dashes
 */

/**
 * git 
 * @author Ashish
 */

import java.util.Scanner;

public class LiceneKeys {

	private static Scanner in;

	public static void main(String[] args) {
			int count=0;String ProcessedString="";
			in = new Scanner(System.in);
			System.out.println("Enter the value for s");
			//license key which we would like to format
			String License=in.next().toUpperCase(); //Lowercase letters converted to uppercase.
			System.out.println("Enter the value for k");
			//K decides how to devide each group of characters
			int k=in.nextInt();
			//Devide the string and store it in a character
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
