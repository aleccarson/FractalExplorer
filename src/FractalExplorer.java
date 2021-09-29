// Basic fractal explorer
// Alec Carson 2021

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class FractalExplorer extends JFrame {
    static final int WIDTH = 1920;
    static final int HEIGHT = 1080;

    public FractalExplorer() {
        setInitialGUI();
    }

    // creates initial gui with base parameters
    public void setInitialGUI() {
        // some artist flair, as it were
        this.setTitle("Fractal Explorer!!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new FractalExplorer();
    }
}