package kr.ac.kopo.rural.model;

import org.springframework.web.multipart.MultipartFile;

public class Ocrop {
	
	private int seq2;
	private String cul;
	private String dat;
	private String area;
	private int nor;
	private int bol;
	private int fre;
	private int udry;
	private int adry;
	private int dia;
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
	public int getSeq2() {
		return seq2;
	}
	public void setSeq2(int seq2) {
		this.seq2 = seq2;
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
	public int getBol() {
		return bol;
	}
	public void setBol(int bol) {
		this.bol = bol;
	}
	public int getFre() {
		return fre;
	}
	public void setFre(int fre) {
		this.fre = fre;
	}
	public int getUdry() {
		return udry;
	}
	public void setUdry(int udry) {
		this.udry = udry;
	}
	public int getAdry() {
		return adry;
	}
	public void setAdry(int adry) {
		this.adry = adry;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
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
