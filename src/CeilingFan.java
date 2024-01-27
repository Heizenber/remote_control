public class CeilingFan {
    public enum Speed { OFF, LOW, MEDIUM, HIGH };
    String location;
    Speed speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = Speed.OFF;
    }

    public int getSpeed() {
        return this.speed.ordinal();
    }

    public void off() {
        System.out.println(this.location + " ceiling fan is off");
        speed = Speed.OFF;
    }

    public void high() {
        System.out.println(this.location + " ceiling fan is on high");
        speed = Speed.HIGH;
    }

    public void medium() {
        System.out.println(this.location + " ceiling fan is on medium");
        speed = Speed.MEDIUM;
    }

    public void low() {
        System.out.println(this.location + " ceiling fan is on low");
        speed = Speed.LOW;
    }

}
