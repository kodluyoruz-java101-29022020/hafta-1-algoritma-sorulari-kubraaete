package com.kubraete;

import java.util.Scanner;

public class Soru1 {
	
	public static void main(String[] args) {
		String sifre="12345";
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Lütfen Þifrenizi Giriniz:");
		String login=scn.nextLine();
		
		if(sifre.equals(login)) {
			System.out.println("Giriþ Baþarýlý");

		}else {
			System.out.println("Giriþ Baþarýsýz");

		}
		
	}

}
