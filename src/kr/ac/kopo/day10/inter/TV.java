package kr.ac.kopo.day10.inter;
// 인터페이스
// 모든메소드는 추상메소드로 인식. 
// 모든 변수는 상수변수로 인식.

public interface TV {
	/*public static final*/	int MIN_VOLUME_SIZE = 0;
	/*public static final*/	int MAX_VOLUME_SIZE = 50;
	

	/**
	 * 전원을 켜는 기능
	 */
	// 접근제한자가 public일 경우 문서화 주석을 쓴다. 문서화주석을 다는 경우 다른 메소드에서 사용할때 뜨게 된다.
	void powerOn();
	/* public abstract */ void powerOff();
	void channelUp();
	void channelDown();
	void volumeUp();
	void volumeDown();
	void mute();
	
	// 
}
