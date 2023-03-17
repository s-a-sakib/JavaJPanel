import javax.swing.*;
import java.awt.*;

class FlowLayoutDemo extends JFrame {

    private Container c;
    private JButton[] btn = new JButton[9];
    private FlowLayout flowLayout;
    FlowLayoutDemo(){
        initComponent();
    }
    private void initComponent() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100, 100, 700, 500);
        this.setTitle("Flow Layout Demo");

        c = this.getContentPane();
        flowLayout = new FlowLayout(1,5,5);
        c.setLayout(flowLayout);

        for(int i = 0 ; i < 9 ; i++){
            btn[i] = new JButton("" + (i + 1));
            c.add(btn[i]);
        }

    }
    public static void main(String[] args) {
        FlowLayoutDemo flowLayoutDemo = new FlowLayoutDemo();
        flowLayoutDemo.setVisible(true);
    }
}
