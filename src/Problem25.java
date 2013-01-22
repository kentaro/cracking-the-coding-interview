// 問題 2.5
// 各ノードの要素が1桁の数である連結リストで表された2つの数があります。一の位がリストの先頭になるように、各位の数は逆順に並んでいます。
// このとき2つの数の和を求め、それを連結リストで表したものを返す関数を書いてください。
//
// 例
//
// 入力: (7->1->6) + (5->9->2) -> 617 + 295
// 出力: (2->1->9) -> 912
//
// 発展問題
//
// 上位の桁から準方向に連結されたリストを用いて、同様にといてみてください。
//
// 入力: (6->1->7) + (2->9->5) -> 617 + 295
// 出力: (9->1->2) -> 912

import org.kentarok.problems.*;

public class Problem25 {

	public static LinkedList<Integer> addLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		return intToList(listToInt(list1) + listToInt(list2));
	}

	public static int listToInt(LinkedList<Integer> list) {
		Iterator<Integer> iterator = list.iterator();
		int result  = 0;
		int counter = 0;
		
		while (iterator.hasNext()) {
			result = result + (iterator.next().getData() * (int)Math.pow(10, counter++));
		}

		return result;
	}

	public static LinkedList<Integer> intToList(int n) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int current = 0;

		for (int i = 10; i < (n * 10); i = i * 10) {
			current = n % i;
			list.append(current/(i/10));
			n = n - current;
		}

		return list;
	}

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.append(7);
		list1.append(1);
		list1.append(6);

		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.append(5);
		list2.append(9);
		list2.append(2);

		LinkedList<Integer> list3 = addLists(list1, list2);
		Iterator<Integer> iterator = list3.iterator();
		StringBuffer result = new StringBuffer();

		while (iterator.hasNext()) {
			result.append(iterator.next().getData());
		}

		System.out.println(result.toString());
	}

}
