package Home;

public class DvdPlayer implements Device {

	public void on() {
		System.out.println("Device is on");
	}

	public void off() {
		System.out.println("Device is off");		
	}
	
	public void eject(){
		System.out.println("Eject DVD");
	}
	
	public void play(String dvd){
		System.out.println("Play DVD");
	}
	
	public void stop(){
		System.out.println("Stop DVD");
	}
	
	public void pause(){
		System.out.println("Pause DVD");
	}
	
}
