public class Device {
    // Attribute to hold the battery level
    private int battery;

    // Constructor
    public Device(int battery) {
        this.battery = battery;
    }

    // Getter for battery
    public int getBattery() {
        return battery;
    }

    // Setter for battery
    public void setBattery(int battery) {
        this.battery = battery;
    }

    // Method to return the status of the device
    public String status() {
        if(battery > 75) {
            return "Battery is high";
        } else if(battery > 25) {
            return "Battery is medium";
        } else if(battery > 0) {
            return "Battery is low";
        } else {
            return "Battery is empty";
        }
    }
}
