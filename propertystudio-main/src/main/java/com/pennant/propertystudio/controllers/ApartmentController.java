package com.pennant.propertystudio.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pennant.propertystudio.models.Apartments;
import com.pennant.propertystudio.models.Project;
import com.pennant.propertystudio.models.ProjectTypes;
import com.pennant.propertystudio.service.ApartmentService;
import com.pennant.propertystudio.service.ProjectService;

@Controller
@RequestMapping("/apartments")
public class ApartmentController {

    private  final ApartmentService apartmentService;
    private final ProjectService projectService;

    @Autowired
    public ApartmentController(ApartmentService apartmentService, ProjectService projectService) {
        this.apartmentService = apartmentService;
        this.projectService = projectService;
    }  

    @GetMapping
    public String getAllApartments(Model model) {
        List<Apartments> apartments = apartmentService.getAllApartments();
        model.addAttribute("projects", projectService.getAllProjects());
        model.addAttribute("apartments", apartments);
        return "apartments"; // JSP file name
    } 
          
    @GetMapping("/add") 
    public String showAddApartmentForm(Model model) {
        model.addAttribute("apartment", new Apartments());
        model.addAttribute("projects", projectService.getAllProjects());
        return "addProject"; // JSP file name for adding apartment
    } 
    
    @PostMapping("/addToProject")
    public String addToProject(@RequestParam("projId") Long projId, Model model) {
        model.addAttribute("projId", projId);
        return "addToProject"; // Return the JSP file to add apartment to project
    }
  
   
    @PostMapping("/add")
    public String addApartment(@ModelAttribute Apartments apartment) { 
        apartment.setAprtCdate(new Date()); // Set the current date
        Project project = projectService.getProjectById(apartment.getProject().getProjId());
        apartment.setProject(project);
        apartmentService.saveApartment(apartment);
        return "redirect:/apartments"; // Redirect to the list of apartments
    } 
    
    @GetMapping("/addProject")
    public String showAddProjectForm(Model model) {
        model.addAttribute("project", new Project());
        return "addProjectForm"; // Return the JSP file for adding a new project
    }

    @PostMapping("/addProject")
    public String addProject(@ModelAttribute Project project, Model model) {
    	 // Set proj_prty_id to 1 as mentioned
        ProjectTypes projectType = new ProjectTypes();
        projectType.setPrtyId(1);
        project.setProjectType(projectType);
        // Save the project to the database
        projectService.saveProject(project);
        // Redirect to the list of projects or any other page
        return "redirect:/apartments";
    }
    
    
}
