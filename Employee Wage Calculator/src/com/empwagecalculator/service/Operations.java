package com.empwagecalculator.service;

import com.empwagecalculator.userinputs.UserInputs;

public interface Operations {

    int rand_num(int numberOfDigits, int numToAdd);

    int attendance();

    int wage( int hours_worked );

    void companyData();

    String toStringValues();

    String execution();

}
