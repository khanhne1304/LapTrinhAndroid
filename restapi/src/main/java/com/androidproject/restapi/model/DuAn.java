package com.androidproject.restapi.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "DuAn")
public class DuAn {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaDuAn")
	private int maDuAn;


	@Column(name = "TenDuAn", nullable = false)
	private String tenDuAn;

	@Column(name = "MoTa", columnDefinition = "NVARCHAR(MAX)")
	private String moTa;


    @OneToMany(mappedBy = "duAn", cascade = CascadeType.ALL)
    private List<CongViec> congViecs;

	public int getMaDuAn() {
		return maDuAn;
	}

	public void setMaDuAn(int maDuAn) {
		this.maDuAn = maDuAn;
	}

	public String getTenDuAn() {
		return tenDuAn;
	}

	public void setTenDuAn(String tenDuAn) {
		this.tenDuAn = tenDuAn;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public List<CongViec> getCongViecs() {
		return congViecs;
	}

	public void setCongViecs(List<CongViec> congViecs) {
		this.congViecs = congViecs;
	}
    
    
}
