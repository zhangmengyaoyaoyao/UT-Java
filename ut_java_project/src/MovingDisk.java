//Name: Mnengyao Zhang
//UT EID: mz22984
/*
I have followed the University Code of Conduct and Student Honor Code. This work was completed entirely by me and my groupmates. I have not used any unauthorized internet help, nor am I aware of any other person violating this code.
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MovingDisk extends JPanel
  implements ActionListener//6:extands->extends
{
  private int time;

  public MovingDisk()
  {
    time = 0;//1:semicolon
    Timer clock = new Timer(30, this); 
    clock.start();//2:operators ()
  }

  public void paintComponent(Graphics g)
  {
    int x = 150 - (int)(100 * Math.cos(0.005 * Math.PI * time));
    double value = Math.sin(0.005 * Math.PI * time); //3:unmatched()
    int y = (int) (130 - (int)75 * value);//7:cast-need int but double provided
    int r = 20;

    Color sky;
    if (y > 130) sky = Color.BLACK;//8:semicolon
    else sky = Color.CYAN;
    setBackground(sky);
    super.paintComponent(g);

    g.setColor(Color.ORANGE);
    g.fillOval(x - r, y - r, 2*r, 2*r); 
  }

  public void actionPerformed(ActionEvent e)
  {
    time++;
    repaint();
  }

  public static void main(String[] args)//9:[] represents a list
  {
    JFrame w = new JFrame("Moving Disk");//4:semicolon
    w.setSize(300, 150);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new MovingDisk());//5:capital
    w.setResizable(false);
    w.setVisible(true);
  }
}
