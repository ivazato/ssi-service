package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.repositories.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {
    private ItemRepository repository;

    public ItemController(ItemRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/items")
    public String getItems(Model model) {
        model.addAttribute("items", repository.findAll());
        return "items";
    }

}