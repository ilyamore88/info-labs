import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCheck {
    /**
     * Выводит информацию о элементах списка deviceList
     * Метод выполняется в {@link #main(String[])}
     *
     * @param deviceList - список объектов класса Device
     */
    static void printList(List<Device> deviceList) {
        for (Device device : deviceList) {
            System.out.println(device.getInfo());
        }
    }

    /**
     * Метод проверяет кратность id числу number у объекта device
     * Метод выполняется в {@link #main(String[])}
     *
     * @param deviceList - список объектов класса Device
     * @param device     - объект класса Device
     * @param number     - число
     */
    static void checkElement(List<Device> deviceList, Device device, int number) {
        if (deviceList.contains(device)) {
            if (device.getId() % number == 0) {
                System.out.println("Id кратен числу " + number);
            }
        } else {
            throw new RuntimeException("device isn't in deviceList");
        }
    }

    public static void main(String[] args) {
        List<Device> deviceList = new ArrayList<>();
        List<Device> linkedDeviceList = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            deviceList.add(new Device(i, i % 14));
            linkedDeviceList.add(new Device(i, i % 18));
        }
        printList(deviceList);
        printList(linkedDeviceList);
        Device device = deviceList.get(14);
        checkElement(deviceList, device, 7);
        device = linkedDeviceList.get(18);
        checkElement(linkedDeviceList, device, 9);
    }
}
