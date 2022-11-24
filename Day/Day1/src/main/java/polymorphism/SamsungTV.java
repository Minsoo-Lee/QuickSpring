package polymorphism;

public class SamsungTV implements TV {
    private Speaker speaker;
    private int price;

    public SamsungTV() {
        System.out.println("Samsung constructed");
    }
    public void setSpeaker(Speaker speaker) {
        System.out.println("setSpeaker called");
        this.speaker = speaker;
    }
    public void setPrice(int price) {
        System.out.println("setPrice called");
        this.price = price;
    }
//    public SamsungTV(Speaker speaker) {
//        System.out.println("Samsung 2 constructed");
//        this.speaker = speaker;
//    }
//    public SamsungTV(Speaker speaker, int price) {
//        System.out.println("Samsung 3 constructed");
//        this.speaker = speaker;
//        this.price = price;
//    }

    public void powerOn() {
        System.out.println("Samsung power on " + price);
    }
    public void powerOff() {
        System.out.println("Samsung power off");
    }
    public void volumeUp() {
        speaker.volumeUp();
    }
    public void volumeDown() {
        speaker.volumeDown();
    }
}
