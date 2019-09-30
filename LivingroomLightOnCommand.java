//package headfirst.designpatterns.command.remote;

public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}
}
