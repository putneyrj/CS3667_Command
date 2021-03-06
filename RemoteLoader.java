//package headfirst.designpatterns.command.remote;

public class RemoteLoader {
 
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
 
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();
        DisplayLog dis = new DisplayLog(remoteControl);
        NoCommand no = new NoCommand();
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = 
				new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = 
				new LightOffCommand(kitchenLight);
  
		CeilingFanOnCommand ceilingFanOn = 
				new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
 
		GarageDoorUpCommand garageDoorUp =
				new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown =
				new GarageDoorDownCommand(garageDoor);
 
		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff =
				new StereoOffCommand(stereo);
        HottubOffCommand hottubOffCommand = 
                new HottubOffCommand(hottub);
        HottubOnCommand hottubOnCommand = 
                new HottubOnCommand(hottub);
        IncrementHottubTemperature IncrementHottubTemperatureCommand = 
                new IncrementHottubTemperature(hottub);
        DecrementHottubTemperature DecrementHottubTemperatureCommand = 
                new  DecrementHottubTemperature(hottub);
        
        Command[] partyModeOnArr = {hottubOnCommand, livingRoomLightOn, kitchenLightOn,
                                 stereoOnWithCD};
	    Command[] partyModeOffArr = {hottubOffCommand, livingRoomLightOff, kitchenLightOff,
                                 stereoOff};
        MacroCommand partyModeOn = new MacroCommand(partyModeOnArr);
        MacroCommand partyModeOff = new MacroCommand(partyModeOffArr);
         
	
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, hottubOnCommand, hottubOffCommand);
        remoteControl.setCommand(5, IncrementHottubTemperatureCommand, DecrementHottubTemperatureCommand);
        remoteControl.setCommand(6, no, dis);
        remoteControl.setCommand(7, partyModeOn, partyModeOff);

		System.out.println(remoteControl);
 
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.onButtonWasPushed(5);
        remoteControl.onButtonWasPushed(5);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(5);
        remoteControl.onButtonWasPushed(5);
        remoteControl.onButtonWasPushed(5);
        remoteControl.onButtonWasPushed(5);
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(4);
        remoteControl.onButtonWasPushed(7);
        remoteControl.offButtonWasPushed(7);
        remoteControl.offButtonWasPushed(6);
	}
}
