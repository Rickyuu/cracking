public class Solution1_6 {
	public static void main(String args[]) {
		Solution1_6 solution1_6 = new Solution1_6();
		int[][] matrix = {{3,5,4,2}, {2,5,7,5}, {7,4,9,8}, {5,2,9,6}};
		solution1_6.printMatrix(matrix);
		solution1_6.rotateMatrix(matrix, 4);
		solution1_6.printMatrix(matrix);

		int[][] matrix2 = {{3,5,4}, {2,5,7}, {7,4,9}};
		solution1_6.printMatrix(matrix2);
		solution1_6.rotateMatrix(matrix2, 3);
		solution1_6.printMatrix(matrix2);
	}

	public void printMatrix(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void rotateMatrix(int[][] matrix, int n) {
		if(n < 2) {
			return;
		}

		int left = (matrix.length - n) / 2;
		int right = left + n - 1;
		int top = left;
		int down = right;

		for(int i=down; i>top; i--) {
			int temp = matrix[top][left+(down-i)];
			matrix[top][left+(down-i)] = matrix[i][left];
			matrix[i][left] = temp;
		}
		for(int i= right; i>left; i--) {
			int temp = matrix[i][left];
			matrix[i][left] = matrix[down][i];
			matrix[down][i] = temp;
		}
		for(int i=top; i<down; i++) {
			int temp = matrix[down][right-(i-top)];
			matrix[down][right-(i-top)] = matrix[i][right];
			matrix[i][right] = temp;
		}

		rotateMatrix(matrix, n-=2);
	}

}