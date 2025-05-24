package week8.LA1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleNotepad extends JFrame {
    private JTextArea textArea;
    private JButton clearButton;
    private JPanel buttonPanel;
    private JScrollPane scrollPane;

    public SimpleNotepad() {
        setTitle("Simple NotePad");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        createGUI();
        addListeners();

        setVisible(true);
    }

    private void createGUI() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);

        buttonPanel = new JPanel();
        clearButton = new JButton("Clear");
        buttonPanel.add(clearButton);

        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addListeners() {
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });
    }
}