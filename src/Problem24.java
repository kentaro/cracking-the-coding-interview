// 問題 2.4
// ある数xが与えられたとき、連結リストの要素を並べ替え、xより小さいものが前にくるようにするコードを書いてください。

import org.kentarok.problems.Iterator;
import org.kentarok.problems.LinkedList;

public class Problem24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.append(5);
		list.append(4);
		list.append(3);
		list.append(2);
		list.append(1);
		list = list.proceedNodesUnder(3);

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getData());
		}
	}

}
