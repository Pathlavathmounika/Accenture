package com.tnsif.loops;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 141;
        String original = Integer.toString(num);
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is Not Palindrome");
        }
	}

}
