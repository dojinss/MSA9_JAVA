package Day08.Ex02_MultiImplement;

// 인터페이스 다중 상속
// public interface 인터페이스명 extends 인터페이스1, 인터페이스2 .... {}

public interface SmartRemoteControl extends RemoteControl, Microphone {
	
	// 터치패드 기능
	// - x, y 좌표 위치에 터치패드 클릭
	void touch(int x, int y);
}
