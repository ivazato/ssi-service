package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.repositories.ContractRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class ContractController {

    private ContractRepository contractRepository;

    @RequestMapping("/contracts")
    public String getEmployees(Model model) {
        model.addAttribute("contracts", contractRepository.findAll());
        return "contracts";
    }

}
