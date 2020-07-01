
package com.marko;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Main extends JFrame {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader reader = new FileReader("C:\\lol.txt");
        Scanner input = new Scanner(reader);


        String longestWord = "";


        while (input.hasNext()) {
            String nextWord = input.next();
            longestWord = nextWord.length() > longestWord.length() ? nextWord : longestWord;

        }
        System.out.println("Longest word is - " + longestWord + " -, and the number of letters is  " + longestWord.length());
        input.close();

        // GUI
        ProgramGUI gui = new ProgramGUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(450, 200);
        gui.setVisible(true);
        gui.setTitle("Longest word");
        gui.getContentPane().setLayout(new FlowLayout());

        // Dialog
        JOptionPane.showMessageDialog(null, "Longest word is - " + longestWord + " -, and the number of letters is " + longestWord.length(), "Message", JOptionPane.ERROR_MESSAGE);

    }

}
