package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Font;
import java.util.ResourceBundle;

public class windowsToLogin extends JFrame{
    /***/
    private String user_login;//用户登录
    private String user_name;//用户名
    private String user_password;//密码
    private String cancel;//取消
    private String login;//登录
    private String forgetPassword;//忘记密码？
    private JTextField textField_login_username;
    private JTextField textField_login_password;
    private windowsToLogin show = this;

    public windowsToLogin(ResourceBundle resourceBundle) {
        user_login =resourceBundle.getString("user_login");
        user_name =resourceBundle.getString("user_name");
        user_password =resourceBundle.getString("user_password");
        cancel =resourceBundle.getString("cancel");
        login =resourceBundle.getString("login");
        forgetPassword =resourceBundle.getString("forgetPassword");

        try {
            BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //title//用户登录
        setTitle(user_login);

        menubar menu = new menubar(this);
        this.setJMenuBar(menu);
        /*******登陆界面********/
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(60, 60, 60, 60));
        getContentPane().add(panel, BorderLayout.CENTER);
        GridBagLayout gbl_panel = new GridBagLayout();
        gbl_panel.columnWidths = new int[] {30, 100, 148, 0};
        gbl_panel.rowHeights = new int[] {20, 34, 34, 34, 0};
        gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
        gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel.setLayout(gbl_panel);
                
        JLabel Label_login_username = new JLabel(user_name);
        Label_login_username.setFont(new Font("微软雅黑", Font.BOLD, 16));
        Label_login_username.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_Label_login_username = new GridBagConstraints();
        gbc_Label_login_username.fill = GridBagConstraints.BOTH;
        gbc_Label_login_username.insets = new Insets(0, 0, 5, 5);
        gbc_Label_login_username.gridx = 1;
        gbc_Label_login_username.gridy = 1;
        panel.add(Label_login_username, gbc_Label_login_username);

        textField_login_username = new JTextField();
        GridBagConstraints gbc_textField_login_username = new GridBagConstraints();
        gbc_textField_login_username.fill = GridBagConstraints.BOTH;
        gbc_textField_login_username.insets = new Insets(0, 0, 5, 0);
        gbc_textField_login_username.gridx = 2;
        gbc_textField_login_username.gridy = 1;
        panel.add(textField_login_username, gbc_textField_login_username);
        textField_login_username.setColumns(10);
                
        JLabel Label_login_password = new JLabel(user_password);
        Label_login_password.setFont(new Font("微软雅黑", Font.BOLD, 16));
        Label_login_password.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_Label_login_password = new GridBagConstraints();
        gbc_Label_login_password.fill = GridBagConstraints.BOTH;
        gbc_Label_login_password.insets = new Insets(0, 0, 5, 5);
        gbc_Label_login_password.gridx = 1;
        gbc_Label_login_password.gridy = 2;
        panel.add(Label_login_password, gbc_Label_login_password);

        textField_login_password = new JTextField();
        GridBagConstraints gbc_textField_login_password = new GridBagConstraints();
        gbc_textField_login_password.fill = GridBagConstraints.BOTH;
        gbc_textField_login_password.insets = new Insets(0, 0, 5, 0);
        gbc_textField_login_password.gridx = 2;
        gbc_textField_login_password.gridy = 2;
        panel.add(textField_login_password, gbc_textField_login_password);
        textField_login_password.setColumns(10);

        /***********按钮及事件监听***********/
        JButton Button_login_cancel = new JButton(cancel);
        Button_login_cancel.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                    }
        });

        JButton Button_login_login = new JButton(login);
        Button_login_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*****测试代码*****/
                if(textField_login_username.getText().equals("1")) {
                    Employee employee = new Employee(show);
                    employee.setVisible(true);
                    employee.setBounds(450,150,500,550);
//                    employee.setResizable(false);
                    show.dispose();
                }
                else if (textField_login_username.getText().equals("2")){
                    Shopkeeper shopkeeper = new Shopkeeper(show);
                    shopkeeper.setVisible(true);
                    shopkeeper.setBounds(450,150,550,550);
                    //shopkeeper.setResizable(false);
                    show.dispose();
                }
                else if(textField_login_username.getText().equals("3")){
                    Manager manager = new Manager(show);
                    manager.setVisible(true);
                    manager.setBounds(450,150,550,550);
                    show.dispose();
                }
                else{

                }
            }

        });
        GridBagConstraints gbc_Button_login_login = new GridBagConstraints();
        gbc_Button_login_login.fill = GridBagConstraints.BOTH;
        gbc_Button_login_login.insets = new Insets(0, 0, 0, 5);
        gbc_Button_login_login.gridx = 1;
        gbc_Button_login_login.gridy = 3;
        panel.add(Button_login_login, gbc_Button_login_login);

        GridBagConstraints gbc_Button_login_cancel = new GridBagConstraints();
        gbc_Button_login_cancel.fill = GridBagConstraints.BOTH;
        gbc_Button_login_cancel.gridx = 2;
        gbc_Button_login_cancel.gridy = 3;
        panel.add(Button_login_cancel, gbc_Button_login_cancel);

        Box horizontalBox = Box.createHorizontalBox();
        getContentPane().add(horizontalBox, BorderLayout.SOUTH);

        Component horizontalGlue = Box.createHorizontalGlue();
        horizontalBox.add(horizontalGlue);
                        
        JButton Button_login_forgetPassword = new JButton(forgetPassword);
        Button_login_forgetPassword.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 12));
        Button_login_forgetPassword.setHorizontalAlignment(SwingConstants.RIGHT);
        horizontalBox.add(Button_login_forgetPassword);

        Button_login_forgetPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                windowsToChangePassword winToChangePassword = new windowsToChangePassword();
                winToChangePassword.setVisible(true);
                winToChangePassword.setBounds(420,180,400,300);
            }
        });
    }
}
