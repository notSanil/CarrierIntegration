package sanil.integration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sanil.integration.dto.CostRequestDto;
import sanil.integration.services.CostService;

@RestController
public class CostController {
    @Autowired
    private CostService costService;

    @GetMapping("/cost")
    public Integer Cost(@RequestBody CostRequestDto costRequestDto) throws Exception {
        return costService.GetCost(costRequestDto);
    }
}
