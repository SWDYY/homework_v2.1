package GUI;

import language.language_convert;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

public class menubar extends JMenuBar {
    private JMenu menuFile;
    private JMenu menuSetting;
    private JMenu menuHelp;

    private JMenuItem menuItem_Quit;
    private JMenu menu_Language;
    private JMenuItem menuItem_Font;
    private JMenuItem menuItem_help;
    private JMenuItem menuItem_about;
    private JRadioButtonMenuItem Chinese;
    private JRadioButtonMenuItem English;
    private JRadioButtonMenuItem German;


    public menubar(windowsToLogin windowsToLogin){
        menuFile  = new JMenu("文件");
        menuSetting = new JMenu("设置");
        menuHelp = new JMenu("帮助");
        add(menuFile);
        add(menuSetting);
        add(menuHelp);

        menuItem_Quit = new JMenuItem("退出");
        menuFile.add(menuItem_Quit);

        Chinese = new JRadioButtonMenuItem("简体中文");
        Chinese.setSelected(true);
        English = new JRadioButtonMenuItem("English");
        German = new JRadioButtonMenuItem("Deutsch");

        ButtonGroup group = new ButtonGroup();
        group.add(Chinese);
        group.add(English);
        group.add(German);

        menu_Language = new JMenu("选择语言");
        menu_Language.add(Chinese);
        menu_Language.add(English);
        menu_Language.add(German);

        menuItem_Font = new JMenuItem("字体");
        menuItem_Font.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ////////////////待添加监听
            }
        });
        menuSetting.add(menu_Language);
        menuSetting.addSeparator();
        menuSetting.add(menuItem_Font);

        menuItem_help = new JMenuItem("帮助");
        menuItem_about = new JMenuItem("About ..");
        menuHelp.add(menuItem_help);
        menuHelp.addSeparator();
        menuHelp.add(menuItem_about);


    }
}

