package com.pennant.propertystudio.models;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ProjectTypes")
public class ProjectTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prty_id")
    private Integer prtyId;

    @Column(name = "prty_name", length = 100, nullable = false)
    private String prtyName;

    @Column(name = "prty_desc", length = 255)
    private String prtyDesc;

    // Bi-directional mapping
    @OneToMany(mappedBy = "projectType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Project> projects;

    // Getters and Setters
    public Integer getPrtyId() {
        return prtyId;
    }

    public void setPrtyId(Integer prtyId) {
        this.prtyId = prtyId;
    }

    public String getPrtyName() {
        return prtyName;
    }

    public void setPrtyName(String prtyName) {
        this.prtyName = prtyName;
    }

    public String getPrtyDesc() {
        return prtyDesc;
    }

    public void setPrtyDesc(String prtyDesc) {
        this.prtyDesc = prtyDesc;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }
}
