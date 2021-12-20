package com.empwagecalculator.controller;

import com.empwagecalculator.service.serviceprovider.OperationServiceProvider;
import com.empwagecalculator.userinputs.UserInputs;
import com.empwagecalculator.utils.InputUtility;

public class EmpWageController {


    UserInputs userObj = new UserInputs();
    OperationServiceProvider obj = new OperationServiceProvider();

    public void menuChoice() {
        int option = menu();
        int count = 0;
        while ( option != 3 ){

            switch (option){
                case 1:
                    String val = obj.execution();
                    userObj.setEmpList(count,val);
                    count++;
                    break;

                case 2:
                    for (int i = 0; i < userObj.getEmpListLength(); i++) {
                        System.out.println(userObj.getEmpList(i));
                        System.out.println("  \n ");
                    }
                    break;
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
