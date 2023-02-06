import javax.swing.*;
import java.awt.event.*;

class cal implements ActionListener {
    JFrame f;
    JTextField t;
    JButton b1, b2, b3, bsub, badd, beq;

    static double a = 0, b = 0, result = 0;
    static int operator = 0;

    cal() {
        f = new JFrame("Calculator");
        t = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");

        bsub = new JButton("-");
        badd = new JButton("+");
        beq = new JButton("=");
        t.setBounds(30, 40, 280, 30);
        b1.setBounds(40, 240, 50, 40);
        b2.setBounds(110, 240, 50, 40);
        b3.setBounds(180, 240, 50, 40);
        bsub.setBounds(250, 240, 50, 40);
        beq.setBounds(180, 310, 50, 40);
        badd.setBounds(250, 310, 50, 40);
        f.add(t);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(beq);
        f.add(badd);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        beq.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1)
            t.setText(t.getText().concat("1"));
        if (e.getSource() == b2)
            t.setText(t.getText().concat("2"));
        if (e.getSource() == b3)
            t.setText(t.getText().concat("3"));

        if (e.getSource() == badd) {
            a = Double.parseDouble(t.getText());
            operator = 1;
            t.setText("");
        }
        if (e.getSource() == bsub) {
            a = Double.parseDouble(t.getText());
            operator = 2;
            t.setText("");
        }
        if (e.getSource() == beq) {
            b = Double.parseDouble(t.getText());
            switch (operator) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                default:
                    result = 0;
            }
            t.setText("" + result);
        }
    }

    public static void main(String... s) {
        new cal();
    }
}