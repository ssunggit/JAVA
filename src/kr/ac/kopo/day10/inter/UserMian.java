package kr.ac.kopo.day10.inter;

public class UserMian {
	
	public static void main(String[] args) {
		// 묵시적 형변환
		TV tv = new LGTV();
//		TV tv = new SamsungTV();
		tv.powerOn();
		tv.channelDown();
		tv.volumeUp();
		tv.channelUp();
		tv.channelUp();
		tv.powerOff();
	}
}
