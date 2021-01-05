package ch08;

public class RemoteControlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		Audio audio = new Audio();  // 객체 생성
		
		tv.turnOn();			// 인터페이스의 멤버를 오버라이딩하여 사용
		tv.setVolume(15);
		tv.setMute(true);
		tv.turnOff();
		
		audio.turnOn();			// 두쪽다 사용방식이 통일됨. 인터페이스를 통해서 규격화됨
		audio.setMute(false);
		audio.setVolume(-10);
		audio.turnOff();
		// 인터페이스도 다형성 구현이 가능함
		// 인터페이스 타입의 변수에 구현 클래스 타입의 객체를 대입할수 있음
		System.out.println("==========인터페이스의 다형성");
		RemoteControl rc;
		rc = tv;
		rc.turnOn();
		rc.setMute(true);
		rc.setVolume(5);
		rc.turnOff();
		
	}

}
