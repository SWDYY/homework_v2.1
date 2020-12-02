package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;
import java.util.Vector;

/**
 * 销售员GUI
 */
public class Employee extends JFrame {
    //language
    private String myJPanel_productString;//货品
    private String panel_customerStirng;//客户
    private String panel_sellStirng;//销售
    private String panel_addingOrderStirng;//开销售单
    private String panel_cashieringString;//收银
    private String panel_orderListSring;//订单列表
    private String panel_personalAccountSring;//个人账户

    private JTabbedPane tabbedPane_all;
    private JTabbedPane tabbedPane_sell;
    private MyJPanel myJPanel_product;
    //private MyJPanel myJPanel_allOrderData;
    private Employee show = this;
    //private JPanel contentPane  = new JPanel();
    private JPanel panel_sell;
    private panelForCustomer panel_customer;
    private panelForAddingOrder panel_addingOrder;
    private panelForCashiering panel_cashiering;
    private panelForOrderList panel_orderList;
    private panelForPersonalAccount panel_personalAccount;

    public Employee(ResourceBundle resourceBundle) {
        myJPanel_productString=resourceBundle.getString("myJPanel_productString");
        panel_customerStirng=resourceBundle.getString("panel_customerStirng");
        panel_sellStirng=resourceBundle.getString("panel_sellStirng");
        panel_addingOrderStirng=resourceBundle.getString("panel_addingOrderStirng");
        panel_cashieringString=resourceBundle.getString("panel_cashieringString");
        panel_orderListSring=resourceBundle.getString("panel_orderListSring");
        panel_personalAccountSring=resourceBundle.getString("panel_personalAccountSring");

        menubar menu = new menubar(resourceBundle);
        this.setJMenuBar(menu);

        JPanel totalPanel = new JPanel();
        tabbedPane_all = new JTabbedPane();
        totalPanel.add(tabbedPane_all);
        show.add(totalPanel);

        /***货品Panel***/
        Vector<Object> name_product = new Vector<>();
        name_product.add("ID");
        name_product.add("Name");
        name_product.add("Outpirce");
        myJPanel_product = new MyJPanel(name_product, 99);
        tabbedPane_all.add(myJPanel_product);
        tabbedPane_all.addTab(myJPanel_productString, myJPanel_product);

        /***客户Panel***/
        panel_customer = new panelForCustomer(this);
        tabbedPane_all.add(panel_customer);
        tabbedPane_all.add(panel_customerStirng, panel_customer);

        /***销售Panel***/
        panel_sell = new JPanel();
        panel_sell.setLayout(new BorderLayout());
        tabbedPane_all.add(panel_sell, SwingConstants.NORTH);
        tabbedPane_all.addTab(panel_sellStirng, panel_sell);
        tabbedPane_sell = new JTabbedPane();
        panel_sell.add(tabbedPane_sell);

        /***开销售单secondPanel***/
        panel_addingOrder = new panelForAddingOrder();
        tabbedPane_sell.add(panel_addingOrder);
        tabbedPane_sell.addTab(panel_addingOrderStirng, panel_addingOrder);

        /***收银secondPanel***/
        panel_cashiering = new panelForCashiering();
        tabbedPane_sell.add(panel_cashiering);
        tabbedPane_sell.addTab(panel_cashieringString, panel_cashiering);

        /***查看订单列表secondPanel***/
        panel_orderList = new panelForOrderList(this);
        tabbedPane_sell.add(panel_orderList);
        tabbedPane_sell.addTab(panel_orderListSring, panel_orderList);

        /***个人账户***/
        panel_personalAccount = new panelForPersonalAccount();
        tabbedPane_all.add(panel_personalAccount);
        tabbedPane_all.addTab(panel_personalAccountSring, panel_personalAccount);
    }
}
