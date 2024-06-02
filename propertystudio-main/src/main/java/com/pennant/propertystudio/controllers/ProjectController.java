package com.pennant.propertystudio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pennant.propertystudio.models.Project;
import com.pennant.propertystudio.models.ProjectTypes;
import com.pennant.propertystudio.service.ProjectService;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

     @Autowired
     ProjectTypes projectType;

    @GetMapping("/addProject")
    public String showAddProjectForm(Model model) {
        model.addAttribute("project", new Project());
        return "addProjectForm"; // Return the JSP file for adding a new project
    }

    @PostMapping("/addProject")
    public String addProject(@ModelAttribute Project project, Model model) {
    	
        projectType.setPrtyId(1);
        project.setProjectType(projectType);
        // Save the project to the database
        projectService.saveProject(project);
        // Redirect to the list of projects or any other page
        return "redirect:/projects";
    }
}

