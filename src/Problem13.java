// 問題1.3
// 2つの文字列が与えられたとき、片方がもう片方の並び換えになっているかどうかを決定するメソッドを書いてください。

import java.util.Arrays;

public class Problem13 {

	public static boolean isAnagram(String str1, String str2) {
		return normalizeString(str1).equals(normalizeString(str2));
	}

	// スペースを無視する(スペースないとアナグラムつくりにくいので)
	public static String normalizeString(String str) {
		char[] newCharArray = str.replaceAll(" ", "").toCharArray();
		Arrays.sort(newCharArray);
		return new String(newCharArray);
	}

	public static void main(String[] args) {
		if (isAnagram(args[0], args[1])) {
			System.out.println("OK");
		}
		else {
			System.out.println("NG");
		}
	}

}
