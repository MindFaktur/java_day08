package com.empwagecalculator.controller;

import com.empwagecalculator.service.serviceprovider.OperationServiceProvider;
import com.empwagecalculator.userinputs.UserInputs;
import com.empwagecalculator.utils.InputUtility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmpWageController {

    public static OperationServiceProvider obj = new OperationServiceProvider();


    public void menuChoice() {
        int option = 0;
        while ( option != 3 ){
            option = menu();
            switch (option){
                case 1:
                    String val = obj.execution();
                    System.out.println(val);
                    System.out.println(obj.details);
                    break;

                case 2:
                    System.out.println(obj.companies);
                    break;

                default:
                    System.out.println("Please choose from above options");

            }
        }
    }

    public static int menu() {
        System.out.println(" Press " +
                "\n 1) Add Company " +
                "\n 2) Print Company Wage and Details " +
                "\n 3) Quit Program "
        );

        InputUtility obj = new InputUtility();

        return obj.getSCAN().nextInt();
    }

}
