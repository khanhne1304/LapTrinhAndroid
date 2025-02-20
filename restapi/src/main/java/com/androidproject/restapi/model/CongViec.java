package com.androidproject.restapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "CongViec")
public class CongViec {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maCongViec;

    @ManyToOne
    @JoinColumn(name = "maDuAn", nullable = false)
    private DuAn duAn;

    @Column(nullable = false)
    private String tenCongViec;

    @Column(columnDefinition = "NVARCHAR(MAX)")
    private String moTa;

	public int getMaCongViec() {
		return maCongViec;
	}

	public void setMaCongViec(int maCongViec) {
		this.maCongViec = maCongViec;
	}

	public DuAn getDuAn() {
		return duAn;
	}

	public void setDuAn(DuAn duAn) {
		this.duAn = duAn;
	}

	public String getTenCongViec() {
		return tenCongViec;
	}

	public void setTenCongViec(String tenCongViec) {
		this.tenCongViec = tenCongViec;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
    
    
}
