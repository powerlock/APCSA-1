import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGUI extends JFrame {
    private Library library;
    private JTextArea outputArea;
    private JTextField titleField, authorField, genreField, ratingField, searchGenreField, minRatingField;

    public MainGUI() {
        library = new Library();
        setTitle("Book Recommendation System - Interactive GUI");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        JPanel control = new JPanel(new GridLayout(4, 3, 10, 10));
        // Add book section
        control.add(new JLabel("Title:")); titleField = new JTextField(); control.add(titleField);
        control.add(new JLabel("Author:")); authorField = new JTextField(); control.add(authorField);
        control.add(new JLabel("Genre:")); genreField = new JTextField(); control.add(genreField);
        JButton addBtn = new JButton("Add Book"); addBtn.addActionListener(e -> addBook()); control.add(addBtn);

        // Recommendation section
        control.add(new JLabel("Search Genre:")); searchGenreField = new JTextField(); control.add(searchGenreField);
        control.add(new JLabel("Min Rating:")); minRatingField = new JTextField("3.5"); control.add(minRatingField);
        JButton recBtn = new JButton("Get Recommendations"); recBtn.addActionListener(e -> getRecommendations()); control.add(recBtn);

        JButton viewAllBtn = new JButton("View All Books"); viewAllBtn.addActionListener(e -> viewAll()); control.add(viewAllBtn);
        add(control, BorderLayout.SOUTH);
        setVisible(true);
    }

    private void addBook() { /* call library.addBook(...) and append to outputArea */ }
    private void getRecommendations() { /* call library.getRecommendations(...) and display list */ }
    private void viewAll() { /* loop through library and show in outputArea */ }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainGUI());
    }
}
