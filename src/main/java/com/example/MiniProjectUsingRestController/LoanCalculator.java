package com.example.MiniProjectUsingRestController;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoanCalculator {
    int principalAmount;
    int tenureOfMonths;
    double annualInterest;
}
