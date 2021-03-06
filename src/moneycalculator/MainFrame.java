package moneycalculator;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.PopupMenu;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import moneycalculator.ui.swing.SwingMoneyDialog;
import moneycalculator.ui.swing.SwingMoneyDisplay;

public class MainFrame extends JFrame{

    public MainFrame() {
        this.setTitle("Money Calculator");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(moneyDialog(), BorderLayout.NORTH);
        this.add(moneyDisplay(), BorderLayout.CENTER);
        this.add(toolbar());
        this.setVisible(true);
    }

    private Component moneyDialog() {
        return new SwingMoneyDialog();
    }

    private Component moneyDisplay() {
        return new SwingMoneyDisplay();
    }
    
    private Component toolbar() {
        JPanel panel = new JPanel();
        panel.add(CalculateButton());
        return panel;
    }

    private JButton CalculateButton() {
        JButton button = new JButton("Calculate");
        return button;
    }
    
}
