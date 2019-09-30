//package headfirst.designpatterns.command.remote;

public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.down();
	}

    public void undo(){
        garageDoor.up();
    }
    @Override
	public String display() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}
}
