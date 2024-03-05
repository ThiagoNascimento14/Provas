package ProvaDevices;

import java.util.ArrayList;
import java.util.List;

public class Device {
    public static void main(String[] args) {
        List<DeviceInterface> devices = new ArrayList<>();
        devices.add(new Smartphone());
        devices.add(new Laptop());
        devices.add(new SmartTV());

        for (DeviceInterface device : devices) {
            device.performAction();
        }
    }
}
