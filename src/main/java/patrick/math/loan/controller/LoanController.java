package patrick.math.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import patrick.math.loan.service.LoanService;

// This controller handles loan processing requests.
// It will also communicate with the Mpesa service.
@RestController
//@RequestMapping("/loan")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping("/process-loan")
    public ResponseEntity<String> processLoan() {
        loanService.processLoan();
        return ResponseEntity.ok("Loan processing initiated and Mpesa has been notified.");
    }
}
