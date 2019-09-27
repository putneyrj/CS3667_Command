//package headfirst.designpatterns.command.remote;

public class Hottub {
	boolean on;
	int temperature;
    public final static int MAX_TEMPERATURE = 110;
    public final static int MIN_TEMPERATURE = 80;

	public Hottub() {
	    temperature = 105;
    }

	public void on() {
		on = true;
	}

	public void off() {
		on = false;
	}

	public void bubblesOn() {
		if (on) {
			System.out.println("Hottub is bubbling!");
		}
	}

	public void bubblesOff() {
		if (on) {
			System.out.println("Hottub is not bubbling");
		}
	}

	public void jetsOn() {
		if (on) {
			System.out.println("Hottub jets are on");
		}
	}

	public void jetsOff() {
		if (on) {
			System.out.println("Hottub jets are off");
		}
	}

	public boolean setTemperature(int temperature) {
		if (on){
            int prevTemp = temperature;
            if(temperature < MIN_TEMPERATURE){
                temperature = MIN_TEMPERATURE;
                System.out.println("Hottub temperature cannot go any lower.");
            }
            if(temperature > MAX_TEMPERATURE){
                temperature = MAX_TEMPERATURE;
                System.out.println("Hottub temperature cannot go any higher.");
            }
            this.temperature = temperature;
            
            if (prevTemp != temperature) return true;
            else return false;
        }
	}

    public void changeTemperature(int temperature){

    
    public int getTemperature() {
		return temperature;
	}

	public void heat() {
		temperature = 105;
		System.out.println("Hottub is heating to a steaming 105 degrees");
	}

	public void cool() {
		temperature = 98;
		System.out.println("Hottub is cooling to 98 degrees");
	}

}
