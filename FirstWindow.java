/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

/**
 *
 * @author clayton.sideleau470
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;


public class FirstWindow extends JFrame
{
    public static final int WIDTH = 400; 
    public static final int HEIGHT = 400;

    public FirstWindow( )
    {
        super();
        setSize(WIDTH, HEIGHT);

        setTitle("First Swing Window Created");

        setDefaultCloseOperation(
                              JFrame.DO_NOTHING_ON_CLOSE);

        getContentPane().setBackground(Color.magenta);
        
        JButton endButton = new JButton("Click to end program.");
        endButton.addActionListener(new EndingListener( ));
        endButton.setBackground(Color.orange);
        add(endButton);
    }
}

