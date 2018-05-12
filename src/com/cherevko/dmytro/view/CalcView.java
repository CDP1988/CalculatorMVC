package com.cherevko.dmytro.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalcView implements ActionListener{

    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);
    private JRadioButton addRadioButton = new JRadioButton("Addition (+)");
    private JRadioButton subRadioButton = new JRadioButton("Subtraction (-)");
    private JRadioButton mulRadioButton = new JRadioButton("Multiplication (*)");
    private JRadioButton divRadioButton = new JRadioButton("Division (/)");
    private ButtonGroup buttonGroup = new ButtonGroup();
    private int operation = 1;
    private JFrame jfrm;

    public CalcView() {
        jfrm = new JFrame("CALCULATOR");
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new GridLayout(9, 1,5,5));
        jfrm.setSize(200,400);
        jfrm.setResizable(false);
        jfrm.add(firstNumber);
        jfrm.add(additionLabel);
        jfrm.add(secondNumber);
        jfrm.add(calculateButton);
        jfrm.add(calcSolution);
        addRadioButton.addActionListener(this);
        subRadioButton.addActionListener(this);
        mulRadioButton.addActionListener(this);
        divRadioButton.addActionListener(this);
        buttonGroup.add(addRadioButton);
        buttonGroup.add(subRadioButton);
        buttonGroup.add(mulRadioButton);
        buttonGroup.add(divRadioButton);
        jfrm.add(addRadioButton);
        jfrm.add(subRadioButton);
        jfrm.add(mulRadioButton);
        jfrm.add(divRadioButton);
        addRadioButton.setSelected(true);

        jfrm.setVisible(true);
    }

    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }

    public void addCalculateListener(ActionListener listenForCalcButton) {
        calculateButton.addActionListener(listenForCalcButton);
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(jfrm, errorMessage);
    }

    public void setCalcSolution(double solution) {
        calcSolution.setText(Double.toString(solution));
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (addRadioButton.isSelected()) {
            setOperation(1);
            additionLabel.setText("+");
        }
        else if (subRadioButton.isSelected()) {
            setOperation(2);
            additionLabel.setText("-");
        }
        else if (mulRadioButton.isSelected()) {
            setOperation(3);
            additionLabel.setText("*");
        }
        else  {
            setOperation(4);
            additionLabel.setText("/");
        }
    }
}
