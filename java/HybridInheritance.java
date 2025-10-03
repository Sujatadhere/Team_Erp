
    interface Printer {
    void print();
}
class Device {
    void deviceInfo() {
        System.out.println("This is an electronic device.");
    }
}
class SmartPrinter extends Device implements Printer {
    public void print() {
        System.out.println("Smart Printer is printing documents.");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        SmartPrinter sp = new SmartPrinter();
        sp.deviceInfo();
        sp.print();
    }
}

    

