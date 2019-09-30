
public class DisplayLog implements Command {
	private RemoteControl rem;
	public DisplayLog(RemoteControl remote) {
		rem = remote;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("\nRemote's Display Log:\n");
        for (Command i : rem.commandLog) 
            System.out.println(i.display()); 
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
