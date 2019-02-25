package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.repositories.SubCategoryRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class SubCategoryController {

    private SubCategoryRepository subCategoryRepository;

    @RequestMapping("/subCategories")
    public String getEmployees(Model model) {
        model.addAttribute("subCategories", subCategoryRepository.findAll());
        return "subCategories";
    }

}
