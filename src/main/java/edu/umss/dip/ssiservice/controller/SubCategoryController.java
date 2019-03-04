package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.repositories.SubCategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SubCategoryController {
    private SubCategoryRepository subCategoryRepository;

    public SubCategoryController(SubCategoryRepository subCategoryRepository) {
        this.subCategoryRepository = subCategoryRepository;
    }

    @RequestMapping("/subCategories")
    public String getSubCategories(Model model) {
        model.addAttribute("subCategories", subCategoryRepository.findAll());
        return "subCategories";
    }

}
