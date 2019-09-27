//package headfirst.designpatterns.command.remote;

public class DecrementHottubTemperature implements Command {
	Hottub hottub;

	public DecrementHottubTemperature(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
	    int beforeTemperature = hottub.getTemperature();
        hottub.setTemperature(hottub.getTemperature() - 1);
        if (beforeTemperature == hottub.getTemperature()) 
            System.out.println("Hottub temperature cannot go any lower.");
        else System.out.println("Hottub temperature has been lowered by one degree.");
	}
}
