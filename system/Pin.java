package bank.Management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;
    Pin(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2 (1).png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        this.add(l3);


        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System", 1, 16));
        label1.setBounds(430, 180, 400, 35);
        l3.add(label1);


        JLabel label2 = new JLabel("NEW PIN");
        label2.setForeground(Color.white);
        label2.setFont(new Font("System", 1, 16));
        label2.setBounds(430, 220, 150, 35);
        l3.add(label2);


        p1 = new JPasswordField();
       // p1 = new TextField();
        p1.setBackground(new Color(65, 125, 128));
        p1.setForeground(Color.WHITE);
        p1.setBounds(600, 220, 180, 25);
        p1.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add(p1);

        JLabel label3 = new JLabel("Re- Enter NEW PIN");
        label3.setForeground(Color.white);
        label3.setFont(new Font("System", 1, 16));
        label3.setBounds(430, 250, 400, 35);
        l3.add(label3);


        p2 = new JPasswordField();
        // p1 = new TextField();
        p2.setBackground(new Color(65, 125, 128));
        p2.setForeground(Color.WHITE);
        p2.setBounds(600, 250, 180, 25);
        p2.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add(p2);


        b1 = new JButton("CHANGE");
        b1.setBounds(700, 362, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.white);
       b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700, 406, 150, 35);
        b2.setBackground(new Color(65, 125, 128));
        b2.setForeground(Color.white);
       b2.addActionListener(this );
        l3.add(b2);

        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
try {
    String Pin1 = p1.getText();
    String Pin2 = p2.getText();
    if (!Pin1.equals(Pin2)) {
        JOptionPane.showMessageDialog(null, "Entered PIN does not match");
return;
    }
    if(e.getSource() ==b1){
        if(p1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Entered  New PIN ");
           return;
        }
        if(p2.getText().equals("")){
            JOptionPane.showMessageDialog(null, " Re-Entered New PIN ");
return;
        }
        Con c = new Con();
        String q1 = "Update bank set pin= '"+Pin1+"' where pin = '"+pin+"'";
        String q2 = "Update login bank set pin= '"+Pin1+"' where pin = '"+pin+"'";
        String q3 = "Update signupthree bank set pin= '"+Pin1+"' where pin = '"+pin+"'";
        c.statement.executeUpdate(q1);
        c.statement.executeUpdate(q2);
        c.statement.executeUpdate(q3);

        JOptionPane.showMessageDialog(null,"PIN change successfully");
        setVisible(false);
        new main_Class(pin);
    }else{
        new main_Class(pin);
        setVisible(false);
    }
}catch (Exception E){
    E.printStackTrace();
}
    }

    public static void main(String[] args) {
        new Pin("");
    }
}
