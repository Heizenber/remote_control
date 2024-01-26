public class CeilingFan {
    String location;

    public CeilingFan(String location) {
        this.location = location;
    }


    public void on() {
        System.out.println(this.location + " ceiling fan is on");
    }

    public void off() {
        System.out.println(this.location + " ceiling fan is off");
    }

    public void high() {
        System.out.println("Ceiling fan is on high");
    }

    public void medium() {
        System.out.println("Ceiling fan is on medium");
    }

    public void low() {
        System.out.println("Ceiling fan is on low");
    }

}
