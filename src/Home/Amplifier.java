package Home;

public class Amplifier implements Device {

	Tuner tuner;
	CdPlayer cdPlayer;
	DvdPlayer dvdPlayer;
	
	public Amplifier(Tuner tuner, CdPlayer cdPlayer, DvdPlayer dvdPlayer) {
		this.tuner = tuner;
		this.cdPlayer = cdPlayer;
		this.dvdPlayer = dvdPlayer;
	}
	
	public void on() {
		System.out.println("Device is on");
	}

	public void off() {
		System.out.println("Device is off");
	}
	
	public void setStereoSound() {
		System.out.println("Set stereo sound");
	}
	
	public void setVolume(int level) {
		System.out.println("Set volume");
	}

	public void setTuner(Tuner t) {
		System.out.println("Set tuner");
	}
	
	public void setDvd(DvdPlayer dvd) {
		System.out.println("Set DVD");
	}
	
	public void setCd(CdPlayer cd) {
		System.out.println("Set CD");
	}

}
