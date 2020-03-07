package com.kubraete;

import java.util.Random;

public class Soru5 {
	
	public void tek(int[] arr2) {
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i]%2==1) {
				System.out.print(arr2[i] + "\t");
			}
		}
		System.out.println("\n");
	}
	public void cift(int[] arr3) {
		for(int i=0; i<arr3.length; i++) {
			if(arr3[i]%2==0) {
				System.out.print(arr3[i] + "\t");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr=new int[100];
		Random rnd=new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i]=rnd.nextInt(100);
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n");
		Soru5 soru5=new Soru5();
		System.out.println("Tek Sayýlar:");
		soru5.tek(arr);
		System.out.println("Çift Sayýlar:");
		soru5.cift(arr);
	}

}
