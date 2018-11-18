import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class TestJTextFieldex2 extends JFrame
{

    JTextField jta1 = new JTextField(15);
    JTextField jta2 = new JTextField(15);
    JButton button = new JButton("Add them up!");
    Font fnt = new Font("Times New Roman", Font.BOLD, 18);

    TestJTextFieldex2()
    {
        super("Test2");
        setLayout(new FlowLayout());
        setSize(300, 300);
        add(new JLabel("1st number:"));
        add(jta1);
        add(new JLabel("2nd number:"));
        add(jta2);
        add(button);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());

                    JOptionPane.showMessageDialog(null, "Result = "+(x1+x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Error in numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new TestJTextFieldex2();
    }
}
