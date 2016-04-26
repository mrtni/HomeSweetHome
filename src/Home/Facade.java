package Home;

public class Facade {

	private Amplifier amplifier;
	private Tuner tuner;
	private CdPlayer cdPlayer;
	private DvdPlayer dvdPlayer;
	private Projector projector;
	private Lights lights;
	
	public Facade() {
		amplifier = new Amplifier(tuner, cdPlayer, dvdPlayer);
		tuner = new Tuner();
		cdPlayer = new CdPlayer();
		dvdPlayer = new DvdPlayer();
		projector = new Projector();
		lights = new Lights();
	}
	
	public void on() {
		amplifier.on();
		tuner.on();
		cdPlayer.on();
		dvdPlayer.on();
		projector.on();
		lights.on();
	}
	
}
