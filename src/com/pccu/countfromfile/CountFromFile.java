package com.pccu.countfromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		int mSum = 0;
		int mAmount = 0;
		String mCustomer = "";
		try {
			scanner = new Scanner(new File("src/Text/consume.txt"));
			while(scanner.hasNext()) {
				mCustomer = scanner.next();
				
				mAmount = scanner.nextInt();
				mSum += mAmount;
				
				System.out.println("Name: " + mCustomer + " " + " Amount: " + mAmount);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			scanner.close();
		}
		System.out.println("Total: " + mSum);
	}

}
