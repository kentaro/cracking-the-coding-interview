// 問題1.1
// ある文字列が、すべてユニークである(重複する文字がない)かどうかを判定するアルゴリズムを実装してください。
// また、それを実装するのに新たなデータ構造が使えない場合、どのようにすればよいですか?

import java.util.HashMap;

public class Problem11 {

	// HashMap
	public static boolean consistsOfUniqCharsDetectedByHashMap(String str) {
		HashMap<Character, Boolean> hash = new HashMap<Character, Boolean>();

		for (int i = 0; i < str.length(); i++) {
			if (hash.containsKey(str.charAt(i))) return false;
			hash.put(str.charAt(i), true);
		}

		return true;
	}

	// Linear Search
	public static boolean consistsOfUniqCharsDetectedByLinearSearch(String str) {
		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				if (i == j) continue;
				if (current == str.charAt(j)) return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		if (consistsOfUniqCharsDetectedByHashMap(args[0])) {
			System.out.println("Hash: OK");
		}
		else {
			System.out.println("Hash: NG");
		}

		if (consistsOfUniqCharsDetectedByLinearSearch(args[0])) {
			System.out.println("Hash: OK");
		}
		else {
			System.out.println("Hash: NG");
		}
	}

}
