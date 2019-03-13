package uk.gov.dhsc.htbhf.dwp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.gov.dhsc.htbhf.dwp.model.EligibilityResponse;
import uk.gov.dhsc.htbhf.dwp.model.PersonDTO;
import uk.gov.dhsc.htbhf.dwp.service.EligibilityService;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/dwp/eligibility")
public class DWPEligibilityController {

    private final EligibilityService eligibilityService;

    public DWPEligibilityController(EligibilityService eligibilityService) {
        this.eligibilityService = eligibilityService;
    }

    @PostMapping
    public EligibilityResponse getBenefits(@RequestBody @Valid PersonDTO person) {
        return eligibilityService.checkEligibility(person);
    }
}
