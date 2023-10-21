package com.example.TuneIn;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. Add class attributes.
 * 2. Override all the interface methods.
 * 3. Implement setter injection
 */

public class MyPlaylist implements Playlist {
	List<Song> li=new ArrayList();
	Song song;
	Integer count;
	
	public void addSong(Song song) {
		this.song=song;
	}
	
	@Override
	public List<Song> getPlaylistSongs(){
		return li;
	}
	
	@Override
	public Integer getCount() {
		return count;
	}
}