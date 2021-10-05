package kr.ac.kopo.rural.model;

import org.springframework.web.multipart.MultipartFile;

public class Pdam {
	
	private int seq12;
	private String cul;
	private String dat;
	private String phy;
	private String ant;
	private String ori;
	private String thr;
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
	public int getSeq12() {
		return seq12;
	}
	public void setSeq12(int seq12) {
		this.seq12 = seq12;
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
	public String getPhy() {
		return phy;
	}
	public void setPhy(String phy) {
		this.phy = phy;
	}
	public String getAnt() {
		return ant;
	}
	public void setAnt(String ant) {
		this.ant = ant;
	}
	public String getOri() {
		return ori;
	}
	public void setOri(String ori) {
		this.ori = ori;
	}
	public String getThr() {
		return thr;
	}
	public void setThr(String thr) {
		this.thr = thr;
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
