package Adapter.entity;


public class main_tab_three_lvadapter_entity {
	private int picture;
	private String address;
	private String name;
	private String rating;
	private String attention;
	public main_tab_three_lvadapter_entity(int picture,String address,String name,
			String rating,String attention){
		this.picture=picture;
		this.address=address;
		this.name=name;
		this.rating=rating;
		this.attention=attention;
	}
	public int getPicture() {
		return picture;
	}
	public void setPicture(int picture) {
		this.picture = picture;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getAttention() {
		return attention;
	}
	public void setAttention(String attention) {
		this.attention = attention;
	}
	
}
