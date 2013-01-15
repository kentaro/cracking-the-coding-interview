// 問題 2.1
// ソートされていない連結リストから、重複する要素を削除するコードを書いてください
// 発展問題
// もし、一時的なバッファが使用できないとすれば、どうやってこの問題をときますか?

// 解答
// 一時的なバッファ使わないとO(n^2)になるしやだ……というわけで、とりあえずHashtable版だけ。

import org.kentarok.problems.LinkedList;
import org.kentarok.problems.Iterator;

public class Problem21 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.append(1);
		list.append(5);
		list.append(3);
		list.append(5);
		list.append(2);
		list.append(2);
		list.append(3);
		list.append(4);
		list.uniquify();

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getData());
		}
	}
}
