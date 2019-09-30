import java.util.ArrayList;
import java.util.List;

//package headfirst.designpatterns.command.remote;

//
// This is the invoker
//
public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	List<Command> commandLog;
    int undo = 0;
 
	public RemoteControl() {
		onCommands = new Command[8];
		offCommands = new Command[8];
		commandLog = new ArrayList<>();

		Command noCommand = new NoCommand();
        commandLog.add(noCommand);
		for (int i = 0; i < 8; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		commandLog.add(onCommands[slot]);
        undo = commandLog.size() - 1;
	}
 
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		commandLog.add(offCommands[slot]);
        undo = commandLog.size() - 1;
	}
    
    public void undoButtonWasPushed(){
        commandLog.get(undo).undo();
        undo--;
    }

	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
