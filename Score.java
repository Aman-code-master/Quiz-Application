
package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String name, int score){
        setBounds(400,130,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i.getImage().getScaledInstance(300,250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
        JLabel heading = new JLabel("Thank You " + name + " for playing Simple Minds");
        heading.setBounds(45,30,700, 30);
        heading.setFont(new Font("Tohma", Font.PLAIN, 25));
        add(heading);
        
        JLabel lblscore=new JLabel("Your Score is " + score);
        lblscore.setBounds(400,200,300,30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(lblscore);
        
        
        JButton submit=new JButton("Play Again");
        submit.setBounds(400,260,150,30);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args){
        new Score("User", 0);
    }
}
