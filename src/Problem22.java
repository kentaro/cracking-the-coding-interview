// 問題 2.2
// 単方向連結リストにおいて、末尾から数えてK番目の要素をみつけるアルゴリズムを実装してください。

import org.kentarok.problems.LinkedList;

public class Problem22 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.append(i);
		}
		System.out.println(list.nthToLast(5).getData());
	}

}
