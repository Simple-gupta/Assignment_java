package org.ClubMemberFees;

public interface RegularMember {
	
	default double CalculateBillR(int noOfmonths)
	{
		int enfee = 0;
		int memfee = 0;
		int golfs = noOfmonths*20000;
		int totfee=enfee+memfee+golfs;
		System.out.println("Bill is Regular member : "+totfee);
		return 0;
	}
}
interface GoldMember {
	
	default double CalculateBillG(int noOfmonths)
	{
		int enfee = 10000;
		int memfee = 90000;
		int golfs = 0;
		if(noOfmonths>6) {
			noOfmonths-=6;
			golfs = noOfmonths*10000;
		}
		int totfee=enfee+memfee+golfs;
		
		System.out.println("Bill for Gold member : "+totfee);
		return 0;
	}
}
interface SilverMember extends GoldMember{
	
	default double CalculateBillS(int noOfmonths)
	{
		int enfee = 5000;
		int memfee = 15000;
		int golfs = 0;
		if(noOfmonths>6) {
			noOfmonths-=6;
			golfs = noOfmonths*20000;
		}
		int totfee=enfee+memfee+golfs;
		System.out.println("Bill is Silver member : "+totfee);
		return 0;
	}
}