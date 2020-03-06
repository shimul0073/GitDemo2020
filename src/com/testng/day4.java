package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void WebloginHomeLoan() {
		System.out.println("webloginhome");
	}
	
	@Parameters({ "URL","PASS" })
	@Test
	public void MobileloginHomeLoan(String uname, String pass) {
		System.out.println("Mobileloginhome");
		System.out.println(uname);
		System.out.println(pass);
	}
	
	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("LoginAPIHome");
		
	}
}
