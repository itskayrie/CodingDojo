public class TestDevice {

	public static void main(String[] args) {
		
		Phone phone1 = new Phone(100);
		phone1.getBattery();
		phone1.makeCall();
		phone1.makeCall();
		phone1.makeCall();
		phone1.playGame();
		phone1.playGame();
		phone1.charge();
		phone1.getBattery();
	}

}