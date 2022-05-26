package kr.ac.kopo.day10.inter;
// 인터페이스를 상속받은 경우 추상메소드를 오버라이딩
// or 추상클래스(abstract)로 만들어 준다.
public class LGTV implements TV{
	
	private boolean power;
	private int volumeSize;
	private int channelNo;
	// LGTV를 상속받은 tv 브랜드들만 MAX_CHANNEL_SIZE 사용가능
	protected static final int MAX_CHANNEL_SIZE = 100;	 // 0 ~ 99 
	
	public LGTV() {
		System.out.println("LGTV를 구매했습니다");
		power = false;
		volumeSize = 10;
		channelNo = 3;
	}

	@Override
	public void powerOn() {
		power = true;
		System.out.println("전원을 켭니다");
		info();
		
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("전원을 끕니다");
		
	}

	@Override
	public void channelUp() {	
		channelNo = ++channelNo % LGTV.MAX_CHANNEL_SIZE; // 상수명의 경우 무조건 소속관계를 명시해주는 것이 좋다. 이름이 같은 상수가 있을 수도 있고 상수는 상속관계가 아니여도 사용가능하기 때문에
		System.out.println("채널을 올립니다.");
		info();
	}

	@Override
	public void channelDown() {
		if(channelNo == 0) {
			channelNo = LGTV.MAX_CHANNEL_SIZE;
		}
		channelNo--;
		System.out.println("채널을 낮춥니다.");
		info();
	}

	@Override
	public void volumeUp() {
		if(volumeSize < TV.MAX_VOLUME_SIZE) {
			volumeSize++;
		}
		System.out.println("음량을 높입니다.");
		info();
	}

	@Override
	public void volumeDown() {
		if(volumeSize > TV.MIN_VOLUME_SIZE) {
			volumeSize--;
		}
		System.out.println("음량을 낮춥니다.");
		info();		
	}

	@Override
	public void mute() {
		volumeSize = TV.MIN_VOLUME_SIZE;
		System.out.println("음소거 중 입니다.");
		info();				
	}
	
	public void info() {
		System.out.println("채널번호 : " + channelNo 
					+ ", 음량크기 : " + volumeSize);
	}

}
