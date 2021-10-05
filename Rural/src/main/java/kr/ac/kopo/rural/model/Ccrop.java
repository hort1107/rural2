package kr.ac.kopo.rural.model;

import org.springframework.web.multipart.MultipartFile;

public class Ccrop {
	
	private int seq5;
	private String cul;
	private String dat;
	private String area;
	private int nor;
	private int non;
	private int fre;
	private int adry;
	private int hea;
	private int pla;
	private int lea;
	private String image;
	private String dep;
	MultipartFile uploadFile;
	
	
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public int getSeq5() {
		return seq5;
	}
	public void setSeq5(int seq5) {
		this.seq5 = seq5;
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
	public int getNon() {
		return non;
	}
	public void setNon(int non) {
		this.non = non;
	}
	public int getFre() {
		return fre;
	}
	public void setFre(int fre) {
		this.fre = fre;
	}
	public int getAdry() {
		return adry;
	}
	public void setAdry(int adry) {
		this.adry = adry;
	}
	public int getHea() {
		return hea;
	}
	public void setHea(int hea) {
		this.hea = hea;
	}
	public int getPla() {
		return pla;
	}
	public void setPla(int pla) {
		this.pla = pla;
	}
	public int getLea() {
		return lea;
	}
	public void setLea(int lea) {
		this.lea = lea;
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
