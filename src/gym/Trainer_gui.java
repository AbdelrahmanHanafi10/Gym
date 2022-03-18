
package gym;
import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

public class Trainer_gui extends JFrame implements ActionListener {
    
    JButton b1_add,b2_edit,b3_delete,back;
    JPanel p;
    JLabel l1_id,l2_username,l3_salary,l4_contact;
    JButton resetButton;
    Color lightbutton = new Color(71,92,150);
    JTextField t1_id,t2_username,t3_salary,t4_contact;
    
    // constructor
      Trainer_gui(){
      // style frame
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setResizable(false);
      this.setLocation(350,40 );
    
      // add panel
      p=new JPanel();
      add(p);
     
      // style of panel
      p.setBackground(Color.white);
      p.setLayout(null);
     
      // add image ....
      JLabel lbl = new JLabel();
      ImageIcon img = new ImageIcon("gym2.jpg");
      lbl.setIcon(img);
      lbl.setBounds(200,2,800,250);
      p.add(lbl);
     
      //initialise label
      l1_id= new JLabel("Enter id  :");
      l1_id.setBounds(80,215,125,30);
      l1_id.setFont(new Font("Arial",Font.PLAIN,15));
      l1_id.setForeground(Color.black);
      //add_label......
      p.add(l1_id);

      //initialise text field
      t1_id=new JTextField();
      t1_id.setBounds(80,245,125,30);
      //add_text field......
      p.add(t1_id);
       
      //initialise label
      l2_username= new JLabel("Enter username  :");
      l2_username.setBounds(80,285,125,25);
      l2_username.setFont(new Font("Arial",Font.PLAIN,15));
      l2_username.setForeground(Color.black);
      //add_label......
      p.add(l2_username);//pass
      
      //initialise text field
      t2_username=new JTextField();
      t2_username.setBounds(80,315,125,30);
      //add_text field......
      p.add(t2_username);
      
      //initialise label
      l3_salary= new JLabel("salary  :");
      l3_salary.setBounds(300,215,125,30);
      l3_salary.setFont(new Font("Arial",Font.PLAIN,15));
      l3_salary.setForeground(Color.black);
      //add_label......
      p.add(l3_salary);//pass
      
      //initialise text field
      t3_salary=new JTextField();
      t3_salary.setBounds(300,245,125,30);
      //add_text field......
      p.add(t3_salary);
      
      //initialise label
      l4_contact= new JLabel("contact :");
      l4_contact.setBounds(300,285,125,25);
      l4_contact.setFont(new Font("Arial",Font.PLAIN,15));
      l4_contact.setForeground(Color.black);
      //add_label......
      p.add(l4_contact);//pass
      
      //initialise text field
      t4_contact=new JTextField();
      t4_contact.setBounds(300,315,125,30);
      //add_text field......
      p.add(t4_contact);
         
      //initialise button
      b1_add= new JButton("add");
     b1_add.setBounds(100,440,120,30);
     
     // style of button
     b1_add.setFont(new Font("Arial",Font.PLAIN,15));
     b1_add.setBackground(lightbutton);
     b1_add.setForeground(Color.black);
     
     //add event 
     b1_add.addActionListener(this);
     
     //add button 
     p.add(b1_add);
          
     //initialise button
     resetButton = new JButton("RESET");
     resetButton.setBounds(240,500,120,30);
      
      // style of button
     resetButton.setFont(new Font("Arial",Font.PLAIN,15));
     resetButton.setBackground(lightbutton);
     resetButton.setForeground(Color.black);
     
     //add event 
     resetButton.addActionListener(this);
     
     //add button 
     p.add(resetButton);
     
     //initialise button
     b3_delete = new JButton("Delete");
     b3_delete.setBounds(380,440,120,30);
      
      // style of button
     b3_delete.setFont(new Font("Arial",Font.PLAIN,15));
     b3_delete.setBackground(lightbutton);
     b3_delete.setForeground(Color.black);
     
     //add event 
     b3_delete.addActionListener(this);
     
     //add button 
     p.add(b3_delete);
     
     //initialise button
      b2_edit= new JButton("edit"); 
     b2_edit.setBounds(241,440,120,30);
     
      // style of button
     b2_edit.setFont(new Font("Arial",Font.PLAIN,15));
     b2_edit.setBackground(lightbutton);
     b2_edit.setForeground(Color.black);
     
     //add event 
     b2_edit.addActionListener(this);
     
     //add button 
     p.add(b2_edit);
     
     //initialise button
      back=new JButton("Back");
         back.setBounds(50, 50, 80, 30);
     
      // style of button
     back.setFont(new Font("Arial",Font.PLAIN,15));
     back.setBackground(lightbutton);
     back.setForeground(Color.black);
     
     //add event 
     back.addActionListener(this);
     
     //add button 
     p.add(back);
      setTitle("add-edit-delete page"); //Title
      setSize(600,650); //size_frame
      setVisible(true);
      }
    @Override
    public void actionPerformed(ActionEvent ae) {
         //Coding Part of RESET button
        if (ae.getSource() == resetButton) {
            t1_id.setText("");
            t2_username.setText("");
            t3_salary.setText("");
            t4_contact.setText("");
        }
        if(ae.getSource()==b1_add){
            Trainer ty = new Trainer();
            
            ty.add(t1_id, t2_username, t3_salary, t4_contact);
            this.hide();
        }
         if(ae.getSource()==b2_edit){
            Trainer ty = new Trainer();
       
            ty.edit(t1_id, t2_username, t3_salary,t4_contact );
            this.hide();
        }
         if(ae.getSource()==b3_delete){
            Trainer ty = new Trainer();
           
            ty.delete(t1_id, t2_username, t3_salary,t4_contact );
            this.hide();
        }
        
        if(ae.getSource()==back){
            Admin ad2=new Admin();
                        this.hide();

        }
    }

    
    
}
