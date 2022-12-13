package com.forms;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Forms extends JFrame  {
	
	private JLabel heading;
	Font font=new Font("",Font.BOLD,30);
	
	private JPanel mainPanel;
	private JLabel nameLabel,passwordLable;
	private JTextField nameTextField;
	private JPasswordField passwordField;
	private JButton button1,button2;
	
	
	
public Forms() {
	
	super.setTitle("My First form ..");
	super.setSize(500,250);
	super.setLocation(100,100);
	this.CreateGUI();

	super.setVisible(true);
	System.out.println("this is the constructor");
	
}
public void CreateGUI() {
	this.setLayout(new BorderLayout());
	heading=new JLabel("My FIrst FOrm...");
	heading.setFont(font);
	heading.setHorizontalAlignment(JLabel.CENTER);
	
	this.add(heading,BorderLayout.NORTH);
	
	/////////////////working with JPanel
	
		mainPanel=new JPanel();
	mainPanel.setLayout(new GridLayout(3, 2));
	
	nameLabel=new JLabel("Enter Name");
	nameLabel.setFont(font);
	
	
	passwordLable=new JLabel("Enter Password");
	passwordLable.setFont(font);
	nameTextField=new JTextField();
	nameTextField.setFont(font);
	
	passwordField=new JPasswordField();
	passwordField.setFont(font);
	
	button1=new JButton("Submit");
	button1.setFont(font);
	
	button2=new JButton("Reset");
	button2.setFont(font);
	
	mainPanel.add(nameLabel);
	mainPanel.add(nameTextField);
	
	mainPanel.add(passwordLable);
	mainPanel.add(passwordField);
	
	mainPanel.add(button1);
	mainPanel.add(button2);
	 
	this.add(mainPanel,BorderLayout.CENTER);

	
}
}
