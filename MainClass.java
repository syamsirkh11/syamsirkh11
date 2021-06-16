package com.juaracoding.hari4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student objStudent = new Student();
//		
//		objStudent.name = "mantap";
//		System.out.println(objStudent.getName());
//		Double array[] = new Double[] {3.3,4.3,2.3,5.3,1.3};
//		Arrays.sort(array,Collections.reverseOrder());
//		System.out.println(Arrays.toString(array));
//		double primitive = 4.1;
//		System.out.println(String.valueOf(primitive) + 1.0);
//		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]+1.0);
//		}
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan Baris = ");
		int baris = sc.nextInt();
		System.out.print("Masukan Kolom = ");
		int kolom = sc.nextInt();
		int matriks[][]= new int [baris][kolom];
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.print("Masukan array ke ["+i+"] ["+j+"] = ");
				matriks[i][j]=sc.nextInt();
			}
		}
		

		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.print(matriks[i][j]);
			}
			System.out.println();
		}
		
	}

}
