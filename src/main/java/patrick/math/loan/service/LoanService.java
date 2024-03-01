package patrick.math.loan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoanService {
    private final RestTemplate restTemplate;

    @Autowired
    public LoanService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void processLoan() {
        System.out.println("Processing loan request...");

        // Mpesa service is running on localhost:8081
        String mpesaServiceUrl = "http://localhost:8081/mpesa/process-payment";
        restTemplate.getForObject(mpesaServiceUrl, String.class);
    }
}
