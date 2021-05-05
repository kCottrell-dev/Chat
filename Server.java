

package server;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Server extends JFrame {
 
 private static final long serialVersionUID = 1L;
 private JTextArea area1 = new JTextArea();
 private JTextArea area2 = new JTextArea();
 
 public Server() {
  setLayout(new GridLayout(2, 1, 5, 5));
  area1.setWrapStyleWord(true);
  area1.setWrapStyleWord(true);
     area2.setLineWrap(true);     
     area2.setLineWrap(true);
     area2.setEditable(false);
     JScrollPane SP1 = new JScrollPane(area1);
     JScrollPane SP2 = new JScrollPane(area2);
     SP1.setBorder(new TitledBorder("Client"));
     SP2.setBorder(new TitledBorder("Server"));
     add(SP1);
     add(SP2);
  setTitle("Server");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(500, 500);
  setLocationRelativeTo(null);
  setVisible(true);
  
  area1.addKeyListener(new KeyAdapter() {
   @Override
   public void keyPressed(KeyEvent e) {
         if(e.getKeyCode() == KeyEvent.VK_ENTER) {
             
             System.out.println(area1.getText());
         }
          
   }
  });
  
  try {
   @SuppressWarnings("resource")
   ServerSocket serverSocket = new ServerSocket(8000);
   Socket socket = serverSocket.accept();
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
 


 public static void main(String[] args) {
  new Server();
 }
}

