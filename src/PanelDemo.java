import javax.swing.*;
import java.awt.*;

class PanelDemo extends JFrame {
    private Container c;
    private JPanel panel1,panel2;
    private JButton btn1 , btn2 , btn3;
    private JLabel label;
    PanelDemo(){
        initComponent();
    }
    private void initComponent(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100,100,700,500);
        this.setTitle("Label Demo");

        c = this.getContentPane();
        c.setLayout(null);
        //c.setBackground(Color.PINK);

        label = new JLabel("Creating two JPanels ");
        label.setBounds(150,20,200,50);
        c.add(label);
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");

        panel1 = new JPanel();
        panel1.setBounds(100,100,250,300);
        panel1.setBackground(Color.RED);
        c.add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(355,100,250,300);
        panel2.setBackground(Color.green);
        c.add(panel2);

        panel1.add(btn1);
        panel2.add(btn2);
        panel1.add(btn3);
    }
    public static void main(String[] args) {
        PanelDemo frame = new PanelDemo();
        frame.setVisible(true);
    }
}
