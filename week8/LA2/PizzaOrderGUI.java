package week8.LA2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaOrderGUI extends JFrame {
    private static final int COMBO = 0;
    private static final int POTATO = 1;
    private static final int BULGOGI = 2;

    private static final int COMBO_PRICE = 15000;
    private static final int POTATO_PRICE = 12000;
    private static final int BULGOGI_PRICE = 16000;

    private JButton comboButton, potatoButton, bulgogiButton, resetButton;
    private JLabel comboPrice, potatoPrice, bulgogiPrice;
    private JLabel comboCount, potatoCount, bulgogiCount;
    private JLabel totalCountLabel, totalPriceLabel;
    private JLabel b;

    private int[] orderCounts = new int[3];
    private int totalCount = 0;
    private int totalPrice = 0;

    public PizzaOrderGUI() {
        setTitle("Pizza restaurant order board");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JPanel menuPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 80, 10));

        JPanel comboPanel = new JPanel(new GridLayout(3, 1));
        comboButton = new JButton("Combo Pizza");
        comboPrice = new JLabel(String.format("Price: %d WON", COMBO_PRICE), SwingConstants.CENTER);
        comboCount = new JLabel("Order:0", SwingConstants.CENTER);

        comboPanel.add(comboButton);
        comboPanel.add(comboPrice);
        comboPanel.add(comboCount);

        JPanel potatoPanel = new JPanel(new GridLayout(3, 1));
        potatoButton = new JButton("Potato Pizza");
        potatoPrice = new JLabel(String.format("Price: %d WON", POTATO_PRICE), SwingConstants.CENTER);
        potatoCount = new JLabel("Order:0", SwingConstants.CENTER);

        potatoPanel.add(potatoButton);
        potatoPanel.add(potatoPrice);
        potatoPanel.add(potatoCount);

        JPanel bulgogiPanel = new JPanel(new GridLayout(3, 1));
        bulgogiButton = new JButton("Bulgogi Pizza");
        bulgogiPrice = new JLabel(String.format("Price: %d WON", BULGOGI_PRICE), SwingConstants.CENTER);
        bulgogiCount = new JLabel("Order: 0", SwingConstants.CENTER);

        bulgogiPanel.add(bulgogiButton);
        bulgogiPanel.add(bulgogiPrice);
        bulgogiPanel.add(bulgogiCount);

        menuPanel.add(comboPanel);
        menuPanel.add(potatoPanel);
        menuPanel.add(bulgogiPanel);

        JPanel emptyPanel = new JPanel();

        JPanel statusPanel = new JPanel(new GridLayout(1, 2));
        totalCountLabel = new JLabel("Total Orders: 0", SwingConstants.CENTER);
        totalPriceLabel = new JLabel("Total Price: 0WON", SwingConstants.CENTER);

        statusPanel.add(totalCountLabel);
        statusPanel.add(totalPriceLabel);

        JPanel resetPanel = new JPanel();
        resetButton = new JButton("Resetting orders");
        resetPanel.add(resetButton);

        add(menuPanel);
        add(emptyPanel);
        add(statusPanel);
        add(resetPanel);

        comboButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateOrder(COMBO, COMBO_PRICE);
            }
        });

        potatoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateOrder(POTATO, POTATO_PRICE);
            }
        });

        bulgogiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateOrder(BULGOGI, BULGOGI_PRICE);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetOrder();
            }
        });

        setVisible(true);
    }

    private void updateOrder(int pizzaType, int price) {
        orderCounts[pizzaType]++;
        totalCount++;
        totalPrice += price;

        if (pizzaType == COMBO) {
            comboCount.setText("Order: " + orderCounts[COMBO]);
        } else if (pizzaType == POTATO) {
            potatoCount.setText("Order: " + orderCounts[POTATO]);
        } else if (pizzaType == BULGOGI) {
            bulgogiCount.setText("Order: " + orderCounts[BULGOGI]);
        }

        totalCountLabel.setText("Total Orders:" + totalCount);
        totalPriceLabel.setText(String.format("Total Price: %dWON", totalPrice));
    }

    private void resetOrder() {
        for (int i = 0; i < orderCounts.length; i++) {
            orderCounts[i] = 0;
        }

        totalCount = 0;
        totalPrice = 0;

        comboCount.setText("Order: 0");
        potatoCount.setText("Order: 0");
        bulgogiCount.setText("Order: 0");

        totalCountLabel.setText("Total Orders: 0");
        totalPriceLabel.setText("Total Price: 0WON");
    }
}