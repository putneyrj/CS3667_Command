//package headfirst.designpatterns.command.remote;

public class DecrementHottubTemperature implements Command {
	Hottub hottub;

	public DecrementHottubTemperature(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
	    int beforeTemperature = hottub.getTemperature();
        if(hottub.setTemperature(beforeTemperature - 1))
            System.out.println("Hottub temperature has been lowered by one degree.");
	}

    public void undo(){
        int beforeTemperature = hottub.getTemperature();
        if(hottub.setTemperature(beforeTemperature + 1))
            System.out.println("Hottub temperature has been raised by one degree.");
    }
    @Override
	public String display() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}
}
