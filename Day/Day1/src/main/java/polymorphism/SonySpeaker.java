package polymorphism;


import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker implements Speaker {
    public SonySpeaker() {
        System.out.println("===> SonySpeaker object generated...");
    }
    public void volumeUp() {
        System.out.println("SonySpeaker --- volume up");
    }
    public void volumeDown() {
        System.out.println("SonySpeaker --- volume down");
    }
}
