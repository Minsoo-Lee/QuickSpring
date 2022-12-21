package polymorphism;

public class SamsungTV implements TV {
    private Speaker speaker;
    private int price;

    public SamsungTV() {
        System.out.println("===> SamsungTV(1) object generated");
    }
    public void setSpeaker(Speaker speaker) {
        System.out.println("===> setSpeaker() called");
        this.speaker = speaker;
    }
    public void setPrice(int price) {
        System.out.println("===> setPrice() called");
        this.price = price;
    }
    public void powerOn() {
        System.out.println("SamsungTV --- power on (price : " + price + ")");
    }
    public void powerOff() {
        System.out.println("SamsungTV --- power off");
    }
    public void volumeUp() {
        speaker.volumeUp();
    }
    public void volumeDown() {
        speaker.volumeDown();
    }
}
