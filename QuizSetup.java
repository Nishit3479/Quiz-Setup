package com.demo.gui;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class QuizSetup implements ActionListener 
{
	public static void main(String []args)
	{
		new QuizSetup();
	}
	static JFrame frame1, frame2;
	static JPanel jp1, jp2;
	static JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14;
	static JButton b1, b2, b3, b4, b5;
	static JTextField tf1, tf2, tf3, tf4;
	static JTextArea ta1, ta2, ta3, ta4, ta5, ta6;
	static JRadioButton rb1, rb2, rb3, rb4;
	static JComboBox <String> cb1;
	static JCheckBox A, B, C, D;
	QuizSetup()
	{
		//Panel - 1
		frame1 = new JFrame("Quiz Setup");
		frame1.setBounds(600,150,750,800);
		frame1.setLayout(null);
		frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
		
		jp1 = new JPanel();
		jp1.setBounds(0,0,750,800);
		jp1.setBackground(Color.DARK_GRAY);
		jp1.setLayout(null);
		
		l1 = new JLabel("Welcome to Quiz Setup");
		l1.setBounds(150,10,480,100);
		l1.setFont(new Font("Arial", Font.PLAIN, 40));
		l1.setForeground(Color.white);
		jp1.add(l1);
		
		l2 = new JLabel("Enter Question :");
		l2.setBounds(40,120,150,40);
		l2.setFont(new Font("Arial", Font.PLAIN, 20));
		l2.setForeground(Color.white);
		jp1.add(l2);
		
		ta1 = new JTextArea();
		ta1.setBounds(200,130,500,120);
		ta1.setFont(new Font("Arial", Font.PLAIN, 20));
		jp1.add(ta1);
		
		l2 = new JLabel("Enter Option A :");
		l2.setBounds(40,260,150,40);
		l2.setFont(new Font("Arial", Font.PLAIN, 20));
		l2.setForeground(Color.white);
		jp1.add(l2);
		
		tf1 = new JTextField(20);
		tf1.setBounds(200,270,300,35);
		tf1.setFont(new Font("Arial", Font.PLAIN, 20));
		jp1.add(tf1);
		
		l3 = new JLabel("Enter Option B :");
		l3.setBounds(40,315,150,40);
		l3.setFont(new Font("Arial", Font.PLAIN, 20));
		l3.setForeground(Color.white);
		jp1.add(l3);
		
		tf2 = new JTextField(20);
		tf2.setBounds(200,325,300,35);
		tf2.setFont(new Font("Arial", Font.PLAIN, 20));
		jp1.add(tf2);
		
		l4 = new JLabel("Enter Option C :");
		l4.setBounds(40,370,150,40);
		l4.setFont(new Font("Arial", Font.PLAIN, 20));
		l4.setForeground(Color.white);
		jp1.add(l4);
		
		tf3 = new JTextField(20);
		tf3.setBounds(200,380,300,35);
		tf3.setFont(new Font("Arial", Font.PLAIN, 20));
		jp1.add(tf3);
		
		l5 = new JLabel("Enter Option D :");
		l5.setBounds(40,425,150,40);
		l5.setFont(new Font("Arial", Font.PLAIN, 20));
		l5.setForeground(Color.white);
		jp1.add(l5);
		
		tf4 = new JTextField(20);
		tf4.setBounds(200,435,300,35);
		tf4.setFont(new Font("Arial", Font.PLAIN, 20));
		jp1.add(tf4);
		
		l6 = new JLabel("Select Correct Option :");
		l6.setBounds(40,490,250,40);
		l6.setFont(new Font("Arial", Font.PLAIN, 20));
		l6.setForeground(Color.white);
		jp1.add(l6);
		
		A = new JCheckBox("A");
		A.setFont(new Font("Arial", Font.PLAIN, 20));
		A.setBackground(Color.DARK_GRAY);
		A.setForeground(Color.white);
		A.setBounds(280,499,60,25);
		jp1.add(A);
		
		B = new JCheckBox("B");
		B.setFont(new Font("Arial", Font.PLAIN, 20));
		B.setBackground(Color.DARK_GRAY);
		B.setForeground(Color.white);
		B.setBounds(380,499,60,25);
		jp1.add(B);
		
		C = new JCheckBox("C");
		C.setFont(new Font("Arial", Font.PLAIN, 20));
		C.setBackground(Color.DARK_GRAY);
		C.setForeground(Color.white);
		C.setBounds(280,529,60,25);
		jp1.add(C);
		
		D = new JCheckBox("D");
		D.setFont(new Font("Arial", Font.PLAIN, 20));
		D.setBackground(Color.DARK_GRAY);
		D.setForeground(Color.white);
		D.setBounds(380,529,60,25);
		jp1.add(D);
		
		ButtonGroup Option=new ButtonGroup();    
	    Option.add(A);
	    Option.add(B);
	    Option.add(C);
	    Option.add(D);
		
		b1 = new JButton("Submit");
	    b1.setBounds(470,650,90,30);
		b1.setFont(new Font("Arial", Font.BOLD, 15));
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.black);
		b1.addActionListener(this);
		jp1.add(b1);
		
		b2 = new JButton("Add Question");
	    b2.setBounds(290,650,130,30);
		b2.setFont(new Font("Arial", Font.BOLD, 15));
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.black);
		b2.addActionListener(this);
		jp1.add(b2);
		
		b3 = new JButton("Reset");
	    b3.setBounds(145,650,90,30);
		b3.setFont(new Font("Arial", Font.BOLD, 15));
		b3.setBackground(Color.WHITE);
		b3.setForeground(Color.black);
		b3.addActionListener(this);
		jp1.add(b3);
		
		l7 = new JLabel("©Java-Eclipse");
		l7.setBounds(600,715,120,25);
		l7.setFont(new Font("Arial", Font.BOLD, 15));
		l7.setForeground(Color.white);
		jp1.add(l7);
		
		frame1.add(jp1);
		frame1.setVisible(true);
		
		//Panel - 2
		frame2 = new JFrame("Quiz Setup");
		frame2.setBounds(600,150,750,800);
		frame2.setLayout(null);
		frame2.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
		
		jp2 = new JPanel();
		jp2.setBounds(0,0,750,800);
		jp2.setBackground(Color.DARK_GRAY);
		jp2.setLayout(null);
		
		l9 = new JLabel("NOTE : You Cannot go back to the previous Question");
		l9.setBounds(10,10,700,60);
		l9.setFont(new Font("Arial", Font.BOLD, 25));
		l9.setForeground(Color.white);
		jp2.add(l9);
		
		l10 = new JLabel("Q.");
		l10.setBounds(10,80,30,30);
		l10.setFont(new Font("Arial", Font.BOLD, 20));
		l10.setForeground(Color.white);
		jp2.add(l10);
		
		ta2 = new JTextArea();
		ta2.setBounds(60,83,620,150);
		ta2.setFont(new Font("Arial", Font.BOLD, 20));
		ta2.setBackground(Color.DARK_GRAY);
		ta2.setForeground(Color.white);
		jp2.add(ta2);
		
		l11 = new JLabel("Options :");
		l11.setBounds(10,270,100,30);
		l11.setFont(new Font("Arial", Font.BOLD, 20));
		l11.setForeground(Color.white);
		jp2.add(l11);
		
		rb1 = new JRadioButton("A", false);
		rb1.setFont(new Font("Arial", Font.PLAIN, 20));
		rb1.setBackground(Color.DARK_GRAY);
		rb1.setForeground(Color.white);
		rb1.setBounds(50,325,60,25);
		jp2.add(rb1);
		
		ta3 = new JTextArea();
		ta3.setBounds(125,325,350,30);
		ta3.setFont(new Font("Arial", Font.BOLD, 20));
		ta3.setBackground(Color.DARK_GRAY);
		ta3.setForeground(Color.white);
		jp2.add(ta3);
		
		rb2 = new JRadioButton("B", false);
		rb2.setFont(new Font("Arial", Font.PLAIN, 20));
		rb2.setBackground(Color.DARK_GRAY);
		rb2.setForeground(Color.white);
		rb2.setBounds(50,390,60,25);
		jp2.add(rb2);
		
		ta4 = new JTextArea();
		ta4.setBounds(125,390,350,30);
		ta4.setFont(new Font("Arial", Font.BOLD, 20));
		ta4.setBackground(Color.DARK_GRAY);
		ta4.setForeground(Color.white);
		jp2.add(ta4);
		
		rb3 = new JRadioButton("C", false);
		rb3.setFont(new Font("Arial", Font.PLAIN, 20));
		rb3.setBackground(Color.DARK_GRAY);
		rb3.setForeground(Color.white);
		rb3.setBounds(50,455,60,25);
		jp2.add(rb3);
		
		ta5 = new JTextArea();
		ta5.setBounds(125,455,350,30);
		ta5.setFont(new Font("Arial", Font.BOLD, 20));
		ta5.setBackground(Color.DARK_GRAY);
		ta5.setForeground(Color.white);
		jp2.add(ta5);
		
		rb4 = new JRadioButton("D", false);
		rb4.setFont(new Font("Arial", Font.PLAIN, 20));
		rb4.setBackground(Color.DARK_GRAY);
		rb4.setForeground(Color.white);
		rb4.setBounds(50,520,60,25);
		jp2.add(rb4);
		
		ta6 = new JTextArea();
		ta6.setBounds(125,520,350,30);
		ta6.setFont(new Font("Arial", Font.BOLD, 20));
		ta6.setBackground(Color.DARK_GRAY);
		ta6.setForeground(Color.white);
		jp2.add(ta6);
		
		ButtonGroup Answer=new ButtonGroup();    
	    Answer.add(rb1);
	    Answer.add(rb2);
	    Answer.add(rb3);
	    Answer.add(rb4);
	    
	    b4 = new JButton("Submit Answer");
	    b4.setBounds(320,620,150,30);
		b4.setFont(new Font("Arial", Font.BOLD, 15));
		b4.setBackground(Color.WHITE);
		b4.setForeground(Color.black);
		b4.addActionListener(this);
		jp2.add(b4);
		
		b5 = new JButton("Clear");
	    b5.setBounds(200,620,90,30);
		b5.setFont(new Font("Arial", Font.BOLD, 15));
		b5.setBackground(Color.WHITE);
		b5.setForeground(Color.black);
		b5.addActionListener(this);
		jp2.add(b5);

		jp2.setVisible(true);
		frame2.add(jp2);
	}
	static String S="";
	static int c = 0;
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println(e.getActionCommand());
		S = e.getActionCommand();
        String[] options = {"Yes", "No"}; 
	if(S.equals("Add Question"))
	{
				c = JOptionPane.showOptionDialog
				        (
				        frame1,
				        "Are You Sure? You want to Add a Question", 
				        "Warning",            
				        JOptionPane.YES_NO_OPTION,
				        JOptionPane.WARNING_MESSAGE,
				        null,     
				        options,  
				        options[0] 
				        );
		if(c == JOptionPane.YES_OPTION)
		{
			new QuizSetup();
		}
	}
	if(S.equals("Reset"))
	{
			c = JOptionPane.showOptionDialog
		        (
		        frame1,
		        "Are You Sure? You want to Reset", 
		        "Warning",            
		        JOptionPane.YES_NO_OPTION,
		        JOptionPane.WARNING_MESSAGE,
		        null,     
		        options,  
		        options[0] 
		        );
		if(c == JOptionPane.YES_OPTION)
		{
			new QuizSetup();
	    }
	}
	if(S.equals("Submit"))
	{
			c = JOptionPane.showOptionDialog
		        (
		        frame1,
		        "Are You Sure? You want to Submit", 
		        "Warning",            
		        JOptionPane.YES_NO_OPTION,
		        JOptionPane.WARNING_MESSAGE,
		        null,     
		        options,  
		        options[0] 
		        );
			if(c == JOptionPane.YES_OPTION)
			{
			c = JOptionPane.showOptionDialog
			        (
			        frame1,
			        "Are You Ready to start exam?", 
			        "Warning",            
			        JOptionPane.YES_NO_OPTION,
			        JOptionPane.WARNING_MESSAGE,
			        null,     
			        options,  
			        options[0] 
			        );
					if(c == JOptionPane.YES_OPTION)
					{
						frame1.setVisible(false);
						frame2.setVisible(true);
						jp2.add(l7);
						ta2.setText("Question");
						ta3.setText("Option A");
						ta4.setText("Option B");
						ta5.setText("Option C");
						ta6.setText("Option D");
					}
			}
			
	}
	if(S.equals("Clear"))
	{
			c = JOptionPane.showOptionDialog
		        (
		        frame1,
		        "Are You Sure? You want to Clear the Answer", 
		        "Warning",            
		        JOptionPane.YES_NO_OPTION,
		        JOptionPane.WARNING_MESSAGE,
		        null,     
		        options,  
		        options[0] 
		        );
		if(c == JOptionPane.YES_OPTION)
		{
			rb1.setSelected(false);
			rb2.setSelected(false);
			rb3.setSelected(false);
			rb4.setSelected(false);
	    }
	}
	if(S.equals("Submit Answer"))
	{
			c = JOptionPane.showOptionDialog
		        (
		        frame1,
		        "Are You Sure? You want to Submit the Answer", 
		        "Warning",            
		        JOptionPane.YES_NO_OPTION,
		        JOptionPane.WARNING_MESSAGE,
		        null,     
		        options,  
		        options[0] 
		        );
		if(c == JOptionPane.YES_OPTION)
		{
//			ta2.setText(t);
//			ta3.setText(t);
//			ta4.setText(t);
//			ta5.setText(t);
//			ta6.setText(t);
	    }
	}
	}
}
