import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureWindow extends JFrame implements ActionListener{
    private Container pane;
    private JButton cf;
    private Jbutton fc;
    private JLabel C;
    private JLabel F;
    private JTextField c;
    private JTextField f;

    public TemperatureWindow(){
	this.setTitle("Fahrenheit/Celcius Temperature Converter");
	this.setSize(1000,800);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayoyt(new FlowLayout());

	cf = new JButton("Make it Fahrenheit!");
	fc = new JButton("Make it Celcius!");
	
