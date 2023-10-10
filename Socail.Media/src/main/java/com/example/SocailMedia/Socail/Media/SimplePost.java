package com.example.SocailMedia.Socail.Media;

public class SimplePost implements Post {
	
	private String message;

	@Override
	public void setMassage(String message) {
		// TODO Auto-generated method stub
		this.message=message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
