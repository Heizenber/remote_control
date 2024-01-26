public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room"); // Create a Light object for the living room
        Light kitchenLight = new Light("Kitchen"); // Create a Light object for the kitchen
        CeilingFan ceilingFan = new CeilingFan("Living Room"); // Create a Ceiling Fan object for the living room
        GarageDoor garageDoor = new GarageDoor("Garage"); // Create a Garage Door object
        Stereo stereo = new Stereo("Living Room"); // Create a Stereo object for the living room

        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight); 
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorClose = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff); // Set the living room light to slot 0
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff); // Set the kitchen light to slot 1
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff); // Set the ceiling fan to slot 2
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff); // Set the stereo to slot 3

        System.out.println(remoteControl); // Print the remote control

        remoteControl.onButtonWasPushed(0); // Turn on the living room light
        remoteControl.offButtonWasPushed(0); // Turn off the living room light
        remoteControl.onButtonWasPushed(1); // Turn on the kitchen light
        remoteControl.offButtonWasPushed(1); // Turn off the kitchen light
        remoteControl.onButtonWasPushed(2); // Turn on the ceiling fan
        remoteControl.offButtonWasPushed(2); // Turn off the ceiling fan
        remoteControl.onButtonWasPushed(3); // Turn on the stereo
        remoteControl.offButtonWasPushed(3); // Turn off the stereo
    }
}
