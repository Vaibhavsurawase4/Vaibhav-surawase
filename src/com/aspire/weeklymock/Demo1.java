package com.aspire.weeklymock;

public class Demo1 
{
	public static void main(String[] args) 
	{
	  String Name="vaibhav";
//	 String[] a=Name.split("");
//	//Split the name
//	for(int i=Name.length()-1;i>=0;i--)
//	{
//		System.out.print(a[i]);
//	
//	}	
//	System.out.println();
	
	// 2 nd method
	String rev=" ";
	for(int i=Name.length()-1;i>=0;i--)
	{
		rev=rev+Name.charAt(i);
	}
	System.out.println(rev);
 }	
}