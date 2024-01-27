public class CeilingFanLowCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;
    
    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
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
