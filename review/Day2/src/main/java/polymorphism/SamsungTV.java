package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("samsung")
public class SamsungTV implements TV {
    @Autowired
    @Qualifier("sony")
    private Speaker speaker;
    private int price;

    public SamsungTV() {
        System.out.println("===> SamsungTV constructed");
    }
    public SamsungTV(Speaker speaker) {
        System.out.println("===> SamsungTV(2) constructed");
        this.speaker = speaker;
    }
    public SamsungTV(Speaker speaker, int price) {
        System.out.println("===> SamsungTV(3) constructed");
        this.speaker = speaker;
        this.price = price;
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
        System.out.println("SamsungTV --- power on");
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
