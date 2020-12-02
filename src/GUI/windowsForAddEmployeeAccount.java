package GUI;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 权限：经理
 * 按钮：新增员工账户
 * 功能：弹出面板以添加员工账户信息
 */
public class windowsForAddEmployeeAccount extends JFrame {
    private JTextField textField_addAccount_usernameDisplay;
    private JTextField textField_addAccount_phoneNumberDisplay;

    public windowsForAddEmployeeAccount() {

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(0, 30, 0, 30));
        getContentPane().add(panel, BorderLayout.CENTER);
        GridBagLayout gbl_panel = new GridBagLayout();
        gbl_panel.columnWidths = new int[]{30, 100, 200, 0};
        gbl_panel.rowHeights = new int[]{30, 45, 45, 35, 35, 0};
        gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
        gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel.setLayout(gbl_panel);

        /***用户名***/
        JLabel label_addAccount_username = new JLabel("用户名");
        label_addAccount_username.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_addAccount_username = new GridBagConstraints();
        gbc_label_addAccount_username.fill = GridBagConstraints.BOTH;
        gbc_label_addAccount_username.insets = new Insets(0, 0, 5, 5);
        gbc_label_addAccount_username.gridx = 1;
        gbc_label_addAccount_username.gridy = 1;
        panel.add(label_addAccount_username, gbc_label_addAccount_username);

        textField_addAccount_usernameDisplay = new JTextField();
        GridBagConstraints gbc_textField_addAccount_usernameDisplay = new GridBagConstraints();
        gbc_textField_addAccount_usernameDisplay.fill = GridBagConstraints.BOTH;
        gbc_textField_addAccount_usernameDisplay.insets = new Insets(0, 0, 5, 0);
        gbc_textField_addAccount_usernameDisplay.gridx = 2;
        gbc_textField_addAccount_usernameDisplay.gridy = 1;
        panel.add(textField_addAccount_usernameDisplay, gbc_textField_addAccount_usernameDisplay);
        textField_addAccount_usernameDisplay.setColumns(10);

        /***联系方式***/
        JLabel label_addAccount_phoneNumber = new JLabel("联系方式");
        label_addAccount_phoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_addAccount_phoneNumber = new GridBagConstraints();
        gbc_label_addAccount_phoneNumber.fill = GridBagConstraints.BOTH;
        gbc_label_addAccount_phoneNumber.insets = new Insets(0, 0, 5, 5);
        gbc_label_addAccount_phoneNumber.gridx = 1;
        gbc_label_addAccount_phoneNumber.gridy = 2;
        panel.add(label_addAccount_phoneNumber, gbc_label_addAccount_phoneNumber);

        textField_addAccount_phoneNumberDisplay = new JTextField();
        GridBagConstraints gbc_textField_addAccount_phoneNumberDisplay = new GridBagConstraints();
        gbc_textField_addAccount_phoneNumberDisplay.fill = GridBagConstraints.BOTH;
        gbc_textField_addAccount_phoneNumberDisplay.insets = new Insets(0, 0, 5, 0);
        gbc_textField_addAccount_phoneNumberDisplay.gridx = 2;
        gbc_textField_addAccount_phoneNumberDisplay.gridy = 2;
        panel.add(textField_addAccount_phoneNumberDisplay, gbc_textField_addAccount_phoneNumberDisplay);
        textField_addAccount_phoneNumberDisplay.setColumns(10);

        /***职位***/
        JLabel label_addAccount_position = new JLabel("职  位");
        label_addAccount_position.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_addAccount_position = new GridBagConstraints();
        gbc_label_addAccount_position.fill = GridBagConstraints.BOTH;
        gbc_label_addAccount_position.insets = new Insets(0, 0, 5, 5);
        gbc_label_addAccount_position.gridx = 1;
        gbc_label_addAccount_position.gridy = 3;
        panel.add(label_addAccount_position, gbc_label_addAccount_position);

        Box horizontalBox_addAccount_choosePosition = Box.createHorizontalBox();
        GridBagConstraints gbc_horizontalBox_addAccount_choosePosition = new GridBagConstraints();
        gbc_horizontalBox_addAccount_choosePosition.fill = GridBagConstraints.BOTH;
        gbc_horizontalBox_addAccount_choosePosition.insets = new Insets(0, 0, 5, 0);
        gbc_horizontalBox_addAccount_choosePosition.gridx = 2;
        gbc_horizontalBox_addAccount_choosePosition.gridy = 3;
        panel.add(horizontalBox_addAccount_choosePosition, gbc_horizontalBox_addAccount_choosePosition);

        JRadioButton radioButton_addAccount_shopkeeper = new JRadioButton("店长");
        horizontalBox_addAccount_choosePosition.add(radioButton_addAccount_shopkeeper);

        JRadioButton radioButton_addAccount_employee = new JRadioButton("销售");
        horizontalBox_addAccount_choosePosition.add(radioButton_addAccount_employee);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton_addAccount_employee);
        group.add(radioButton_addAccount_shopkeeper);

        /***工作地点***/
        JLabel label_addAccount_location = new JLabel("工作地点");
        label_addAccount_location.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_addAccount_location = new GridBagConstraints();
        gbc_label_addAccount_location.fill = GridBagConstraints.BOTH;
        gbc_label_addAccount_location.insets = new Insets(0, 0, 0, 5);
        gbc_label_addAccount_location.gridx = 1;
        gbc_label_addAccount_location.gridy = 4;
        panel.add(label_addAccount_location, gbc_label_addAccount_location);

        JComboBox comboBox_addAccount_chooseLocation = new JComboBox();
        GridBagConstraints gbc_comboBox_addAccount_chooseLocation = new GridBagConstraints();
        gbc_comboBox_addAccount_chooseLocation.fill = GridBagConstraints.BOTH;
        gbc_comboBox_addAccount_chooseLocation.gridx = 2;
        gbc_comboBox_addAccount_chooseLocation.gridy = 4;
        panel.add(comboBox_addAccount_chooseLocation, gbc_comboBox_addAccount_chooseLocation);

        /***底部按钮***/
        Box horizontalBox = Box.createHorizontalBox();
        getContentPane().add(horizontalBox, BorderLayout.SOUTH);

        Component horizontalGlue_left = Box.createHorizontalGlue();
        horizontalBox.add(horizontalGlue_left);

        JButton button_addAccount_save = new JButton("保   存");
        button_addAccount_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        horizontalBox.add(button_addAccount_save);

        Component rigidArea = Box.createRigidArea(new Dimension(100, 80));
        horizontalBox.add(rigidArea);

        JButton button_addAccount_cancel = new JButton("取   消");
        button_addAccount_cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        horizontalBox.add(button_addAccount_cancel);

        Component horizontalGlue_right = Box.createHorizontalGlue();
        horizontalBox.add(horizontalGlue_right);
    }
}
