package org.company;

public class CompanyInfo {
	public void companyname() {
		System.out.println("company name is Biotech");
		System.out.println("Eastman Exports Global Clothing pvt Ltd");
	}
	public void companyid() {
		System.out.println("company id is 56342");
	}
	public void companyaddress() {
		System.out.println("companyaddress is Banglore");
	}
	public static void main(String[]args) {
		CompanyInfo l = new CompanyInfo();
		l.companyname();
		l.companyid();
		l.companyaddress();
	}
}
		
