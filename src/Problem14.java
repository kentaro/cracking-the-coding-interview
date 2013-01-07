// 問題1.4
// 文字列内に出現するすべての空白文字を"%20"で置き換えるメソッドを書いてください。
// ただし、文字列の後ろには新たに文字を追加するためのスペースが十分にある(バッファのサイズは気にしなくてもよい)ことと、
// その追加用スペースを除いた文字列の真の長さが与えられます。
// (注意: Javaで実装する場合は、追加の領域を使用せずに処理できるよう文字配列を使ってください)
// 例
// 入力: "Mr John Smith    "
// 出力: "Mr%20John%20Smith"

public class Problem14 {

	public static String replaceSpaces(String str) {
		int newLength  = 0;
		int spaceCount = 0;

		for (int i = 0, l = str.length(); i < l; i++) {
			char c = str.charAt(i);
			if (c == ' ') {
				spaceCount++;
			}
			else {
				newLength += 1 + (spaceCount * 3);
				spaceCount = 0;
			}
		}

		int cursor = 0;
		char[] charArray = new char[newLength];

		for (int i = 0; cursor < newLength; i++) {
			char c = str.charAt(i);
			if (c == ' ') {
				charArray[cursor++] = '%';
				charArray[cursor++] = '2';
				charArray[cursor++] = '0';
			}
			else {
				charArray[cursor++] = c;
			}
		}

		return new String(charArray);
	}

	public static void main(String[] args) {
		System.out.println(replaceSpaces(args[0]));
	}

}
