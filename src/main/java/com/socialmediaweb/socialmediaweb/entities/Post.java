package com.socialmediaweb.socialmediaweb.entities;

public class Post {
	private int post_id;
	private String content;
	private String image;
	private String created_on;
	
	public Post() {
		
	}
	
	public Post(int post_id, String content, String image, String created_on) {
		super();
		this.post_id = post_id;
		this.content = content;
		this.image = image;
		this.created_on = created_on;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCreated_on() {
		return created_on;
	}
	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}

	@Override
	public String toString() {
		return "Post [post_id=" + post_id + ", content=" + content + ", image=" + image + ", created_on=" + created_on
				+ "]";
	}
	
	
	
}


