package com.car;

public class SportsCar extends Car {

	public SportsCar() {
	}

	public SportsCar(String color) {
		setColor(color);
	}

	@Override
	public void accelPedal() {
		System.out.println("속도가 빠르게 올라갑니다.");
		setSpeed(getSpeed()+15);
	}

	@Override
	public void breakPedal() {
		setSpeed(getSpeed()-15);
		
		if(getSpeed() == 0)
			System.out.println("멈췄습니다.");
		else
			System.out.println("속도가 빠르게 내려갑니다.");
	}

	@Override
	public String toString() {

		return getColor() + "의 현재 속도는 " + getSpeed() + "입니다.";
	}
}
