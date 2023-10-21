package com.example.TuneIn;

/*
 * 1. Add class attributes.
 * 2. Override all the interface methods.
 * 3. Implement setter injection
 */

public class MyUser implements User {
	Playlist playlist;
	
	@Override
	public void setUserDetail(String name,Integer age) {
		System.out.println(name+" "+age);
	}
	
	@Override
    public Playlist getPlaylist() {
		return playlist;
	}
}
