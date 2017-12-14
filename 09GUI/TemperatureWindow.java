import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureWindow extends JFrame implements ActionListener{
    private Container pane;
    private JButton cf;
    private JButton fc;
    private JLabel C;
    private JLabel F;
    private JTextField c;
    private JTextField f;

    public TemperatureWindow() {
        this.setTitle("Fahrenheit/Celcius Temperature Converter");
        this.setSize(600, 400);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        pane = this.getContentPane();
        pane.setLayout(new FlowLayout());

        cf = new JButton("Make it Fahrenheit!");
        cf.addActionListener(this);
        cf.setActionCommand("c2f");
        fc = new JButton("Make it Celcius!");
        fc.addActionListener(this);
        fc.setActionCommand("f2c");
        C = new JLabel("Celcius");
        F = new JLabel("Farenheit");
        c = new JTextField(20);
        f = new JTextField(20);

        pane.add(cf);
        pane.add(fc);
        pane.add(C);
        pane.add(F);
        pane.add(c);
        pane.add(f);
    }

    public void actionPerformed(ActionEvent e){
    if(e.getActionCommand().equals("c2f")){
        f.setText(Double.toString(CtoF(Double.parseDouble(c.getText()))));
    }else
        c.setText(Double.toString(FtoC(Double.parseDouble(f.getText()))));
    }

    public static double CtoF(double temp){
        return ((temp * 1.8) + 32);
    }

    public static double FtoC(double temp){
        return ((temp - 32) / 1.8);
    }

    public static void main(String[] i){
        TemperatureWindow a = new TemperatureWindow();
        a.setVisible(true);
    }
}
	
