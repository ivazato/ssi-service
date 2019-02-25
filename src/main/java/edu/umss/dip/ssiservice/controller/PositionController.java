package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.repositories.PositionRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class PositionController {

    private PositionRepository positionRepository;

    @RequestMapping("/positions")
    public String getEmployees(Model model) {
        model.addAttribute("positions", positionRepository.findAll());
        return "positions";
    }

}
