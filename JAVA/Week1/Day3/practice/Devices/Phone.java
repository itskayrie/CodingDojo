public class Phone extends Device {
    // Constructor
    public Phone(int battery) {
        super(battery);
    }

    // Method to simulate making a call
    public void makeCall() {
        if (getBattery() > 0) {
            // Assuming making a call consumes 10% battery
            setBattery(getBattery() - 10);
            System.out.println("Making a call. Battery is now: " + getBattery() + "%");
        } else {
            System.out.println("Cannot make a call. Battery is empty.");
        }
    }

    // Method to simulate playing a game
    public void playGame() {
        if (getBattery() > 0) {
            // Assuming playing a game consumes 20% battery
            setBattery(getBattery() - 20);
            System.out.println("Playing a game. Battery is now: " + getBattery() + "%");
        } else {
            System.out.println("Cannot play game. Battery is empty.");
        }
    }

    // Method to charge the phone
    public void charge() {
        // Assuming charging the phone increases battery to 100%
        setBattery(100);
        System.out.println("Phone is charged. Battery is now: " + getBattery() + "%");
    }
}
