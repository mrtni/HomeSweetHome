package Home;

public class Projector implements Device {

	public void on() {
		System.out.println("Projector is on");
	}

	public void off() {
		System.out.println("Projector is off");
	}
	
	public void wideScreenMode() {
		System.out.println("Projector is in wide-screen mode");
	}
	
	public void tvMode() {
		System.out.println("Projector is in TV mode");
	}

}
