import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Admin 
{
   JLabel l1, l2, msg;
   JTextField tf1;
   JPasswordField tp1;
   JButton b1, b2, b3;
   private JFrame f = new JFrame("Admin Login Portal");

   Admin() 
   {
      l1 = new JLabel("Username:");
      l1.setFont(new Font("Serif", Font.BOLD, 20));
      l1.setForeground(new Color(0, 0, 0));
      l1.setBounds(50, 100, 250, 20);

      tf1 = new JTextField();
      tf1.setBounds(250,100,200,20);

      l2 = new JLabel("Password:");
      l2.setFont(new Font("Serif", Font.BOLD, 20));
      l2.setForeground(new Color(0, 0, 0));
      l2.setBounds(50, 150, 250, 20);

      tp1 = new JPasswordField();
      tp1.setBounds(250, 150, 200, 20);

      b1 = new JButton("SUBMIT");
      b1.setBounds(25, 200, 175, 30);

      b2 = new JButton("CLEAR");
      b2.setBounds(275, 200, 175, 30);

      b3 = new JButton("BACK");
      b3.setBounds(275, 250, 175, 30);

      msg = new JLabel();
      msg.setBounds(50, 250, 200, 30);

      f.setContentPane(new JLabel(new ImageIcon("resize-167160168486821579ad2.jpg")));
      f.add(l1);
      f.add(tf1);
      f.add(l2);
      f.add(tp1);
      f.add(msg);
      f.add(b1);
      f.add(b2);
      f.add(b3);


      
      f.setSize(500,400);
      f.setLayout(null);
      f.setVisible(true);
      f.setLocationRelativeTo(null); 
      f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

      b1.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e) 
            {
               String userName = tf1.getText();
               String password = tp1.getText();
               if (userName.trim().equals("admin") && password.trim().equals("admin")) 
               {
                  f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                  f.getContentPane().add(b1);

                     f.dispose();
                     new Result();
               } 
               else 
               {
                  msg.setText(" Invalid user.. ");
                  msg.setFont(new Font("Serif", Font.BOLD, 20));
                  msg.setForeground(new Color(0, 0, 0));
               }
            }
      });

      b2.addActionListener(new ActionListener() 
        {
				public void actionPerformed(ActionEvent e)
				{
					tf1.setText("");
					tp1.setText("");
				   }
        }); 


      b3.addActionListener(new ActionListener() 
        {
				public void actionPerformed(ActionEvent e)
				{
               f.getContentPane().add(b3);

                     f.dispose();
                     new Portal();
            }
        });
   }   

   public static void main(String[] args) 
   {
      new Admin();
   }
   
}