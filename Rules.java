
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name; // globally declared.
    JButton start,back;  // globally declared.
    
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);   //frame background color given by this loc.
        setLayout(null);
        
        
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30,144,254));
        add(heading);
                
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tohma", Font.PLAIN, 15));
        rules.setText(
                "<html>"+ 
                  "1. All questions are compulsory." + "<br><br>" +
                  "2. Participation in the quiz is free and open to all person above 18 years old." + "<br><br>" +
                  "3. There are a 10 questions in these quiz." + "<br><br>" +
                  "4. Each questions gives you 10 marks." + "<br><br>" +
                  "5. You only have 30 seconds to answer the question." + "<br><br>" +
                  "6. No cell phone or other secondary devices is allowed in the room or test area." + "<br><br>" +
                  "7. No one can be in the room with you in test time." + "<br><br>" +
                  "8. All the very best, Good Luck!!" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        
        setSize(800,650);
        setLocation(300,50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        new Rules("User");
    }
}
