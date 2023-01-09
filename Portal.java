import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Portal
{
    private JFrame f = new JFrame("Login Portal");

    private JLabel l1 = new JLabel();

    private JLabel l2 = new JLabel();

    private JButton b = new JButton("Admin");
    
    private JButton b1 = new JButton("Student");

    Portal()
    {
        Icon icon = new ImageIcon("resize-16713755181751149779admin.jpg");
        l1 = new JLabel(icon);
        l1.setBounds(200,60,100,75);

        b.setBounds(200,140,100,30);
        b.setBackground(Color.lightGray);
        b.setForeground(Color.BLACK);

        Icon icon2 = new ImageIcon("resize-16713761141017205588student.png");
        l2 = new JLabel(icon2);
        l2.setBounds(200,200,100,75);

        b1.setBounds(200,280,100,30);
        b1.setBackground(Color.lightGray);
        b1.setForeground(Color.BLACK);

        f.setContentPane(new JLabel(new ImageIcon("resize-16713794611066275112library.jpg")));
        f.add(l1);
        f.add(l2);
        f.getContentPane().add(b);
        f.getContentPane().add(b1);


        f.setSize(500,400);
        f.setLayout(null);
		f.setVisible(true);
        f.setLocationRelativeTo(null); 
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);


        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
                new Admin();
            }
        });

        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
                new Student();
            }
        });
    }

    public static void main(String[] args)
    {
        new Portal();
    }
} 