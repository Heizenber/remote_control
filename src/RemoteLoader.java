public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room"); // Create a Light object for the living room
        CeilingFan ceilingFan = new CeilingFan("Living Room"); // Create a Ceiling Fan object for the living room
        Stereo stereo = new Stereo("Living Room"); // Create a Stereo object for the living room
        TV tv = new TV("Living Room"); // Create a TV object for the living room
        Hottub hottub = new Hottub(); // Create a Hottub object
        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight); 
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);


        // GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand(garageDoor);
        // GarageDoorDownCommand garageDoorClose = new GarageDoorDownCommand(garageDoor);

        // StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        // StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] partyOn = { livingRoomLightOn, stereoOn, tvOn, hottubOn, ceilingFanHigh };
        Command[] partyOff = { livingRoomLightOff, stereoOff, tvOff, hottubOff, ceilingFanOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
    }
}
