//package headfirst.designpatterns.command.remote;

public class StereoOffCommand implements Command {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}
}
