package Day08.Ex02_MultiImplement;

public interface RemoteControl {
	
	int MAX_VOLUME = 50;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	void setChannel(int channel);
	
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("음소거 설정 되었습니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("음소거 해제 되었습니다.");
			setVolume(10);			
		}
	}
	
	static void changeBattery() {
		System.out.println("배터리 교체");
	}
	
}
