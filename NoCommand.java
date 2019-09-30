//package headfirst.designpatterns.command.remote;

public class NoCommand implements Command {
	public void execute() { }
    public void undo() { }
    @Override
	public String display() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}
 
   
}
