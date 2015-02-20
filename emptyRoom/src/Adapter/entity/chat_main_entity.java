package Adapter.entity;

public class chat_main_entity {
	private boolean isSelf=true;
	private int photo;
	private String content;
	private String date;
	public chat_main_entity(boolean isSelf,int photo,String content,String date){
		this.isSelf=isSelf;
		this.photo=photo;
		this.content=content;
		this.date=date;
	}
	public boolean isSelf() {
		return isSelf;
	}
	public void setSelf(boolean isSelf) {
		this.isSelf = isSelf;
	}
	public int getPhoto() {
		return photo;
	}
	public void setPhoto(int photo) {
		this.photo = photo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
