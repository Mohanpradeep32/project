package com.pennant.propertystudio.service;

import com.pennant.propertystudio.models.Apartments;
import com.pennant.propertystudio.models.Project;
import com.pennant.propertystudio.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project getProjectById(Integer id) {
        return projectRepository.findById(id).orElse(null);
    }
    
    public void saveProject(Project project) {
        projectRepository.save(project);
    }
    
}
