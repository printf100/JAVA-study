package com.tv;

public class LGTV implements TV {
	
	private int volume;

	@Override
	public int volumeUp() {
		volume += 3;
		
		return volume;
	}

	@Override
	public int volumeDown() {
		volume -= 3;
		
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
