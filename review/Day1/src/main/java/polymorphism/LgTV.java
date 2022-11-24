package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lg")
public class LgTV implements TV {
    @Autowired
    @Qualifier("apple")
    private Speaker speaker;

    @Override
    public void powerOn() {
        System.out.println("LgTV --- power on");
    }

    @Override
    public void powerOff() {
        System.out.println("LgTV --- power off");
    }

    @Override
    public void volumeUp() {
        speaker.volumeUp();
    }

    @Override
    public void volumeDown() {
        speaker.volumeDown();
    }
}
