package org.ClubMemberFees;
import java.util.*;

public class Bill implements RegularMember,SilverMember{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for regular 2 for gold and 3 for silver");
		int ch=sc.nextInt();
		System.out.println("enter no of months");
		int m=sc.nextInt();
		Bill ob=new Bill();
		if (ch==1)
			ob.CalculateBillR(m);
		else if(ch==2)
			ob.CalculateBillG(m);
		else if(ch==3)
			ob.CalculateBillS(m);
		else
			System.out.println("enter correct number");
		}

	
	@Override
	public double CalculateBillR(int noOfmonths) {
		// TODO Auto-generated method stub
		return RegularMember.super.CalculateBillR(noOfmonths);
	}
	

}
