package kr.ac.kopo.rural.model;

import org.springframework.web.multipart.MultipartFile;

public class Obasic {
	private String cul;
	private int lat;
	private int lon;
	private int pla;
	private int tra;
	private int dry;
	private String image;
	private String dep;
	MultipartFile uploadFile;
	
	
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public String getCul() {
		return cul;
	}
	public void setCul(String cul) {
		this.cul = cul;
	}
	public int getLat() {
		return lat;
	}
	public void setLat(int lat) {
		this.lat = lat;
	}
	public int getLon() {
		return lon;
	}
	public void setLon(int lon) {
		this.lon = lon;
	}
	public int getPla() {
		return pla;
	}
	public void setPla(int pla) {
		this.pla = pla;
	}
	public int getTra() {
		return tra;
	}
	public void setTra(int tra) {
		this.tra = tra;
	}
	public int getDry() {
		return dry;
	}
	public void setDry(int dry) {
		this.dry = dry;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	
	
	
	
}
