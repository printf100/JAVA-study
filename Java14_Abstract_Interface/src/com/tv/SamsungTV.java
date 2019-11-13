package com.tv;

public class SamsungTV implements TV {

	private int volume;
	
	@Override
	public int volumeUp() {
		volume += 2;
		
		return volume;
	}

	@Override
	public int volumeDown() {
		volume -= 2;
		
		return volume;
	}

	
	// getter & setter
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
