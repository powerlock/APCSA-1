import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGUI extends JFrame {
    private Population population;          // Your main class
    private JTextArea outputArea;
    private JTextField daysField, infectionField, recoveryField, totalPeopleField, initialInfectedField;

    public MainGUI() {
        population = new Population(100, 5);  // default values from your class
        setTitle("Disease Outbreak Simulator - Interactive GUI");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Output display
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Control panel
        JPanel control = new JPanel(new GridLayout(3, 3, 10, 10));
        control.add(new JLabel("Total People:")); totalPeopleField = new JTextField("100"); control.add(totalPeopleField);
        control.add(new JLabel("Initial Infected:")); initialInfectedField = new JTextField("5"); control.add(initialInfectedField);
        control.add(new JLabel("Days:")); daysField = new JTextField("30"); control.add(daysField);
        control.add(new JLabel("Infection Rate:")); infectionField = new JTextField("0.3"); control.add(infectionField);
        control.add(new JLabel("Recovery Rate:")); recoveryField = new JTextField("0.1"); control.add(recoveryField);

        JButton runBtn = new JButton("Run Full Simulation");
        runBtn.addActionListener(e -> runSimulation());
        control.add(runBtn);

        JButton analyzeBtn = new JButton("Analyze Results");
        analyzeBtn.addActionListener(e -> analyzeResults());
        control.add(analyzeBtn);

        JButton clearBtn = new JButton("Clear Output");
        clearBtn.addActionListener(e -> outputArea.setText(""));
        control.add(clearBtn);

        add(control, BorderLayout.SOUTH);
        setVisible(true);
    }

    private void runSimulation() {
        try {
            int days = Integer.parseInt(daysField.getText());
            double infRate = Double.parseDouble(infectionField.getText());
            double recRate = Double.parseDouble(recoveryField.getText());
            outputArea.append("=== SIMULATION STARTED ===\n");
            for (int d = 1; d <= days; d++) {
                population.runOneDay(infRate, recRate);   // calls your class method
                outputArea.append("Day " + d + ": " + population.getCurrentStats() + "\n");  // add this helper in Population.java
            }
            population.saveLog(days);
        } catch (Exception ex) {
            outputArea.append("Error: Check input values.\n");
        }
    }

    private void analyzeResults() {
        outputArea.append("\nANALYSIS:\nPeak infection day: " + population.findPeakInfectionDay() + "\n");  // add this method in your class
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainGUI());
    }
}
