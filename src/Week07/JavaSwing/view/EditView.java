package Week07.JavaSwing.view;

import Week07.JavaSwing.entity.User;

import javax.swing.*;
import java.awt.*;

public class EditView extends JFrame{
    private JPanel container;
    private User user;

    public EditView(User user) {
        this.add(container);
        this.setTitle("Kullanıcı Ekle/Düzenle");
        this.setSize(300, 500);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.setVisible(true);
        //User nesnesi boş ise yeni ekleme, user_id = 0
        //User nesnesi dolu ise düzenleme, user_id != 0
        this.user = user;
    }
}
