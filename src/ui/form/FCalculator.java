/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.form;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Marko
 */
public class FCalculator extends javax.swing.JFrame {

    private javax.swing.JLabel jlabA;
    private javax.swing.JTextField jtxtA;
    private javax.swing.JLabel jlabB;
    private javax.swing.JTextField jtxtB;
    private javax.swing.JLabel jlabC;
    private javax.swing.JTextField jtxtC;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnSubtract;

    public FCalculator() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Software design-Calculator");
        jtxtA = new JTextField();
        jlabA = new JLabel();
        jlabB = new JLabel();
        jtxtB = new JTextField();
        jlabC = new JLabel();
        jtxtC = new JTextField();
        jbtnAdd = new JButton();
        jbtnSubtract = new JButton();

        jlabA.setText("A: ");
        jlabB.setText("B: ");
        jlabC.setText("C: ");
        jbtnAdd.setText("Add");
        jbtnSubtract.setText("Subtract");

        jlabA.setBounds(25, 25, 35, 30);
        jlabB.setBounds(25, 55, 35, 30);
        jlabC.setBounds(25, 85, 35, 30);
        jtxtA.setBounds(40, 25, 200, 25);
        jtxtB.setBounds(40, 55, 200, 25);
        jtxtC.setBounds(40, 85, 200, 25);
        jbtnAdd.setBounds(25, 120, 100, 30);
        jbtnSubtract.setBounds(140, 120, 100, 30);

        Container container = getContentPane();
        container.setLayout(null);
        container.add(jlabA);
        container.add(jtxtA);
        container.add(jlabB);
        container.add(jtxtB);
        container.add(jlabC);
        container.add(jtxtC);
        container.add(jbtnAdd);
        container.add(jbtnSubtract);

        setLocationRelativeTo(null);
        setSize(320, 250);
        setVisible(true);
        setResizable(false);
        jtxtC.setEditable(false);

        jbtnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtxtC.setText(Integer.parseInt(jtxtA.getText().trim()) + Integer.parseInt(jtxtB.getText().trim()) + "");
            }
        });

        jbtnSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtxtC.setText(Integer.parseInt(jtxtA.getText().trim()) - Integer.parseInt(jtxtB.getText().trim()) + "");
            }
        });

    }

}
