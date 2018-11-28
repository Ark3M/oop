import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class football extends JFrame
{
    private static int count1;
    private static int count2;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Football clubs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton b1 = new JButton("AC Milan");
        JButton b2 = new JButton("Real Madrid");

        Container c;
        c = frame.getContentPane();
        c.setLayout(new GridLayout(5, 1));

        count1 = 0;
        count2 = 0;

        String scorer = null;
        String winner = null;

        JLabel l1 = new JLabel("Result: " + count1 + "X" + count2);
        JLabel l2 = new JLabel("Last Scorer: " + scorer);
        JLabel l3 = new JLabel("Winner: " + winner);

        c.add(b1);
        c.add(b2);
        c.add(l1);
        c.add(l2);
        c.add(l3);

        b1.setActionCommand("Milan");

        b2.setActionCommand("Madrid");

        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(e.getActionCommand().equals("Milan"))
                {
                    l1.setText("Result: " + ++count1 + "X" + count2);
                    String scorer = "AC Milan";
                    l2.setText("Last Scorer: " + scorer);

                    if(count1 > count2)
                    {
                        String winner = "AC Milan";
                        l3.setText("Winner: " + winner);
                    }
                }
            }
        });

        b2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(e.getActionCommand().equals("Madrid"))
                {
                    l1.setText("Result: " + count1 + "X" + ++count2);
                    String scorer = "Real Madrid";
                    l2.setText("Last Scorer: " + scorer);

                    if(count2 > count1)
                    {
                        String winner = "Real Madrid";
                        l3.setText("Winner: " + winner);
                    }
                }
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
