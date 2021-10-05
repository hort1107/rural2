package kr.ac.kopo.rural.model;

import org.springframework.web.multipart.MultipartFile;

public class Noti {
	
	private int seq13;
	private String name;
	private String con;
	private String image;
	MultipartFile uploadFile;
	
	
	
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public int getSeq13() {
		return seq13;
	}
	public void setSeq13(int seq13) {
		this.seq13 = seq13;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}
