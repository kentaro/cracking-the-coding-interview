// 問題 1.6
// NxNの行列に描かれた、1つのピクセルが4バイト四方の画像があります。その画像を90度開店させるメソッドを書いてください。
// あなたはこれを追加の領域なしでできますか?

class Square<T> {
	private T[][] _list;

	public Square(T[][] list) {
		_list = list;
	}

	public void rotate() {
		for (int i = 0, l = _list.length; i < l/2; i++) {
			for (int j = 0; j < (l - (i * 2) - 1); j++) {
				T top    = _list[i][j + i];
				T right  = _list[j + i][l - i - 1];
				T bottom = _list[l - i - 1][l - j - i - 1];
				T left   = _list[l - j - i - 1][i];

				_list[j + i][l - i - 1]         = top;    // right
				_list[l - i - 1][l - j - i - 1] = right;  // bottom
				_list[l - j - i - 1][i]         = bottom; // left
				_list[i][j + i]                 = left;   // top
			}
		}
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();

		for (int i = 0, l = _list.length; i < l; i++) {
			for (int j = 0; j < l; j++) {
				buffer.append(_list[i][j]);
			}
			if (i < (l - 1)) buffer.append("\n");
		}

		return buffer.toString();
	}
}

public class Problem16 {

	public static void main(String[] args) {
		Integer[][] list1 = {{1,1,1,1}, {2,2,2,2}, {3,3,3,3}, {4,4,4,4}};
		Square<Integer> rect1 = new Square<Integer>(list1);
		rect1.rotate();
		System.out.println(rect1.toString());
		rect1.rotate();
		System.out.println(rect1.toString());

		Integer[][] list2 = {{1,1,1,1,1}, {2,2,2,2,2}, {3,3,3,3,3}, {4,4,4,4,4}, {5,5,5,5,5}};
		Square<Integer> rect2 = new Square<Integer>(list2);
		rect2.rotate();
		System.out.println(rect2.toString());
		rect2.rotate();
		System.out.println(rect2.toString());

		Integer[][] list3 = {{1,1,1,1,1,1}, {2,2,2,2,2,2}, {3,3,3,3,3,3}, {4,4,4,4,4,4}, {5,5,5,5,5,5}, {6,6,6,6,6,6}};
		Square<Integer> rect3 = new Square<Integer>(list3);
		rect3.rotate();
		System.out.println(rect3.toString());
		rect3.rotate();
		System.out.println(rect3.toString());
	}

}
