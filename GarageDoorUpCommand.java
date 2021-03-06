//package headfirst.designpatterns.command.remote;

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}

    public void undo(){
        garageDoor.down();
    }
    @Override
	public String display() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}
}
