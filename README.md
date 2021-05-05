# Chat

Write a program that enables two users to chat. Implement one user
as the server (Figure 31.21a) and the other as the client (Figure 31.21b). The
server has two text areas: one for entering text and the other (noneditable) for
displaying text received from the client. When the user presses the Enter key,
the current line is sent to the client. The client has two text areas: one (noneditable) for displaying text from the server and the other for entering text. When
the user presses the Enter key, the current line is sent to the server.

## Example Output

![Sample Output](README.jpg)

## Analysis Steps

Well I analyzed the requirements of the program by looking at the pearson text web files, I first looked at the program
description was to create a client side and a servide chat box, on each side of a Interface so that one side, either
the client or the server can type text and when you press enter the text is sent to the other chat box, making it so either
the client or server receive a message.

### Design

Used One class to define everything including the server and client sides
```
 public Server() {
  setLayout(new GridLayout(2, 1, 5, 5));
     JScrollPane SP1 = new JScrollPane(area1);
     JScrollPane SP2 = new JScrollPane(area2);
     SP1.setBorder(new TitledBorder("Client"));
     SP2.setBorder(new TitledBorder("Server"));
     add(SP1);
     add(SP2);
  setTitle("Server");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(500, 500);
  setVisible(true);
  
```

### Testing


Step 1: Define Text Areas

```
private JTextArea area1 = new JTextArea();
 private JTextArea area2 = new JTextArea();
```

Step 2: Create Interface 

```
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
  
```

Step 3: Create KeyEvent and create Socket

```
 aarea1.addKeyListener(new KeyAdapter() {
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
 
```
Step 4: Run the Server/Client
```
 public static void main(String[] args) {
  new Server();
 }
}
```

```
Incomplete
```

You can use this data to get an idea of how to make a chat log between a server and client.

## Notes

Wasn't able to complete this program of all it's requirements. Instructions simply run the program to test it out by entering text and pressing enter which will display in the console.

## Do not change content below this line
## Adapted from a README Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc
