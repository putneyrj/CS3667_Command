//package headfirst.designpatterns.command.remote;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}
}
