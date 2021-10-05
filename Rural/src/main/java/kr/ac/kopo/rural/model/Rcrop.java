package kr.ac.kopo.rural.model;

import org.springframework.web.multipart.MultipartFile;

public class Rcrop {
	private int seq8;
	private String cul;
	private String dat;
	private String area;
	private int nor;
	private int fwe;
	private int dwe;
	private int adwe;
	private int pla;
	private String image;
	private String dep;
	MultipartFile uploadFile;
	
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public int getSeq8() {
		return seq8;
	}
	public void setSeq8(int seq8) {
		this.seq8 = seq8;
	}
	public String getCul() {
		return cul;
	}
	public void setCul(String cul) {
		this.cul = cul;
	}
	public String getDat() {
		return dat;
	}
	public void setDat(String dat) {
		this.dat = dat;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getNor() {
		return nor;
	}
	public void setNor(int nor) {
		this.nor = nor;
	}
	public int getFwe() {
		return fwe;
	}
	public void setFwe(int fwe) {
		this.fwe = fwe;
	}
	public int getDwe() {
		return dwe;
	}
	public void setDwe(int dwe) {
		this.dwe = dwe;
	}
	public int getAdwe() {
		return adwe;
	}
	public void setAdwe(int adwe) {
		this.adwe = adwe;
	}
	public int getPla() {
		return pla;
	}
	public void setPla(int pla) {
		this.pla = pla;
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
