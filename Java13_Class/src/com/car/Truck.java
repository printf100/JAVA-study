package com.car;

public class Truck extends Car {

	public Truck() {
	}

	public Truck(String color) {
		setColor(color);
	}

	@Override
	public void accelPedal() {
		System.out.println("속도가 느리게 올라갑니다.");
		setSpeed(getSpeed() + 5);
	}

	@Override
	public void breakPedal() {
		setSpeed(getSpeed() - 5);

		if (getSpeed() == 0)
			System.out.println("멈췄습니다.");
		else
			System.out.println("속도가 느리게 내려갑니다.");
	}

	@Override
	public String toString() {

		return getColor() + "의 현재 속도는 " + getSpeed() + "입니다.";
	}
}
