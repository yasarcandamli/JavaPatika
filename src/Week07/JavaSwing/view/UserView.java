package Week07.JavaSwing.view;

import Week07.JavaSwing.business.UserController;
import Week07.JavaSwing.entity.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class UserView extends JFrame {
    private JPanel container;
    private JTabbedPane tab_menu;
    private JPanel pnl_user;
    private JTable tbl_user;
    private JButton btn_user_new;
    private UserController userController;
    private DefaultTableModel model_user;
    private JPopupMenu user_popup;

    public UserView() {
        this.add(container);
        this.setTitle("Kulanıcı Yönetimi");
        this.setSize(500, 500);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.setVisible(true);

        this.userController = new UserController();
        this.model_user = new DefaultTableModel();
        this.user_popup = new JPopupMenu();

        Object[] columnUser = {"ID", "AD", "TİP", "CİNSİYET", "MAİL", "ŞİFRE"};
        this.model_user.setColumnIdentifiers(columnUser);

        ArrayList<User> users = this.userController.findAll();
        for (User user : users) {
            Object[] row = {
                    user.getId(),
                    user.getName(),
                    user.getType(),
                    user.getGender(),
                    user.getMail(),
                    user.getPassword()
            };
            this.model_user.addRow(row);
        }
        this.tbl_user.setModel(this.model_user);
        this.tbl_user.setEnabled(false);
        this.tbl_user.getTableHeader().setReorderingAllowed(false);
        this.tbl_user.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int selectedRow = tbl_user.rowAtPoint(e.getPoint());
                tbl_user.setRowSelectionInterval(selectedRow, selectedRow);
            }
        });

        this.user_popup.add("Güncelle").addActionListener(e -> {
            int selectedId = Integer.parseInt(tbl_user.getValueAt(tbl_user.getSelectedRow(), 0).toString());
            User selectedUser = this.userController.getById(selectedId);
            System.out.println(selectedUser.toString());
        });
        this.user_popup.add("Sil").addActionListener(e -> {
            int selectedId = Integer.parseInt(tbl_user.getValueAt(tbl_user.getSelectedRow(), 0).toString());
            System.out.println(selectedId);
        });

        this.tbl_user.setComponentPopupMenu(user_popup);
    }
}
