package com.kubraete.soru6;

public class Printer {
	public static void printPDFDocument(PDFDocument pdf) {
		System.out.println(pdf.getBody());
	}
	public static void printWordDocument(WordDocument word) {
		System.out.println(word.getBody());
	}
	public static void main(String[] args) {
		PDFDocument pdf=new PDFDocument("PDF yaz�s� mevcuttur");
		WordDocument word=new WordDocument("Word yaz�s� mevcuttur");
		printPDFDocument(pdf);
		printWordDocument(word);
		
		/*Methodlar�n static olmas�n�n sebebi ancak static method static methodu �a��rabilir.*/
		
	}

}
