package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.repositories.ContractRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContractController {
    private ContractRepository contractRepository;

    public ContractController(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @RequestMapping("/contracts")
    public String getContracts(Model model) {
        model.addAttribute("contracts", contractRepository.findAll());
        return "contracts";
    }

}
