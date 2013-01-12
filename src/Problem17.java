// MxNの行列について、要素が0であれば、その行と列のすべてを0にするようなアルゴリズムを書いてください。

public class Problem17 {

	public static int[][] fillZeros(int[][] matrix) {
		boolean[] x = new boolean[matrix[0].length];
		boolean[] y = new boolean[matrix.length];

		for (int i = 0, ly = matrix.length; i < ly; i++) {
			for (int j = 0, lx = matrix[i].length; j < lx; j++) {
				if (matrix[i][j] == 0) {
					y[i] = true;
					x[j] = true;
				}
			}
		}

		for (int i = 0, ly = matrix.length; i < ly; i++) {
			for (int j = 0, lx = matrix[i].length; j < lx; j++) {
				if (y[i] || x[j]) {
					matrix[i][j] = 0;
				}
			}
		}

		return matrix;
	}

	public static void main(String[] args) {
		int[][] matrix = {{1,3,4}, {0,2,5}, {3,0,3}};
		matrix = fillZeros(matrix);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}

}
