package com.kubraete;

import java.util.Random;
import java.util.Scanner;

public class Soru3 {
	
	public float mean(int[] arr2) {
		
		int total=0;
		for(int i=0; i<arr2.length; i++) {
			total+=arr2[i];
		}
		return (float)total/arr2.length;
	}
	

	public static void main(String[] args) {
		
		int[] arr=new int[100];
		Random rnd=new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i]=rnd.nextInt(100);
			System.out.println(arr[i]);
		}
		System.out.print("Ortalama:");
		Soru3 soru3=new Soru3();
		System.out.println(soru3.mean(arr));
	
		
	}

}
