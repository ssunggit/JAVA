package kr.ac.kopo.day05;
// 이차원배열은 1차원배열의 검색속도를 높이기 위해서 등장
public class ArrayMain06 {
	public static void main(String[] args) {
		// 2차원배열은 1차원배열의 집합
		
		// heap영역에 4개의 배열이 만들어짐
//		int[][] arr = new int[3][4];

		// 참조변수 3개를 배열로만들고 싶은 것
		// [a] : ar01은 배열을 [a]만큼 만나야 int타입 데이터를 만날 수 있다.
		// [a][b] : arr은 배열을 [a][b]만큼 만나야 int타입 데이터를 만날 수 있다.
		int[] ar01 = new int[4];
		int[] ar02 = new int[4];
		int[] ar03 = new int[4];
		int[][] arr = { ar01, ar02, ar03 };

		System.out.println("arr : " + arr + ", arr.length : " + arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		for(int i = 0; i < arr[0].length; i++) {
			arr[0][i] = (i+1) * 10;
		}
		
		// 모든원소
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
