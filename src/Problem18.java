// 片方の文字列が、もう片方の文字列の一部分になっているかどうかを調べるメソッドisSubstringが使えると仮定します。
// 2つの文字列s1とs2が与えられたとき、isSubstringメソッドを一度だけ使ってs2がs1を回転させたものかどうかを判定するコードを書いてください。
// (たとえばwaterbottleはerbottlewatを回転させたものになっています)

public class Problem18 {

	public static boolean isSubstring(String str1, String str2) {
		return str1.indexOf(str2) > 0; 
	}

	public static boolean isRotated(String str1, String str2) {
		if (str2.length() < 1) return false;
		if (str1.equals(str2)) return true;
		return isSubstring(str1 + str1, str2);
	}

	public static void main(String[] args) {
		if (isRotated("waterbottle", "erbottlewat")) {
			System.out.println("Rotated");
		}
		else {
			System.out.println("Not rotated");
		}
	}

}
