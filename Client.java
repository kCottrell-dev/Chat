
package server;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Client extends JFrame {
 
 private JTextArea area1 = new JTextArea();
 private JTextArea area2 = new JTextArea();
 
 public Client() {
  setLayout(new GridLayout(2, 1, 5, 5));
  area1.setWrapStyleWord(true);
  area1.setWrapStyleWord(true);
     area2.setLineWrap(true);     
     area2.setLineWrap(true);
     area2.setEditable(false);
     JScrollPane SP1 = new JScrollPane(area1);
     JScrollPane SP2 = new JScrollPane(area2);
     SP1.setBorder(new TitledBorder("Server"));
     SP2.setBorder(new TitledBorder("Client"));
     add(SP1);
     add(SP2);
  setTitle("Client");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(500, 500);
  setLocationRelativeTo(null);
  setVisible(true);
  
  area2.addKeyListener(new KeyAdapter() {
   @Override
   public void keyPressed(KeyEvent e) {
          if(e.getSource() == area2)
       {
           System.out.println(area2.getText());
       }
       
   }
  });
  
  try {
   Socket socket = new Socket("localhost", 8000); 
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
 


 public static void main(String[] args) {
  new Client();
 }
}