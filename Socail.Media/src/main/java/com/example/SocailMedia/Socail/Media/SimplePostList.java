package com.example.SocailMedia.Socail.Media;

import java.util.ArrayList;

public class SimplePostList implements PostList{
	
	ArrayList<Post> list;
	
	public SimplePostList() {
		this.list=new ArrayList<Post>();
	}
	
	@Override
	public ArrayList<Post> getAllPost(){
		return this.list;
	}
	
	@Override
	public Post getPost(int i) {
		return this.list.get(i);
	}
	
	@Override
	public void setPost(Post post) {
		this.list.add(post);
	}
	
	@Override
	public int size() {
		return this.list.size();
	}
}
