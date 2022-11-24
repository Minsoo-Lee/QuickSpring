package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
    @Autowired
    @Qualifier("apple")
    private Speaker speaker;

    public void powerOn() {
        System.out.println("LG power on");
    }
    public void powerOff() {
        System.out.println("LG power off");
    }
    public void volumeUp() {
        speaker.volumeUp();
    }
    public void volumeDown() {
        speaker.volumeDown();
    }
}
