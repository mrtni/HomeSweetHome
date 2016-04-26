package Home;

public class Tuner implements Device{
	
	public void on() {
		System.out.println("Tuner is on");	
	}

	public void off() {
		System.out.println("Tuner is off");
	}	
	
	public void setAm(){
		System.out.println("AM mode is set");
	}

	public void setFm(){
		System.out.println("FM mode is set");
	}
	
	public void setFrequency(){
		System.out.println("Set frequency");
	}
	
}
