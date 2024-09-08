package hotel.management.system;
import javax.swing.*;
import java.net.URL;
import java.awt.*;
import java.awt.event.*;



public class HotelManagementSystem extends JFrame implements ActionListener{
     public void actionPerformed(ActionEvent e){
         setVisible(false);
         new Login();
         
     }
            
    HotelManagementSystem(){
        setBounds(100,100,1366,565);
        setLayout(null);
        URL imageUrl = ClassLoader.getSystemResource("icons/first.jpg");
        if(imageUrl!=null){
            ImageIcon Ic = new ImageIcon(imageUrl);
           JLabel image = new JLabel(Ic);
           image.setBounds(0,0,1366,565);
           add(image);//required for adding component to frame
           JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
           text.setBounds(20,430,1000,90);
           text.setFont(new Font("serif",Font.PLAIN,50));
           text.setForeground(Color.WHITE);
           image.add(text);
           
           JButton next = new JButton("Next");
           next.setBounds(1150,450,150,50);
           image.add(next);
           next.setBackground(Color.WHITE);
           next.addActionListener(this);
           
           

           
           setVisible(true);
        }
        else{
            System.out.println("Image not found");
        }

        
        
    }

    public static void main(String[] args) {
        new HotelManagementSystem();
    }
    
}
