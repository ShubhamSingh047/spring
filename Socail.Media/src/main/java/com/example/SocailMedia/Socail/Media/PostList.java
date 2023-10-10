package com.example.SocailMedia.Socail.Media;

import java.util.ArrayList;

public interface PostList {
	public ArrayList<Post> getAllPost();
	public Post getPost(int i);
	public void setPost(Post post);
	public int size();
}
