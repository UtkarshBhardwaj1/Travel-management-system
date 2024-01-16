package travel.management.system;
import javax.swing.*;
import java.awt.*;
public  class Splash extends JFrame implements Runnable{
    Thread thread;
    Splash(){
        //making frame
        //setSize(1100,700);
        setVisible(true);
//        setLocation(70,30);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2=i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        thread=new Thread(this);
        thread.start();
        
    }
    public void run(){
        try{
            Thread.sleep(10000);
            setVisible(false);
            
        }catch(Exception e){
            
        }
    }
    public static void main (String []args){
       Splash frame= new Splash();
       int x=1; 
       for (int i=1;i<=500;x+=7,i+=3){
            frame.setLocation(625-(x+1)/2, 350-(i/2));
            frame.setSize(x,i);
            
        }
    }
}
