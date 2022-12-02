package com.kh.chap01_list.part01_arrayList.model.vo;

public class Music {

	
	private String title;
	private String arttist;
	
	
	public Music() {
		
		
	}


	public Music(String title, String arttist) {
		super();
		this.title = title;
		this.arttist = arttist;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getArttist() {
		return arttist;
	}


	public void setArttist(String arttist) {
		this.arttist = arttist;
	}


	@Override
	public String toString() {
		return "Music [title=" + title + ", arttist=" + arttist + "]";
	}
	
	
	
	
	
	
}
