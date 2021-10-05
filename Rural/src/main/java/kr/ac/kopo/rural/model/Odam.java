package kr.ac.kopo.rural.model;

import org.springframework.web.multipart.MultipartFile;

public class Odam {
	
	private int seq3;
	private String cul;
	private String dat;
	private String dow;
	private String pur;
	private String leaf;
	private String white;
	private String delia;
	private String meteo;
	private String image;
	private String dep;
	MultipartFile uploadFile;
	
	
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public int getSeq3() {
		return seq3;
	}
	public void setSeq3(int seq3) {
		this.seq3 = seq3;
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
	public String getDow() {
		return dow;
	}
	public void setDow(String dow) {
		this.dow = dow;
	}
	public String getPur() {
		return pur;
	}
	public void setPur(String pur) {
		this.pur = pur;
	}
	public String getLeaf() {
		return leaf;
	}
	public void setLeaf(String leaf) {
		this.leaf = leaf;
	}
	public String getWhite() {
		return white;
	}
	public void setWhite(String white) {
		this.white = white;
	}
	public String getDelia() {
		return delia;
	}
	public void setDelia(String delia) {
		this.delia = delia;
	}
	public String getMeteo() {
		return meteo;
	}
	public void setMeteo(String meteo) {
		this.meteo = meteo;
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
