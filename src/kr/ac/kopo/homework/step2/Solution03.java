package kr.ac.kopo.homework.step2;

/* 3
달팽이가 100M 깊이의 우물을 빠졌습니다
달팽이는 1시간에 5M속도로 움직입니다
올라온 높이가 50M미만일땐 1시간에 1M씩 미끌어지고
50M이상일때 1시간에 2M씩 미끌어집니다
달팽이가 총 몇시간만에 탈출하는지를 코드로 작성하세요.

< 출력결과 >
[1시간후] 달팽이가 올라간 총 높이 : 4M
[2시간후] 달팽이가 올라간 총 높이 : 8M
...
[XX시간후] 달팽이가 올라간 총 높이 : 100M or 101M or 102M

 */
public class Solution03 {
	public static void main(String[] args) {
		int dis =  100;
		int result = 0;
		int time = 0;
		while(dis > 0) {
			if(dis > 50) {
				time ++;
				result += 4;
				dis -= 4;
				System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM\n", time, result);
			}
			else if(dis <= 50) {
				time ++;
				result += 3;
				dis -= 3;
				System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM\n", time, result);
			}	
		}

	
	}
}
