import javax.swing.*;
import java.awt.*;

class BorderLayoutDemo extends JFrame {
    private Container c;
    private JButton btn1 , btn2 , btn3 , btn4 ,btn5;
    private BorderLayout bLayout;
    BorderLayoutDemo(){
        initComponent();
    }
    private void initComponent(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100,100,700,500);
        this.setTitle("Border Layout Demo");

        c = this.getContentPane();
        bLayout = new BorderLayout(5,5);
        c.setLayout(bLayout);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");

        c.add(btn1,BorderLayout.NORTH);
        c.add(btn2,BorderLayout.CENTER);
        c.add(btn3,BorderLayout.SOUTH);
        c.add(btn4,BorderLayout.EAST);
        c.add(btn5,BorderLayout.WEST);

    }
    public static void main(String[] args) {
        BorderLayoutDemo frame = new BorderLayoutDemo();
        frame.setVisible(true);
    }
}
