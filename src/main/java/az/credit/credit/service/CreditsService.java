package az.credit.credit.service;

import az.credit.credit.model.response.CreditsResponse;

import java.util.List;

public interface CreditsService {
  List<CreditsResponse> getCredits();
}
