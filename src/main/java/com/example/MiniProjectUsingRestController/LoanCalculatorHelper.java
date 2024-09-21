package com.example.MiniProjectUsingRestController;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoanCalculatorHelper {
    LoanCalculator loanCalculator;
    double monthlyEMI;
    double totalAmountWithInterest;
}
