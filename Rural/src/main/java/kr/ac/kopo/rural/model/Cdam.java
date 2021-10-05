package kr.ac.kopo.rural.model;

import org.springframework.web.multipart.MultipartFile;

public class Cdam {
	
	private int seq6;
	private String cul;
	private String dat;
	private String vir;
	private String sof;
	private String clu;
	private String bee;
	private String lit;
	private String met;
	private String image;
	private String dep;
	MultipartFile uploadFile;
	
	
	
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public int getSeq6() {
		return seq6;
	}
	public void setSeq6(int seq6) {
		this.seq6 = seq6;
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
	public String getVir() {
		return vir;
	}
	public void setVir(String vir) {
		this.vir = vir;
	}
	public String getSof() {
		return sof;
	}
	public void setSof(String sof) {
		this.sof = sof;
	}
	public String getClu() {
		return clu;
	}
	public void setClu(String clu) {
		this.clu = clu;
	}
	public String getBee() {
		return bee;
	}
	public void setBee(String bee) {
		this.bee = bee;
	}
	public String getLit() {
		return lit;
	}
	public void setLit(String lit) {
		this.lit = lit;
	}
	public String getMet() {
		return met;
	}
	public void setMet(String met) {
		this.met = met;
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
