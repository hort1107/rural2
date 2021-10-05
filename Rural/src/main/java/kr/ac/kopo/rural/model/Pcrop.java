package kr.ac.kopo.rural.model;

import org.springframework.web.multipart.MultipartFile;

public class Pcrop {
	private int seq11;
	private String cul;
	private String dat;
	private String area;
	private int plan;
	private int per;
	private int fwe;
	private int ldr;
	private int sdr;
	private int pla;
	private int fru;
	private String image;
	private String dep;
	MultipartFile uploadFile;
	
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public int getSeq11() {
		return seq11;
	}
	public void setSeq11(int seq11) {
		this.seq11 = seq11;
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
	public int getPlan() {
		return plan;
	}
	public void setPlan(int plan) {
		this.plan = plan;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	public int getFwe() {
		return fwe;
	}
	public void setFwe(int fwe) {
		this.fwe = fwe;
	}
	public int getLdr() {
		return ldr;
	}
	public void setLdr(int ldr) {
		this.ldr = ldr;
	}
	public int getSdr() {
		return sdr;
	}
	public void setSdr(int sdr) {
		this.sdr = sdr;
	}
	public int getPla() {
		return pla;
	}
	public void setPla(int pla) {
		this.pla = pla;
	}
	public int getFru() {
		return fru;
	}
	public void setFru(int fru) {
		this.fru = fru;
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
