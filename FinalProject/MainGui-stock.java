import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGUI extends JFrame {
    private Portfolio portfolio;
    private JTextArea outputArea;
    private JTextField daysField, marketTrendField, stockNameField, sharesField;

    public MainGUI() {
        portfolio = new Portfolio();
        setTitle("Stock Market Simulator - Interactive GUI");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        JPanel control = new JPanel(new GridLayout(3, 4, 10, 10));
        control.add(new JLabel("Days:")); daysField = new JTextField("30"); control.add(daysField);
        control.add(new JLabel("Market Trend:")); marketTrendField = new JTextField("0.02"); control.add(marketTrendField);
        JButton simBtn = new JButton("Run Market Simulation"); simBtn.addActionListener(e -> runSimulation()); control.add(simBtn);

        control.add(new JLabel("Stock Name:")); stockNameField = new JTextField(); control.add(stockNameField);
        control.add(new JLabel("Shares:")); sharesField = new JTextField(); control.add(sharesField);
        JButton buyBtn = new JButton("Buy"); buyBtn.addActionListener(e -> buy()); control.add(buyBtn);
        JButton sellBtn = new JButton("Sell"); sellBtn.addActionListener(e -> sell()); control.add(sellBtn);

        add(control, BorderLayout.SOUTH);
        setVisible(true);
    }

    private void runSimulation() { /* parse, loop portfolio.runOneDay(...), update display */ }
    private void buy() { /* call portfolio.buyStock(...) */ }
    private void sell() { /* call portfolio.sellStock(...) */ }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainGUI());
    }
}
