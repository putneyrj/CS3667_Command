
public class DisplayLog implements Command {
	private RemoteControl rem;
	public DisplayLog(RemoteControl remote) {
		rem = remote;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for (Command i : rem.commandLog) 
            System.out.print(i.display()); 
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return null;
	}
}
