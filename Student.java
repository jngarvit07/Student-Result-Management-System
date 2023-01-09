import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;

class Student
{

    JFrame f1 = new JFrame("Student Login Portal");

	JLabel l, l1, l2, l3;

    JTextField tf1, tf2, tf3;

    JButton b1, b2, b3;

	Connection con = null;
	
	PreparedStatement pst = null;
	
	ResultSet rs;


    Student()
    {

		Icon icon = new ImageIcon("resize-1671468204542799099Studentpresenting2.jpg");
        l = new JLabel(icon);
		l.setBounds(0, 5, 500, 215);

        l1 = new JLabel("Enter Roll No:");
		l1.setBounds(50, 250, 250, 30);

        tf1=new JTextField();
        tf1.setBounds(250,250,200,30);

		l2 = new JLabel("Class:");
		l2.setBounds(50, 300, 200, 30);

		tf2 = new JTextField();
		tf2.setBounds(250, 300, 200, 30);

        l3 = new JLabel("Mother's Name:");
		l3.setBounds(50, 350, 200, 30);

		tf3 = new JTextField();
		tf3.setBounds(250, 350, 200, 30);

        b1 = new JButton("Submit");
		b1.setBounds(25,400, 150, 30);

        b2 = new JButton("Clear");
		b2.setBounds(275, 400, 150, 30);

		b3 = new JButton("Back");
		b3.setBounds(150, 450, 150, 30);

        f1.add(l);
		f1.add(l1);
		f1.add(tf1);
		f1.add(l2);
		f1.add(tf2);
		f1.add(l3);
		f1.add(tf3);
		f1.add(b1);
        f1.add(b2);
		f1.add(b3);


		/*b1.addActionListener(new ActionListener() 
        {
				public void actionPerformed(ActionEvent e)
				{


					try {
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akshu", "anshu", "anshu#99");
						pst = con.prepareStatement("SELECT * FROM student where id = ?");
						pst.setString(1, str);
						rs = pst.executeQuery();
						if(rs.next()==true) 
						{
							 String s = rs.getString(1);
							 String s1 = rs.getString(2);
							 String s2 = rs.getString(3);
							
							 tf1.setText(s);
							 tf2.setText(s1);
							 tf3.setText(s2);				
							}
						
					}

					catch (SQLException e1) 
					{
						e1.printStackTrace();
					}
				}
        }); */


		b2.addActionListener(new ActionListener() 
        {
				public void actionPerformed(ActionEvent e)
				{
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
                }
        }); 

		b3.addActionListener(new ActionListener() 
        {
				public void actionPerformed(ActionEvent e)
				{
               f1.getContentPane().add(b3);

                     f1.dispose();
                     new Portal();
            }
        });

        f1.addWindowListener(new WindowAdapter() 
        {
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});


			

		f1.setSize(500, 550);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setLocationRelativeTo(null); 
        f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		f1.getContentPane().setBackground(Color.WHITE);

    }

    public static void main(String[] args) 
{
    new Student();
}
}