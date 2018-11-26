import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ex2
{

    public static void ex2()
    {
        JFrame frame = new JFrame("Ex.2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());

        JButton northButton = new JButton("NORTH");
        p1.add(northButton, BorderLayout.NORTH);

        JButton southButton = new JButton("SOUTH");
        p1.add(southButton, BorderLayout.SOUTH);

        JButton eastButton = new JButton("EAST");
        p1.add(eastButton, BorderLayout.EAST);

        JButton westButton = new JButton("WEST");
        p1.add(westButton, BorderLayout.WEST);

        JButton centerButton = new JButton("CENTER");
        p1.add(centerButton, BorderLayout.CENTER);


        centerButton.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent event1)
            {
                JOptionPane.showMessageDialog(null, "(Добро пожаловать в )", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        westButton.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent event2)
            {
                JOptionPane.showMessageDialog(null, "(Добро пожаловать в Джидда)", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        southButton.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent event3)
            {
                JOptionPane.showMessageDialog(null, "(Добро пожаловать Абха)", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        northButton.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent event4)
            {
                JOptionPane.showMessageDialog(null, "(Добро пожаловать в)", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        eastButton.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent event5)
            {
                JOptionPane.showMessageDialog(null, "(Добро пожаловать в Дахране)", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.getContentPane().add(p1);
        frame.setPreferredSize(new Dimension(500, 500));

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                ex2();
            }
        });
    }
}
