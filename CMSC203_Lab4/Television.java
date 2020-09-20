/** 
*The purpose of this class is to model a television
*Paul Beltran 9/17
*/

public class Television {
	private final String MANUFACTURER;
	//television manufacturer
	
	private final int SCREEN_SIZE;
	//television screen size
	
	private boolean powerOn;
	//Describes whether the power of the television is on or off
	
	private int channel;
	//Describes the channel the TV is on
	
	private int volume;
	//Describes the volume of the TV
	
	
	
	
	public Television(String brand, int screenSize) {
		SCREEN_SIZE = screenSize;
		MANUFACTURER = brand;
		
		powerOn = false;
		volume = 20;
		channel = 2;
		//initializes television
	}
	
	public int getVolume() {
		return volume;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
	public void setChannel(int c) {
		channel = c;
	}
	
	public void power() {
		powerOn = !powerOn;
	}
	
	public void increaseVolume() {
		volume++;
	}
	
	public void decreaseVolume() {
		volume--;
	}
	
}

