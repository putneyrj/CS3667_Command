//package headfirst.designpatterns.command.remote;

public class IncrementHottubTemperature implements Command {
	Hottub hottub;

	public IncrementHottubTemperature(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		int beforeTemperature = hottub.getTemperature();
        hottub.setTemperature(hottub.getTemperature() + 1);
        if (beforeTemperature == hottub.getTemperature()) 
            System.out.println("Hottub temperature cannot go any higher.");
        else System.out.println("Hottub temperature has been raised by one degree.");

	}
}
