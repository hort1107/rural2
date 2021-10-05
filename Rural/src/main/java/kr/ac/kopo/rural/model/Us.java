package kr.ac.kopo.rural.model;

import org.springframework.web.multipart.MultipartFile;

public class Us {
	
	private int seq14;
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
	public int getSeq14() {
		return seq14;
	}
	public void setSeq14(int seq14) {
		this.seq14 = seq14;
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
