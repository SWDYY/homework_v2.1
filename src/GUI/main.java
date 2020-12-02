package GUI;

import language.language_convert;

import javax.swing.*;

public class main {
    public static void main(String[] args){
        windowsToLogin winToLogin = new windowsToLogin(language_convert.language_convertAll());
        //winToLogin.setDefaultCloseOperation(WindowConstants.);
        winToLogin.setVisible(true);
        winToLogin.setBounds(400,150,400,300);
        //winToLogin.setResizable(false);
        winToLogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
