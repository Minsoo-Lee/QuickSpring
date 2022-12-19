package polymorphism;

public class SamsungTV implements TV {
    public void initMethod() {
        System.out.println("initializing object...");
    }
    public void destroyMethod() {
        System.out.println("destroying object...");
    }
    public SamsungTV() {
        System.out.println("===> SamsungTV object generated");
    }
    public void powerOn() {
        System.out.println("SamsungTV --- power on");
    }
    public void powerOff() {
        System.out.println("SamsungTV --- power off");
    }
    public void volumeUp() {
        System.out.println("SamsungTV --- volume up");
    }
    public void volumeDown() {
        System.out.println("SamsungTV --- volume down");
    }
}
