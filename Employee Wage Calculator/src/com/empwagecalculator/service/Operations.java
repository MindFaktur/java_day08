package com.empwagecalculator.service;

public interface Operations {

    int rand_num(int numberOfDigits, int numToAdd);

    int attendance();

    int wage( int hours_worked );

    void companyData();

    String toStringValues();

}
