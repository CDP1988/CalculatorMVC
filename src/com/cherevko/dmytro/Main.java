package com.cherevko.dmytro;

import com.cherevko.dmytro.controller.CalcController;
import com.cherevko.dmytro.model.CalcModel;
import com.cherevko.dmytro.view.CalcView;

public class Main {

    public static void main(String[] args) {

        CalcView theView = new CalcView();
        CalcModel theModel = new CalcModel();
        CalcController theController = new CalcController(theView,theModel);
    }
}
