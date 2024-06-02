package com.pennant.propertystudio.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "apartments")
public class Apartments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aprt_id")
    private Integer aprtId;

    @Column(name = "aprt_title", length = 100, nullable = false)
    private String aprtTitle;

    @Column(name = "aprt_cdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date aprtCdate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aprt_proj_id", nullable = false)
    private Project project;

    @Column(name = "aprt_ref_no", length = 20, nullable = false)
    private String aprtRefNo;

    @Column(name = "aprt_status", length = 4)
    private String aprtStatus;

    // Getters and Setters
    public Integer getAprtId() {
        return aprtId;
    }

    public void setAprtId(Integer aprtId) {
        this.aprtId = aprtId;
    }

    public String getAprtTitle() {
        return aprtTitle;
    }

    public void setAprtTitle(String aprtTitle) {
        this.aprtTitle = aprtTitle;
    }

    public Date getAprtCdate() {
        return aprtCdate;
    }

    public void setAprtCdate(Date aprtCdate) {
        this.aprtCdate = aprtCdate;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getAprtRefNo() {
        return aprtRefNo;
    }

    public void setAprtRefNo(String aprtRefNo) {
        this.aprtRefNo = aprtRefNo;
    }

    public String getAprtStatus() {
        return aprtStatus;
    }

    public void setAprtStatus(String aprtStatus) {
        this.aprtStatus = aprtStatus;
    }
}
