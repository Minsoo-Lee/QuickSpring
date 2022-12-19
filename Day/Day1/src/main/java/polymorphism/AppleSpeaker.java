package polymorphism;

public class AppleSpeaker implements Speaker {
    public AppleSpeaker() {
        System.out.println("===> AppleSpeaker object generated...");
    }
    public void volumeUp() {
        System.out.println("AppleSpeaker --- volume up");
    }
    public void volumeDown() {
        System.out.println("AppleSpeaker --- volume down");
    }
}
