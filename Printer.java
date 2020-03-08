package com.kubraete.soru6;

public class Printer {
	public static void printPDFDocument(PDFDocument pdf) {
		System.out.println(pdf.getBody());
	}
	public static void printWordDocument(WordDocument word) {
		System.out.println(word.getBody());
	}
	public static void main(String[] args) {
		PDFDocument pdf=new PDFDocument("PDF yazýsý mevcuttur");
		WordDocument word=new WordDocument("Word yazýsý mevcuttur");
		printPDFDocument(pdf);
		printWordDocument(word);
		
		/*Methodlarýn static olmasýnýn sebebi ancak static method static methodu çaðýrabilir.*/
		
	}

}
