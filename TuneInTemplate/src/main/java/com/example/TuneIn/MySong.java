package com.example.TuneIn;

/*
 * 1. Add class attributes.
 * 2. Override all the interface methods.
 * 3. Implement setter injection
 */

public class MySong implements Song {
	@Override

    public String getSongName() {
		return "Hello";
	}

	@Override
    public void setName(String name) {
		System.out.println(name);
	}
}
