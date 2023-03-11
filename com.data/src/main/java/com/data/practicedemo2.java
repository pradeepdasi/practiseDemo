package com.data;

public class practicedemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "the voucher id9856 is generated successfully";

		char[] c = str.toCharArray();
		String temp = "";
		for (char letter : c) {
			if ((int) letter >= '0' && (int) letter <= '9') {
				temp = temp + letter;

			}
		}
		System.out.println(temp);

		String s = "AB65H45K88";// 88+65+45=110+88=198
		int res = 0;
		String[] str1 = s.split("[^0-9]");

		/*
		 * s=s.replaceAll("[^0-9]","@"); String[] arr=s.split("\\@");
		 */
		for (String string : str1) {
			if (!string.isEmpty()) {
				res = res + Integer.valueOf(string);
			}
		}

		System.out.println(res);

		String st = "My Transaction id(895666) is generated sucessfully";

		char[] ch = st.toCharArray();
		String tem = "";

		for (char ch1 : ch) {

			if ((int) ch1 >= '0' && (int) ch1 <= '9') {

				tem = tem + ch1;
			}

		}
		System.out.println(tem);

		/*
		 * int pos1=st.indexOf("(")+1;
		 * 
		 * int pos2=st.indexOf(")"); System.out.println(st.substring(pos1, pos2))
		 */;

		String str2 = "oracleDBAandApp";
		int cpafound = 0;
		for (int i = 1; i <= str2.length() - 1; i++) {
			char cab = str2.charAt(i);

			if (Character.isUpperCase(cab)) {
				cpafound = i;

				break;
			}

		}

		System.out.println(str2.substring(0, cpafound) + "_" + str2.substring(cpafound));

		String str11= "The FIC Trasaction id : 1089 The voucher id :4069  The Journal id: 8963 ";

		String temp11="";

//The FIC Trasaction id : 1089

//The voucher id :4069

//The Journal id: 896	

		for (int i = 0; i <= str11.length() - 1; i++) {
			if (Character.isDigit(str11.charAt(i)) && Character.isWhitespace(str11.charAt(i + 1))) {
				temp11 = temp11 + "@";

			} else {
				temp11 = temp11 + str11.charAt(i);
			}
		}

//System.out.println(temp);

		String[] arr = temp11.split("@");

		for (String string : arr) {
			System.out.println(string.trim());
		}

	}

}
