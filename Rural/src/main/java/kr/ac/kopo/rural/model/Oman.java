package kr.ac.kopo.rural.model;

import org.springframework.web.multipart.MultipartFile;

public class Oman {
	
	private int seq;
	private String cul;
	private int total;
	private int basal;
	private int fer;
	private int dress;
	private int irri;
	private String image;
	private String dep;
	MultipartFile uploadFile;
	
	
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getCul() {
		return cul;
	}
	public void setCul(String cul) {
		this.cul = cul;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getBasal() {
		return basal;
	}
	public void setBasal(int basal) {
		this.basal = basal;
	}
	public int getFer() {
		return fer;
	}
	public void setFer(int fer) {
		this.fer = fer;
	}
	public int getDress() {
		return dress;
	}
	public void setDress(int dress) {
		this.dress = dress;
	}
	public int getIrri() {
		return irri;
	}
	public void setIrri(int irri) {
		this.irri = irri;
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
