package polymorphism;

public class LgTV implements TV {
	
	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
		
	}
	public void powerOff() {
		System.out.println("LgTV---전원 끝다.");
	}

	public void volumeUP() {
		System.out.println("LgTV---소리 올린다.");
	}
	
	public void volumeDown() {
		System.out.println("LgTV---소리 내린다.");
	}
}