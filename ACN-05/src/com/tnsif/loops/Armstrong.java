package com.tnsif.loops;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 153;
		int sum = 0;
		int temp = num;
		while(temp>0) {
			int rem = temp % 10;
			sum = sum + rem* rem* rem;
			temp = temp/10;
		}
		if (sum == num) {
			System.out.println(num+"is Armstrong Number");
		}else {
			System.out.println(num+"is not Armstrong Number");
		}
	}

}
