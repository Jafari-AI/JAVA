package gui;
import java.awt.*;  
import java.awt.event.*;
import java.util.Random;  
public class Magic_Eight_Ball_with_Gui extends Frame implements ActionListener{  
Label l1,l2;  
TextArea area;  
Button b;  
Magic_Eight_Ball_with_Gui(){  
    l1=new Label();  
    l1.setBounds(50,50,500,30);  
    l2=new Label();  
    l2.setBounds(160,50,100,30);  
    area=new TextArea();  
    area.setBounds(20,100,300,300);  
    b=new Button("ASK 8-BALL");  
    b.setBounds(100,400,100,30);  
    b.addActionListener(this);  
    add(l1);add(l2);add(area);add(b);  
    setSize(400,450);  
    setLayout(null);  
    setVisible(true);  
}  
public void actionPerformed(ActionEvent e){ 

	//TextArea area=new TextArea("Welcome to javatpoint");  

	Random r = new Random();
	int choice = 1 + r.nextInt(8);
	String response = "";
	
	if ( choice == 1 ) response = "It IS happening. ";
	else if ( choice == 2) response = "It is NOT happening. ";
	else if ( choice == 3) response = " Maybe? ";
	else if ( choice == 4) response = " Ask again later ";
	else if ( choice == 5) response = " YES! ";
	else if ( choice == 6) response = " NO! ";
	else if ( choice == 7) response = " Sleep on it. ";
	else if ( choice == 8) response = " I'm feeling lucky. ";
	
		
	else response = "8=Ball Error!";
		
	
	System.out.println("MAGIC 8-BALL SAYS: " + response + " random # is: " + choice);

    String text=area.getText();  
    String words[]=text.split("\\s");   
    l1.setText("Answer: "+ response);

}  
public static void main(String[] args) {  
    new Magic_Eight_Ball_with_Gui();  
}  
}  
