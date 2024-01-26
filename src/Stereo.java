public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + " stereo is on");
    }

    public void off() {
        System.out.println(this.location + " stereo is off");
    }

    public void setCd() {
        System.out.println(this.location + " stereo is set for CD input");
    }

    public void setDvd() {
        System.out.println(this.location + " stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println(this.location + " stereo is set for Radio");
    }

    public void setVolume(int volume) {
        System.out.println(this.location + " stereo volume set to " + volume);
    }
}
