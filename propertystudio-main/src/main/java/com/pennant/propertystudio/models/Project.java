package com.pennant.propertystudio.models;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proj_id")
    private Integer projId;

    @Column(name = "proj_title", length = 100, nullable = false)
    private String projTitle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proj_prty_id", nullable = false)
    private ProjectTypes projectType;

    @Column(name = "proj_location", length = 100, nullable = false)
    private String projLocation;

    @Column(name = "proj_cdate")
    @Temporal(TemporalType.DATE)
    private Date projCdate;

    @Column(name = "proj_desc", length = 255)
    private String projDesc;

    
    @Column(name = "proj_banner", length = 255) // Adjust length as needed
    private String projBanner;

    @Column(name = "proj_coordinates")
    private String projCoordinates; // Alternatively, you can use appropriate spatial types

    @Column(name = "proj_construction_status", length = 4)
    private String projConstructionStatus;

    @Column(name = "proj_status", length = 4)
    private String projStatus;

    @Column(name = "proj_luudate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date projLuudate;

    @Column(name = "proj_luausr_id")
    private Integer projLuausrId;

    // Bi-directional mapping
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Apartments> apartments;

    // Getters and Setters
    public Integer getProjId() {
        return projId;
    }

    public void setProjId(Integer projId) {
        this.projId = projId;
    }

    public String getProjTitle() {
        return projTitle;
    }

    public void setProjTitle(String projTitle) {
        this.projTitle = projTitle;
    }

    public ProjectTypes getProjectType() {
        return projectType;
    }

    public void setProjectType(ProjectTypes projectType) {
        this.projectType = projectType;
    }

    public String getProjLocation() {
        return projLocation;
    }

    public void setProjLocation(String projLocation) {
        this.projLocation = projLocation;
    }

    public Date getProjCdate() {
        return projCdate;
    }

    public void setProjCdate(Date projCdate) {
        this.projCdate = projCdate;
    }

    public String getProjDesc() {
        return projDesc;
    }

    public void setProjDesc(String projDesc) {
        this.projDesc = projDesc;
    }

    public String getProjBanner() {
        return projBanner;
    }

    public void setProjBanner(String projBanner) {
        this.projBanner = projBanner;
    }

    public String getProjCoordinates() {
        return projCoordinates;
    }

    public void setProjCoordinates(String projCoordinates) {
        this.projCoordinates = projCoordinates;
    }

    public String getProjConstructionStatus() {
        return projConstructionStatus;
    }

    public void setProjConstructionStatus(String projConstructionStatus) {
        this.projConstructionStatus = projConstructionStatus;
    }

    public String getProjStatus() {
        return projStatus;
    }

    public void setProjStatus(String projStatus) {
        this.projStatus = projStatus;
    }

    public Date getProjLuudate() {
        return projLuudate;
    }

    public void setProjLuudate(Date projLuudate) {
        this.projLuudate = projLuudate;
    }

    public Integer getProjLuausrId() {
        return projLuausrId;
    }

    public void setProjLuausrId(Integer projLuausrId) {
        this.projLuausrId = projLuausrId;
    }

    public Set<Apartments> getApartments() {
        return apartments;
    }

    public void setApartments(Set<Apartments> apartments) {
        this.apartments = apartments;
    }
}
