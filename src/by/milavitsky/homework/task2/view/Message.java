package by.milavitsky.homework.task1.view;

import javax.swing.*;

public class Message {
    public static void showMessage(String message){
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, message );

    }
}
