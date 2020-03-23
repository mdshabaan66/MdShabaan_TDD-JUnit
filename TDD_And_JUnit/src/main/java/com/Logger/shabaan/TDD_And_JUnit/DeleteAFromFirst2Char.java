package com.Logger.shabaan.TDD_And_JUnit;

public class DeleteAFromFirst2Char {

	public String del(String string) {
		String result="";
		if(string.length()<1) {
			result= string;
		}
		else if(string.charAt(0)=='A' && string.charAt(1)!='A') {
		
			result= string.substring(1);
		}
		else if(string.charAt(0)!='A' && string.charAt(1)=='A') {
			result= ""+string.charAt(0)+string.substring(2);
		}
		else if(string.charAt(0)=='A' && string.charAt(1)=='A') {
			result= string.substring(2);
		}
		else {
			result=string;
		}
		return result;
	}

}
