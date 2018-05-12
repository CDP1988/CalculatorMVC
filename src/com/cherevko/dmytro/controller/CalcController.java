package com.cherevko.dmytro.controller;
import com.cherevko.dmytro.model.CalcModel;
import com.cherevko.dmytro.view.CalcView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {

    private CalcView theView;
    private CalcModel theModel;

    public CalcController(CalcView theView, CalcModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        theView.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double firstNumber, secondNumber = 0;

            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                switch (theView.getOperation()) {
                    case 1:
                        theModel.addNumbers(firstNumber, secondNumber);
                        break;
                    case 2:
                        theModel.subNumbers(firstNumber, secondNumber);
                        break;
                    case 3:
                        theModel.mulNumbers(firstNumber, secondNumber);
                        break;
                    case 4:
                        if (secondNumber == 0) {
                            theView.displayErrorMessage("divide by zero cannot be");
                            break;
                        }
                        theModel.divNumbers(firstNumber, secondNumber);
                        break;
                }

                theView.setCalcSolution(theModel.getCalculationValue());
            } catch (NumberFormatException ex) {
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Numbers");
            }
        }
    }
}


