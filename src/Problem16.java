// 問題 1.6
// NxNの行列に描かれた、1つのピクセルが4バイト四方の画像があります。その画像を90度開店させるメソッドを書いてください。
// あなたはこれを追加の領域なしでできますか?

public class Problem16 {

	static class Square {
		private int[][] _list;

		public Square(int[][] list) {
			_list = list;
		}

		public void rotate() {
			for (int i = 0, l = _list.length; i < l/2; i++) {
				for (int j = 0; j < (l - (i * 2) - 1); j++) {
					int top    = _list[i][j + i];
					int right  = _list[j + i][l - i - 1];
					int bottom = _list[l - i - 1][l - j - i - 1];
					int left   = _list[l - j - i - 1][i];

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
	
	public static void main(String[] args) {
		int[][] list1 = {{1,1,1,1}, {2,2,2,2}, {3,3,3,3}, {4,4,4,4}};
		Square rect1 = new Square(list1);
		rect1.rotate();
		System.out.println(rect1.toString());
		rect1.rotate();
		System.out.println(rect1.toString());

		int[][] list2 = {{1,1,1,1,1}, {2,2,2,2,2}, {3,3,3,3,3}, {4,4,4,4,4}, {5,5,5,5,5}};
		Square rect2 = new Square(list2);
		rect2.rotate();
		System.out.println(rect2.toString());
		rect2.rotate();
		System.out.println(rect2.toString());

		int[][] list3 = {{1,1,1,1,1,1}, {2,2,2,2,2,2}, {3,3,3,3,3,3}, {4,4,4,4,4,4}, {5,5,5,5,5,5}, {6,6,6,6,6,6}};
		Square rect3 = new Square(list3);
		rect3.rotate();
		System.out.println(rect3.toString());
		rect3.rotate();
		System.out.println(rect3.toString());
	}

}
