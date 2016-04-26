package Home;

public class CdPlayer implements Device {
	
	public void on() {
		System.out.println("Device is on");	
	}

	public void off() {
		System.out.println("Device is off");
	}
	
	public void eject(){
		System.out.println("Eject CD");
	}

	public void play(String cd){
		System.out.println("Play CD");
	}
	
	public void stop(){
		System.out.println("Stop CD");
	}
	
	public void pause(){
		System.out.println("Pause CD");
	}

}
