package com.empwagecalculator.controller;

import com.empwagecalculator.service.serviceprovider.OperationServiceProvider;
import com.empwagecalculator.userinputs.UserInputs;
import com.empwagecalculator.utils.InputUtility;

import java.util.ArrayList;
import java.util.List;

public class EmpWageController {

    static List<String> empList = new ArrayList<>();

    OperationServiceProvider obj = new OperationServiceProvider();

    public void menuChoice() {
        int option = menu();
        int count = 0;
        while ( option != 3 ){

            switch (option){
                case 1:
                    String val = obj.execution();
                    empList.add(val);
                    break;

                case 2:
                    for (int i = 0; i < empList.size(); i++) {
                        System.out.println(empList.get(i));
                        System.out.println("  \n ");
                    }
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Please choose from above options");
            }
            option = menu();
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
