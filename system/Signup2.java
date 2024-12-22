package bank.Management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox ComboBox, ComboBox2, ComboBox3, ComboBox4,ComboBox5;
    JTextField textPan, textaddhar;
    JRadioButton r1, r2, e1, e2;
    JButton next;
    String formno;


    Signup2(String first) {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("page 2 :-");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Additional Detail :-");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);


        JLabel l3 = new JLabel("Religion:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 120, 100, 30);
        add(l3);

        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "other"};
        ComboBox = new JComboBox(religion);
        ComboBox.setBackground(new Color(252, 208, 76));
        ComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        ComboBox.setBounds(350, 120, 320, 30);
        add(ComboBox);


        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 170, 100, 30);
        add(l4);
        String Category[] = {"General", "OBC", "Sc", "ST", "other"};

        ComboBox2 = new JComboBox(Category);
        ComboBox2.setBackground(new Color(252, 208, 76));
        ComboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        ComboBox2.setBounds(350, 170, 320, 30);
        add(ComboBox2);


        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100, 220, 100, 30);
        add(l5);
        String Income[] = {"Null", "<1,50,000", "<2,50,000", "5,00,000", "upto 10,00,000", "Above 10,00,000"};

        ComboBox3 = new JComboBox(Income);
        ComboBox3.setBackground(new Color(252, 208, 76));
        ComboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        ComboBox3.setBounds(350, 220, 320, 30);
        add(ComboBox3);


        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100, 270, 150, 30);
        add(l6);
        String Educational[] = {"Non-Graguate", "Graguate", "Post-Graguate", "Doctrate", "Other"};

        ComboBox4 = new JComboBox(Educational);
        ComboBox4.setBackground(new Color(252, 208, 76));
        ComboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        ComboBox4.setBounds(350, 270, 320, 30);
        add(ComboBox4);


        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100, 340, 150, 30);
        add(l7);

        String Occupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        ComboBox5 = new JComboBox(Occupation);
        ComboBox5.setBackground(new Color(252, 208, 76));
        ComboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        ComboBox5.setBounds(350, 340, 320, 30);
        add(ComboBox5);


        JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 390, 150, 30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD, 18));
        textPan.setBounds(350, 390, 320, 30);
        add(textPan);


        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100, 440, 180, 30);
        add(l9);

        textaddhar = new JTextField();
        textaddhar.setFont(new Font("Raleway", Font.BOLD, 18));
        textaddhar.setBounds(350, 440, 320, 30);
        add(textaddhar);


        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 490, 180, 30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(252, 208, 76));
        r1.setBounds(350, 490, 100, 30);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(252, 208, 76));
        r2.setBounds(460, 490, 100, 30);
        add(r2);


        JLabel l11 = new JLabel("Existing account : ");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 540, 180, 30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBackground(new Color(252, 208, 76));
        e1.setBounds(350, 540, 100, 30);
        add(e1);
        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBackground(new Color(252, 208, 76));
        e2.setBounds(460, 540, 100, 30);
        add(e2);


        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD, 18));
        l12.setBounds(700, 10, 60, 30);
        add(l12);


        JLabel l13 = new JLabel("formno : ");
        l13.setFont(new Font("Raleway", Font.BOLD, 18));
        l13.setBounds(760, 10, 100, 30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570, 640, 100, 30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(252, 208, 76));
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) ComboBox.getSelectedItem();
        String cate = (String) ComboBox2.getSelectedItem();
        String inc = (String) ComboBox3.getSelectedItem();
        String edu = (String) ComboBox4.getSelectedItem();
        String occ = (String) ComboBox5.getSelectedItem();

        String pan = textPan.getText();
        String addhar = textaddhar.getText();

        String scitizen = " ";
        if ((r1.isSelected())) {
            scitizen = "Yes";

        } else if (r2.isSelected()) {
            scitizen = "No";
        }
        String eAccount = " ";
        if ((r1.isSelected())) {
            eAccount = "Yes";

        } else if (r2.isSelected()) {
            eAccount = "No";
        }
        try {
            if (textPan.getText().equals("") || textaddhar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else{
                Con c1 = new Con();
                String q = "insert into Signuptwo values('"+formno+"','"+rel+"' ,'"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);

            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new Signup2("");
    }
}
