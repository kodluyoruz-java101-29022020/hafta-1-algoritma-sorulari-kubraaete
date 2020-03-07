package com.kubraete;

import java.util.Scanner;

public class Soru2 {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int select=scn.nextInt();

		System.out.println("1-Toplama");
		System.out.println("2-Çýkarma");
		System.out.println("3-Çarpma");
		System.out.println("4-Bölme");
		System.out.println("Seçiminiz:" + select);
		System.out.println("2 sayý yazýn!");

		int sayi1=scn.nextInt();
		int sayi2=scn.nextInt();
		
		switch(select){
			case 1:
				System.out.println("Toplama Sonucu:" + (sayi1+sayi2));
				break;
			case 2:
				System.out.println("Çýkarma Sonucu:" + (sayi1-sayi2));
				break;
			case 3:
				System.out.println("Çarpma Sonucu:" + (sayi1*sayi2));
				break;
			case 4:
				System.out.println("Bölme Sonucu:" + (sayi1/sayi2));
				break;
				default:
					System.out.println("Lütfen Geçerli Bir Seçim Yapýn!");
					break;




			
		}
	}

}
