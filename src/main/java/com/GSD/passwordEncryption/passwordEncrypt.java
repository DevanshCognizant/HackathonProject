package com.GSD.passwordEncryption;

import java.util.Base64;

public class passwordEncrypt {
	//Initializing a static variable with the encoded password
	static String password = "MTAzMDIwMDFARGV2";
	//Decoding the password using Base64 decoding and storing it in a byte array 
	static byte[] decrypt = Base64.getDecoder().decode(password);
	//Converting the decoded byte array to a string 
	public static String dePass = new String(decrypt);
}
