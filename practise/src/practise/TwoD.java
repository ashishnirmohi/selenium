package practise;

import java.util.Scanner;


public class TwoD{

private static Scanner ini;

public static void main (String [] args){
	double max1[][] = new double[2][2];
	double max2[][] = new double[2][2];
	ini = new Scanner(System.in);
	
	System.out.println("Enter a first matrix");
	for(int i = 0; i <= max1.length  ; i++){
		for(int j = 0; i <= max1.length ; j++){
			max1[i][j]=  ini.nextDouble();
		}}

	
	System.out.println("matrix first is written.");

	System.out.println("Enter a second  matrix");
	for(int i = 0; i <= max2.length  ; i++){
	for(int j = 0; i <= max2.length ; j++){
		max2[i][j]= ini.nextDouble();
	}}
	
	
	System.out.println("matrix first is written.");




}}
