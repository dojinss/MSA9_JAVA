package Day08.Ex02_MultiImplement;

public interface Microphone {
	int inputVolumeMax = 50;
	int inputVolumeMin = 0;
	
	// 음성 인식
	String receiveVoice(String voice);
}
