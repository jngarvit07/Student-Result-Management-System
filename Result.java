import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JFrame;

public class Result
{

	JFrame f1 = new JFrame("Student Data Entry Portal");

	JLabel l, l1, l2, l3, l4,l5, l6, l7, l8, l9, l10, l11;

	JTextField tf, tf1, tf2, tf3,tf4, tf5, tf6,tf7, tf8, tf9,tf10, tf11, tf12, tf13, tf14, tf15;

    JButton b1, b2, b3, b4, b5, b6;

	JComboBox cl, sec, cd, gm, cb1, cb2, cb3, cb4, cb5, cb6;

	JTextArea area1 = new JTextArea();
	
	FileWriter fw;

	Result()
    {

		l = new JLabel("Student Result Management");
		l.setBounds(550, 10, 250, 30);

        l1 = new JLabel("Enter Roll No:");
		l1.setBounds(50, 50, 250, 30);

        tf1=new JTextField();
        tf1.setBounds(250,50,250,30);

		l2 = new JLabel("Student Name:");
		l2.setBounds(50, 100, 250, 30);

		tf2 = new JTextField();
		tf2.setBounds(250, 100, 250, 30);

		l3 = new JLabel("Father Name:");
		l3.setBounds(50, 150, 250, 30);

		tf3 = new JTextField();
		tf3.setBounds(250, 150, 250, 30);

		l4 = new JLabel("Mother Name:");
		l4.setBounds(50, 200, 250, 30);

		tf4 = new JTextField();
		tf4.setBounds(250, 200, 250, 30);

		String Class[]={"Class", "9", "10", "11", "12"};

		cl = new JComboBox(Class);
        cl.setBounds(100, 250, 150, 30);

		String Section[] = { "Section", "A", "B", "C", "D", "E"};

		sec = new JComboBox(Section);
        sec.setBounds(300, 250, 150, 30);

		l5 = new JLabel("Email ID:");
		l5.setBounds(50, 300, 250, 30);

		tf5 = new JTextField();
		tf5.setBounds(250, 300, 125, 30);

		String gmail[]={"@gmail.com", "@yahoo.com", "@ac.in"};

		gm = new JComboBox(gmail);
        gm.setBounds(375, 300, 125, 30);

		l6 = new JLabel("Contact Number:");
		l6.setBounds(50, 350, 250, 30);

		String Code[]={"+91", "+1", "+101", "11"};

		cd = new JComboBox(Code);
        cd.setBounds(250, 350, 75, 30);

		tf6 = new JTextField();
		tf6.setBounds(325, 350, 175, 30);

		String Sub1[] = { "Physics", "Chemistry", "Biology", 
		"Mathematics", "Science", "English", "Hindi", "Physical", 
		"Computer", "Social Studies"};

		l7 = new JLabel("Subjects");
		l7.setBounds(700, 50, 200, 30);

		l8 = new JLabel("Marks(Out Of 100)");
		l8.setBounds(950, 50, 200, 30);

        cb1 = new JComboBox(Sub1);
        cb1.setBounds(700, 100, 200, 30);

		tf7=new JTextField();
        tf7.setBounds(950,100,200,30);

		cb2 = new JComboBox(Sub1);
        cb2.setBounds(700, 150, 200, 30);

		tf8=new JTextField();
        tf8.setBounds(950, 150, 200, 30);
        
        cb3 = new JComboBox(Sub1);
        cb3.setBounds(700, 200, 200, 30);

		tf9=new JTextField();
        tf9.setBounds(950,200,200,30);

        cb4 = new JComboBox(Sub1);
        cb4.setBounds(700, 250, 200, 30);

		tf10=new JTextField();
        tf10.setBounds(950,250,200,30);

        cb5 = new JComboBox(Sub1);
        cb5.setBounds(700, 300, 200, 30);

		tf11=new JTextField();
        tf11.setBounds(950, 300, 200, 30);

		cb6 = new JComboBox(Sub1);
        cb6.setBounds(700, 350, 200, 30);

		tf12=new JTextField();
        tf12.setBounds(950,350,200,30);

		l9 = new JLabel("Total Marks");
		l9.setBounds(700, 400, 200, 30);

		tf13=new JTextField();
        tf13.setBounds(950,400,200,30);

		l10 = new JLabel("Percentage");
		l10.setBounds(700, 450, 200, 30);

		tf14=new JTextField();
        tf14.setBounds(950,450,200,30);

		l11 = new JLabel("Institution Name:");
		l11.setBounds(50, 400, 250, 30);

		tf15=new JTextField();
        tf15.setBounds(250,400,200,30);

		b3 = new JButton("Calculate");
		b3.setBounds(700, 500, 200, 35);

		b1 = new JButton("Show");
		b1.setBounds(950, 500, 200, 35);

		b5 = new JButton("Save");
		b5.setBounds(75, 450, 200, 35);

		b2 = new JButton("Submit");
		b2.setBounds(300, 450, 200, 35);

		b4 = new JButton("Reset");
		b4.setBounds(75, 500, 200, 35);

		b6 = new JButton("Logout");
		b6.setBounds(300, 500, 200, 35);

		f1.setContentPane(new JLabel(new ImageIcon("resize-1671464310468109560456.jpg")));
    	f1.add(l);
		f1.add(l1);
		f1.add(tf1);
		f1.add(l2);
		f1.add(tf2);
		f1.add(l3);
		f1.add(tf3);
		f1.add(l4);
		f1.add(tf4);
		f1.add(l5);
		f1.add(tf5);
		f1.add(gm);
		f1.add(l6);
		f1.add(cd);
		f1.add(tf6);
		f1.add(cl);
		f1.add(sec);
		f1.add(b1);
		f1.add(b2);
		f1.add(l7);
		f1.add(l8);
        f1.add(cb1);
		f1.add(tf7);
        f1.add(cb2);
		f1.add(tf8);
        f1.add(cb3);
		f1.add(tf9);
        f1.add(cb4);
		f1.add(tf10);
        f1.add(cb5);
		f1.add(tf11);
		f1.add(cb6);
		f1.add(tf12);
        f1.add(l9);
		f1.add(tf13);
		f1.add(l10);
		f1.add(tf14);
		f1.add(l11);
		f1.add(tf15);
		f1.add(b3);
		f1.add(b4);
		f1.add(b5);
		f1.add(b6);

		//reset button
		b4.addActionListener(new ActionListener() 
        {
			public void actionPerformed(ActionEvent e)
			{
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				tf6.setText("");
                tf7.setText("");
                tf8.setText("");
                tf9.setText("");
                tf10.setText("");
                tf11.setText("");
                tf12.setText("");
                tf13.setText("");
				tf14.setText("");
				tf15.setText("");
				area1.setText(null);
			}
		});


		//calculate button
		b3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{    
				String s1 = tf7.getText();    
				String s2 = tf8.getText(); 
				String s3 = tf9.getText();    
				String s4 = tf10.getText(); 
				String s5 = tf11.getText();    
				String s6 = tf12.getText(); 
				
				int a = Integer.parseInt(s1);    
				int b = Integer.parseInt(s2); 
				int c = Integer.parseInt(s3);
				int d = Integer.parseInt(s4);   
				int f = Integer.parseInt(s5);
				int g = Integer.parseInt(s6);
				int h = 0;
				int i = 0;  
				
				if (e.getSource() == b3)
				{    
					h = a + b + c + d + f + g; 
					i=(h*100)/600;
				}

				String total = String.valueOf(h); 
				String percent = String.valueOf(i); 
				tf13.setText(total);  
				tf14.setText(percent);				
				
			}
		});


		//show button
		b1.addActionListener(new ActionListener() 
        {
			public void actionPerformed(ActionEvent e)
			{
				JFrame f2 = new JFrame("Result");

				area1.setBounds(50, 100, 600, 200);
				area1.setBackground(Color.GRAY);
				area1.setForeground(Color.BLACK);
				
				area1.setText("--------------------------------------------------Student Result-------------------------------------------------"+"\n");
				
				area1.setText(area1.getText()+ "Roll Number: "+ tf1.getText()+ "\t\t\t");
				
				area1.setText(area1.getText()+ cb1.getSelectedItem().toString()+" Marks:"+tf7.getText() +"\n");
				
				area1.setText(area1.getText()+ "Student Name: "+ tf2.getText()+ "\t\t\t");
				
				area1.setText(area1.getText()+ cb2.getSelectedItem().toString()+" Marks:"+tf8.getText() +"\n");
				
				area1.setText(area1.getText()+ "Father Name: "+ tf3.getText()+ "\t\t\t");
				
				area1.setText(area1.getText()+ cb3.getSelectedItem().toString()+" Marks:"+tf9.getText() +"\n");
				
				area1.setText(area1.getText()+ "Mother Name: "+ tf4.getText()+ "\t\t\t");
				
				area1.setText(area1.getText()+ cb4.getSelectedItem().toString()+" Marks:"+tf10.getText() +"\n");
                
				area1.setText(area1.getText()+ "Class: "+ cl.getSelectedItem().toString()+ "\t\t\t\t");
				
				area1.setText(area1.getText()+ cb5.getSelectedItem().toString()+" Marks:"+tf11.getText() +"\n");
                
				area1.setText(area1.getText()+ "Section: "+ sec.getSelectedItem().toString()+ "\t\t\t\t");
				
				area1.setText(area1.getText()+ cb6.getSelectedItem().toString()+" Marks:"+tf11.getText() +"\n");
				
				area1.setText(area1.getText()+ "Email ID: "+ tf5.getText()+gm.getSelectedItem().toString()+ "\t\t");
				
				area1.setText(area1.getText()+ "Total Marks: "+ tf13.getText()+ "\n");
                
				area1.setText(area1.getText()+ "Contact Number: "+cd.getSelectedItem().toString()+ tf6.getText()+ "\t\t");
				
				area1.setText(area1.getText()+ "Percentage: "+ tf14.getText()+ "\n");

				f2.setSize(650,250);
				f2.add(area1);
				f2.setVisible(true);
				f2.setLocationRelativeTo(null); 
        		f2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				f2.getContentPane().setBackground(Color.WHITE);

				

			};
		});


		//save button
		b5.addActionListener(new ActionListener() 
        {
			public void actionPerformed(ActionEvent e)
			{
				if (e.getSource() == b1) 
                {
					try 
                    {
						FileWriter fw= new FileWriter("java.txt", true);
                        fw.write(area1.getText());
						fw.close();
					}
					catch (Exception ae) 
                    {
						System.out.println(ae);
					}
				}

				JOptionPane.showMessageDialog(area1, "DATA SAVED SUCCESSFULLY");
				};
		});

		
		//logout button
		b6.addActionListener(new ActionListener() 
        {
				public void actionPerformed(ActionEvent e)
				{
               f1.getContentPane().add(b6);

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

		f1.setSize(1200, 600);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setLocationRelativeTo(null); 
		f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
	}

    
public static void main(String[] args) 
{
    new Result();
}
}

		/*try
		{
			Statement stmt1=null;
			String query1 = "SELECT brand FROM brands";
			stmt1 = con.createStatement();
			ResultSet rs1 = stmt1.executeQuery(query1);
			while(rs1.next()) 
			{
				cb1.addItem(rs1.getString(1));
			}
		
			cb1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event)
				{
				String cb1Selected=cb1.getSelectedItem().toString();
				try
				{
				Statement stmt2=null;
				String query2 = "SELECT item FROM "+cb1Selected+"";
				stmt2 = con.createStatement();
				ResultSet rs2 = stmt2.executeQuery(query2);
				while(rs2.next()) 
				{
					cb2.addItem(rs2.getString(1));
				}
				}
				catch (SQLException ex1) 
				{
					JOptionPane.showMessageDialog(null,"Failed to Item-List..!"); 
					ex1.printStackTrace(); 
					return;
			}
			}
			});
			catch (SQLException ex2) 
			{
				JOptionPane.showMessageDialog(null,"Failed to Brand-List..!");
				ex2.printStackTrace(); 
				return;
			}
		}*/

