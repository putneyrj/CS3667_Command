//package headfirst.designpatterns.command.remote;

public class DecrementHottubTemperature implements Command {
	Hottub hottub;

	public DecrementHottubTemperature(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
	    int beforeTemperature = hottub.getTemperature();
        if(hottub.setTemperature(hottub.getTemperature() - 1))
            System.out.println("Hottub temperature has been lowered by one degree.");
	}

    public void undo(){
        
    }
}
