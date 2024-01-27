public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;
    
    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    public void undo() {
        if (prevSpeed == CeilingFan.Speed.HIGH.ordinal()) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.Speed.MEDIUM.ordinal()) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.Speed.LOW.ordinal()) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.Speed.OFF.ordinal()) {
            ceilingFan.off();
        }
    }
}
