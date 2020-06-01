public class Mabang {
	public static void main(String[] args) {
		int n = 5;
		int[][] mabang = new int[n][n];
		// x : 세로축, y : 가로축
		// 첫 좌표값
		int x = 0;
		int y = n / 2;
		mabang[x][y] = 1;
		for (int i = 2; i <= n * n; i++) {
			// 다음 숫자를 찍을 좌표 (좌측 대각선)
			x = x - 1;
			y = y - 1;
			if (x < 0) { 
				if(y < 0) { 
					x = x + 2;
					y = y + 1; 
				} else { 
					x = n -1;
				}
					
			} else {
				if(y < 0) {
					y = n -1;
				} else {
					// 정상인데 숫자가 입력되어 있는 경우
					if(mabang[x][y] != 0) {
						x = x + 2;
						y = y + 1;
					}
				}
			}
			mabang[x][y] = i; // 계산된 x와 y 좌표에 맞춰 다음 숫자 입력
		}
		
		for (int i = 0; i < mabang.length; i++) {
			for (int j = 0; j < mabang[i].length; j++) {
				System.out.print(mabang[i][j] + "\t");
			}
		}
	}
}