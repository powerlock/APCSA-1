import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGUI extends JFrame {
    private Road road;
    private JTextArea outputArea;
    private JTextField timeStepsField, numCarsField, lightCycleField;

    public MainGUI() {
        road = new Road(20, 25.0);   // default from your class
        setTitle("Traffic Flow Simulator - Interactive GUI");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        JPanel control = new JPanel(new GridLayout(2, 4, 10, 10));
        control.add(new JLabel("Time Steps:")); timeStepsField = new JTextField("50"); control.add(timeStepsField);
        control.add(new JLabel("Number of Cars:")); numCarsField = new JTextField("30"); control.add(numCarsField);
        control.add(new JLabel("Light Cycle:")); lightCycleField = new JTextField("10"); control.add(lightCycleField);

        JButton runBtn = new JButton("Run Simulation");
        runBtn.addActionListener(e -> runSimulation());
        control.add(runBtn);

        JButton analyzeBtn = new JButton("Analyze Congestion");
        analyzeBtn.addActionListener(e -> analyze());
        control.add(analyzeBtn);

        add(control, BorderLayout.SOUTH);
        setVisible(true);
    }

    private void runSimulation() {
        // parse inputs, loop calling road.runOneTimeStep(...), append live stats to outputArea
    }

    private void analyze() {
        // call road.getAverageSpeed() and other analysis methods you added
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainGUI());
    }
}
