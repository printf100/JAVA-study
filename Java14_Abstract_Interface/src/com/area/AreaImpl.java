package com.area;

public abstract class AreaImpl implements Area {
	
	private String result;

	@Override
	public void print() {
		System.out.println(PRINT + result);
	}

	public abstract void make();

	public void setResult(String result) {
		this.result = result;
	}
}
