package polymorphism;

public class SamsungTV implements TV {
	
	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
		
	}
	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void volumeUP() {
		System.out.println("SamsungTV---�Ҹ� �ø���.");
	}
	
	public void volumeDown() {
		System.out.println("SamsungTV---�Ҹ� ������.");
	}
	
	
}
