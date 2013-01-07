import java.util.ArrayList;

// 問題 1.5
// 文字の連続する数を使って基本的な文字列圧縮を行うメソッドを実装してください。たとえば「aabccccaaa」は「a2b1c5a3」のようにしてください。
// もし、圧縮変換された文字列が元の文字列よりも短かくならなかった場合は、元の文字列を返してください。l

public class Problem15 {

	static class Tuple<T1, T2> {
		private T1 _first;
		private T2 _second;

		public Tuple (T1 first, T2 second) {
			_first  = first;
			_second = second;
		}

		public T1 getFirst() {
			return _first;
		}
		
		public T2 getSecond() {
			return _second;
		}

		public void setFirst(T1 arg) {
			_first = arg;
		}
		
		public void setSecond(T2 arg) {
			_second = arg;
		}
	}

	public static String compress(String str) {
		ArrayList<Tuple<Character, Integer>> charTupleList = new ArrayList<Tuple<Character, Integer>>();

		for (int i = 0, l = str.length(); i < l; i++) {
			char c = str.charAt(i);

			if (i == 0) {
				charTupleList.add(new Tuple<Character, Integer>(c, 1));
				continue;
			}
			else {
				Tuple<Character, Integer> last = charTupleList.get(charTupleList.size() - 1);

				if (last != null && last.getFirst() == c) {
					last.setSecond(last.getSecond() + 1);
				}
				else {
					charTupleList.add(new Tuple<Character, Integer>(c, 1));
				}
			}
		}

		StringBuffer buffer = new StringBuffer();
		for (Tuple<Character, Integer> charTuple: charTupleList) {
			buffer.append(charTuple.getFirst());
			buffer.append(charTuple.getSecond());
		}

		String result =  buffer.toString();

		// 最初にこれ判定したいところ…
		if (result.length() <= str.length()) {
			return result;
		}
		else {
			return str;
		}
	}

	public static void main(String[] args) {
		System.out.println(compress(args[0]));
	}

}
