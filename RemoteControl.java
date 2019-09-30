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
    Command undo = new NoCommand();
 
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		commandLog = new ArrayList<>();
 
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
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
        undo = onCommands[slot];
		commandLog.add(onCommands[slot]);
	}
 
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
        undo = offCommands[slot];
		commandLog.add(offCommands[slot]);
	}
    
    public void undoButtonWasPushed(){
        this.undo.undo();
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
