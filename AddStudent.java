 import java.awt.*;
        import javax.swing.*;
        import java.awt.event.*;
        import java.sql.*;
        import javax.swing.border.*;
        import java.util.*;





public class AddStudent extends JFrame implements ActionListener {
    
              private JPanel contentpane;
              private JButton b1,b2;
              private JTextField t1,t2,t3;
              private JComboBox comboBox,comboBox_1,comboBox_2,comboBox_3;
    
    
               public static void main(String[]args){
                    new AddStudent().setVisible(true);
    
               }   
              public void random(){
                  Random rd = new Random();
                  t1.setText(""+ rd.nextInt(10000+1));
              }
    
                  public AddStudent(){
                  super("Add Student");
                  setBounds(700,200,550,450);
                  contentpane = new JPanel();
                  contentpane.setBorder(new EmptyBorder(5,5,5,5));
                  setContentPane(contentpane);
                  contentpane.setLayout(null);
                  
                  
                 JLabel l1 = new JLabel("Student_id");
                 l1.setFont(new Font ("Tahoma", Font.BOLD,14));
                 l1.setForeground(new Color (25,25,112));
                 l1.setBounds(64,63,102,22);
                 contentpane.add(l1); 
                 
                 JLabel l2 = new JLabel("Name");
                 l2.setFont(new Font ("Tahoma", Font.BOLD,14));
                 l2.setForeground(new Color (25,25,112));
                 l2.setBounds(64,97,102,22);
                 contentpane.add(l2);
                 
                 JLabel l3 = new JLabel("Father's Name");
                 l3.setFont(new Font ("Tahoma", Font.BOLD,14));
                 l3.setForeground(new Color (25,25,112));
                 l3.setBounds(64,130,102,22);
                 contentpane.add(l3);
                 
                 JLabel l4 = new JLabel("Branch");
                 l4.setFont(new Font ("Tahoma", Font.BOLD,14));
                 l4.setForeground(new Color (25,25,112));
                 l4.setBounds(64,209,102,22);
                 contentpane.add(l4);
                 
                 JLabel l5 = new JLabel("Year");
                 l5.setFont(new Font ("Tahoma", Font.BOLD,14));
                 l5.setForeground(new Color (25,25,112));
                 l5.setBounds(64,242,102,22);
                 contentpane.add(l5);
                 
                 JLabel l6 = new JLabel("Semester");
                 l6.setFont(new Font ("Tahoma", Font.BOLD,14));
                 l6.setForeground(new Color (25,25,112));
                 l6.setBounds(64,275,102,22);
                 contentpane.add(l6);
                 
                 
                 t1 = new JTextField();
                 t1.setEditable(false);
                 t1.setFont(new Font("Trebuchet MS", Font.BOLD,14));
                 t1.setForeground(new Color(47,79,79));
                 t1.setBounds(174,66,156,20);
                 contentpane.add(t1);
                 t1.setColumns(10);               

                 t2 = new JTextField();
                 t2.setEditable(false);
                 t2.setFont(new Font("Trebuchet MS", Font.BOLD,14));
                 t2.setForeground(new Color(47,79,79));
                 t2.setBounds(174,100,156,20);
                 contentpane.add(t2);
                 t2.setColumns(10);
                 
                 
                 t3 = new JTextField();
                 t3.setEditable(false);
                 t3.setFont(new Font("Trebuchet MS", Font.BOLD,14));
                 t3.setForeground(new Color(47,79,79));
                 t3.setBounds(174,133,156,20);
                 contentpane.add(t3);
                 t3.setColumns(10);
                 
                 comboBox = new JComboBox();
                 comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mech","CSE","IT","Civil","Automobile","EEE","Other"}));
                 comboBox.setForeground(new Color(47,79,79));
                 comboBox.setFont(new Font("Trebuchet MS", Font.BOLD,14));
                 comboBox.setBounds(176,211,154,20);
                 contentpane.add(comboBox);
                 
                 comboBox_1 = new JComboBox();
                 comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"First","Second","Third","Civil","Automobile","EEE","Other"}));
                 comboBox_1.setForeground(new Color(47,79,79));
                 comboBox_1.setFont(new Font("Trebuchet MS", Font.BOLD,14));
                 comboBox_1.setBounds(176,211,154,20);
                 contentpane.add(comboBox_1);
                 
                 
                 comboBox_2 = new JComboBox();
                 comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1st","2nd","3rd","4th","5th","6th","7th","8th"}));
                 comboBox_2.setForeground(new Color(47,79,79));
                 comboBox_2.setFont(new Font("Trebuchet MS", Font.BOLD,14));
                 comboBox_2.setBounds(176,277,154,20);
                 contentpane.add(comboBox_2);
                 
                  b1 = new JButton("Add");
                  b1.addActionListener(this);
                  b1.setFont(new Font("Trebuchet MS", Font.BOLD,15));
                  b1.setForeground(Color.WHITE);
                  b1.setBackground(Color.BLACK);
                  b1.setBounds(64,321,111,33);
                  contentpane.add(b1);
            
                  b2 = new JButton("Back");
                  b2.addActionListener(this);
                  b2.setFont(new Font("Trebuchet MS", Font.BOLD,15));
                  b2.setForeground(Color.WHITE);
                  b2.setBackground(Color.BLACK);
                  b2.setBounds(198,321,111,33);
                  contentpane.add(b2);
                 
                 JLabel l7 = new JLabel("Course");
                 l7.setFont(new Font ("Tahoma", Font.BOLD,14));
                 l7.setForeground(new Color (25,25,112));
                 l7.setBounds(64,173,102,22);
                 contentpane.add(l7);
                 
                 comboBox_3 = new JComboBox();
                 comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"B.E","B.Tech","M.Tech","MBA","BBA","BCA","B.Sc","M.sc","B.Com","M.com"}));
                 comboBox_3.setForeground(new Color(47,79,79));
                 comboBox_3.setFont(new Font("Trebuchet MS", Font.BOLD,14));
                 comboBox_3.setBounds(176,176,154,20);
                 contentpane.add(comboBox_3);
                 
                 JPanel panel = new JPanel();
                 panel.setBorder(new TitledBorder(new LineBorder(new Color(102,205,170),2, true),"Add Students",
                 TitledBorder.LEADING, TitledBorder.TOP, null, new Color (30,144,255)));
                 panel.setBounds(10,38,358,348);
                 panel.setBackground(new Color(211,211,211));
                 contentpane.setBackground(Color.WHITE);
                 panel.setBackground(Color.WHITE);
                 contentpane.add(panel);
                 random();
                 }
                  
               public void actionPerformed(ActionEvent ae){   
             try{
                
                 if(ae.getSource()==b1){
                     try{
                          conn con = new conn();
                     String sql = "insert into student(student_id, name, father, coourse, branch, year, semester) values(?,?,?,?,?,?,?)";
                     PreparedStatement st = con.c.prepareStatement(sql);
                     
                     st.setString(1, t1.getText());
                     st.setString(2, t2.getText());
                     st.setString(3, t3.getText());
                     st.setString(4,(String)comboBox_3.getSelectedItem()) ;
                     st.setString(5, (String)comboBox.getSelectedItem());
                     st.setString(6,(String)comboBox_1.getSelectedItem());
                     st.setString(7,(String)comboBox_2.getSelectedItem());
                     
                     int i =st.executeUpdate();
                     if(i>0){
                         JOptionPane.showMessageDialog(null,"Successfully Added");
                         this.setVisible(false);
                         new Home().setVisible(true);
                     }
                     else
                         JOptionPane.showMessageDialog(null,"Error");
                 }catch(Exception e){
                         e.printStackTrace();
                         }
             }
              if(ae.getSource()==b2){
                      this.setVisible(false);
                      new Home().setVisible(true);
              }
              }catch(Exception e){
             }
}
}  
              