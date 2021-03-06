//package headfirst.designpatterns.command.remote;

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}

    public void undo(){
        ceilingFan.prevState(); 
    }
    @Override
	public String display() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}

}
