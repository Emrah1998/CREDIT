package az.credit.credit.controller;

import az.credit.credit.model.enums.CreditsStatus;
import az.credit.credit.model.response.CreditsResponse;
import az.credit.credit.service.CreditsServiceHandle;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/credits")
public class CreditsController {

    private final CreditsServiceHandle creditsService;

    @GetMapping("/{status}")
    public List<CreditsResponse> getCredits(@PathVariable CreditsStatus status) {
        return creditsService.getCredits();
        //

    }
}
