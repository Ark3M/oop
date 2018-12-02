import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex3 extends JFrame
{
   public static void GUI()
   {
       JFrame frame = new JFrame("Ex. 3");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(new BorderLayout());

       JTextArea textArea = new JTextArea();
       textArea.setSize(new Dimension(200, 100));
       frame.add(textArea, BorderLayout.CENTER);

       JMenuBar menuBar = new JMenuBar();


       JMenu colorsMenu = new JMenu("Colors");

       JMenuItem blueItem = new JMenuItem("Blue");
       colorsMenu.add(blueItem);

       blueItem.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               textArea.setForeground(Color.BLUE);
           }
       });

       JMenuItem redItem = new JMenuItem("Red");
       colorsMenu.add(redItem);

       redItem.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               textArea.setForeground(Color.RED);
           }
       });

       JMenuItem blackItem = new JMenuItem("Black");
       colorsMenu.add(blackItem);

       blackItem.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               textArea.setForeground(Color.BLACK);
           }
       });


       JMenu fontsMenu = new JMenu("Fonts");

       JMenuItem tnrItem = new JMenuItem("Times New Roman");
       fontsMenu.add(tnrItem);

       tnrItem.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               Font f1 = new Font("Times New Roman", Font.BOLD, 14);
               textArea.setFont(f1);
           }
       });

       JMenuItem mssItem = new JMenuItem("MS Sans Serif");
       fontsMenu.add(mssItem);

       mssItem.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent ea)
           {
               Font f2 = new Font("MS Sans Serif", Font.BOLD, 14);
               textArea.setFont(f2);
           }
       });

       JMenuItem cnItem = new JMenuItem("Courier New");
       fontsMenu.add(cnItem);

       cnItem.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent eb)
           {
               Font f3 = new Font("Courier New", Font.BOLD, 14);
               textArea.setFont(f3);
           }
       });


       menuBar.add(colorsMenu);
       menuBar.add(fontsMenu);
       frame.setJMenuBar(menuBar);
       frame.setLocationRelativeTo(null);
       frame.setPreferredSize(new Dimension(500, 500));
       frame.pack();
       frame.setVisible(true);
   }

    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                JFrame.setDefaultLookAndFeelDecorated(true);
                GUI();
            }
        });
    }
}
