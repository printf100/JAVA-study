package com.profile;

public class MyProfile extends Profile implements Display, Job {

	private String loc;

	public MyProfile(String name, String phone) {
		super(name, phone);
	}
	
	@Override
	public void jobLoc(String loc) {	// setter
		this.loc = loc;
	}

	@Override
	public void display() {
		prn();
		System.out.println("회사주소 : " + loc);
		System.out.println("회사직종 : " + JOB_ID);
		// super.JOB_ID (X) -> super는 부모 클래스를 의미하기 때문에 ( JOB_ID 는 인터페이스에 있음 )
	}
}
