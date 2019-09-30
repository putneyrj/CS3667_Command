//package headfirst.designpatterns.command.remote;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
 
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}
}
