package com.kubraete;

import java.util.Scanner;

public class Soru2 {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int select=scn.nextInt();

		System.out.println("1-Toplama");
		System.out.println("2-��karma");
		System.out.println("3-�arpma");
		System.out.println("4-B�lme");
		System.out.println("Se�iminiz:" + select);
		System.out.println("2 say� yaz�n!");

		int sayi1=scn.nextInt();
		int sayi2=scn.nextInt();
		
		switch(select){
			case 1:
				System.out.println("Toplama Sonucu:" + (sayi1+sayi2));
				break;
			case 2:
				System.out.println("��karma Sonucu:" + (sayi1-sayi2));
				break;
			case 3:
				System.out.println("�arpma Sonucu:" + (sayi1*sayi2));
				break;
			case 4:
				System.out.println("B�lme Sonucu:" + (sayi1/sayi2));
				break;
				default:
					System.out.println("L�tfen Ge�erli Bir Se�im Yap�n!");
					break;




			
		}
	}

}
