import java.awt.*;
        import javax.swing.*;
        import java.awt.event.*;
        import java.sql.*;
        import javax.swing.border.*;
        import com.toedter.calendar.JDateChooser;

         public class ReturnBook extends JFrame implements ActionListener{
             
             private JPanel contentpane;
             private JTextField textField;
             private JTextField textField_1;
             private JTextField textField_2;
             private JTextField textField_3;
             private JTextField textField_4;
             private JTextField textField_5;
             private JTextField textField_6;
             private JButton b1,b2,b3;
             private JDateChooser dateChooser;
             
              public static void main(String[]args){
                    new ReturnBook().setVisible(true);
              }
              
              public void delete(){
               try{
                    conn con = new conn();
                     String sql = "delete  from issueBook where book_id = ?";
                  PreparedStatement st = con.c.prepareStatement(sql);
                  st.setString(1,textField.getText());
                   int i =st.executeUpdate();
                   if (i>0)
                      JOptionPane.showMessageDialog(null, "Book Returned");
                   else
                       JOptionPane.showMessageDialog(null, "error in deleting");
               }   catch(SQLException e){
                   JOptionPane.showMessageDialog(null,e);
                   e.printStackTrace();
               }
              }
              
              public ReturnBook(){
                  setBounds(450,300,617,363);
                  contentpane = new JPanel();
                  contentpane.setBorder(new EmptyBorder(5,5,5,5));
                  setContentPane(contentpane);
                  contentpane.setBackground(Color.WHITE);
                  contentpane.setLayout(null);
                
                  
                    JLabel lblNewLabel = new JLabel("Book_id");
                    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD,14));
                    lblNewLabel.setForeground(new Color (0,0,0));
                    lblNewLabel.setBounds(52,52,87,24);
                    contentpane.add(lblNewLabel);     
                  
                    JLabel lblStudentid = new JLabel("Student_id");
                    lblStudentid.setFont(new Font("Tahoma", Font.BOLD,14));
                    lblStudentid.setForeground( Color.BLACK);
                    lblStudentid.setBounds(243,52,87,24);
                    contentpane.add(lblStudentid);
                    
                    JLabel lblBook = new JLabel("Book");
                    lblBook.setFont(new Font("Tahoma", Font.BOLD,14));
                    lblBook.setForeground( Color.BLACK);
                    lblBook.setBounds(52,98,71,24);
                    contentpane.add(lblBook);
                    
                    JLabel lblName = new JLabel("Name");
                    lblName.setFont(new Font("Tahoma", Font.BOLD,14));
                    lblName.setForeground( Color.BLACK);
                    lblName.setBounds(300,98,71,24);
                    contentpane.add(lblName);
                    
                    JLabel lblCourse = new JLabel("Course");
                    lblCourse.setFont(new Font("Tahoma", Font.BOLD,14));
                    lblCourse.setForeground( Color.BLACK);
                    lblCourse.setBounds(52,143,87,24);
                    contentpane.add(lblCourse);
                    
                    JLabel lblBranch = new JLabel("Branch");
                    lblBranch.setFont(new Font("Tahoma", Font.BOLD,14));
                    lblBranch.setForeground( Color.BLACK);
                    lblBranch.setBounds(303,144,68,24);
                    contentpane.add(lblBranch);
                    
                    JLabel lblDateofIssue = new JLabel("Date of Issue");
                    lblDateofIssue.setFont(new Font("Tahoma", Font.BOLD,14));
                    lblDateofIssue.setForeground( Color.BLACK);
                    lblDateofIssue.setBounds(52,188,105,29);
                    contentpane.add(lblDateofIssue);
                    
                    JLabel lblDateofReturn = new JLabel("Date of Return ");
                    lblDateofReturn .setFont(new Font("Tahoma", Font.BOLD,14));
                    lblDateofReturn .setForeground( Color.BLACK);
                    lblDateofReturn .setBounds(52,234,118,29);
                    contentpane.add(lblDateofReturn );
                    
                    textField = new JTextField();
                    textField.setForeground(new Color (105,105,105));
                    textField.setFont(new Font("Trebuchet MS", Font.BOLD,14));
                    textField.setBounds(128,56,105,20);
                    contentpane.add(textField);
                    textField.setColumns(10);
                    
                    textField_1 = new JTextField();
                    textField_1.setForeground(new Color (105,105,105));
                    textField_1.setFont(new Font("Trebuchet MS", Font.BOLD,14));
                    textField_1.setBounds(340,56,93,20);
                    contentpane.add(textField_1);
                    textField_1.setColumns(10);
                    
                 b1 = new JButton("Search");
                 b1.addActionListener(this);
                 b1.setForeground(Color.WHITE);
                 b1.setBackground(Color.BLACK);
                 b1.setBounds(443,52,105,29);
                 contentpane.add(b1);
                 
                    textField_2= new JTextField();
                    textField_2.setEditable(false);
                    textField_2.setForeground(new Color (0,100,0));
                    textField_2.setFont(new Font("Trebuchet MS", Font.BOLD,13));
                    textField_2.setBounds(128,102,162,20);
                    contentpane.add(textField_2);
                    textField_2.setColumns(10);

                    textField_3= new JTextField();
                    textField_3.setEditable(false);
                    textField_3.setForeground(new Color (0,100,0));
                    textField_3.setFont(new Font("Trebuchet MS", Font.BOLD,13));
                    textField_3.setBounds(369,102,179,20);
                    contentpane.add(textField_3);
                    textField_3.setColumns(10);
                    
                    
                    textField_4 = new JTextField();
                    textField_4.setEditable(false);
                    textField_4.setForeground(new Color (0,100,0));
                    textField_4.setFont(new Font("Trebuchet MS", Font.BOLD,13));
                    textField_4.setBounds(128,147,162,20);
                    contentpane.add(textField_4);
                    textField_4.setColumns(10);
                    
                    textField_5= new JTextField();
                    textField_5.setEditable(false);
                    textField_5.setForeground(new Color (0,100,0));
                    textField_5.setFont(new Font("Trebuchet MS", Font.BOLD,13));
                    textField_5.setBounds(369,147,179,20);
                    contentpane.add(textField_5);
                    textField_5.setColumns(10);
                    
                    textField_6= new JTextField();
                    textField_6.setEditable(false);
                    textField_6.setForeground(new Color (0,100,0));
                    textField_6.setFont(new Font("Trebuchet MS", Font.BOLD,13));
                    textField_6.setBounds(167,194,162,20);
                    contentpane.add(textField_6);
                    textField_6.setColumns(10);
                    
                dateChooser = new JDateChooser();
                dateChooser.setBorder(new LineBorder(new Color(0,0,0) 0, true));
                dateChooser.setBounds(167,234,172,29);
                contentpane.add(dateChooser);
                
                
                 b2 = new JButton("Return");
                 b2.addActionListener(this);
                 b2.setBorder(new LineBorder(new Color(0,0,0),0,true));
                 b2.setFont(new Font("Trebuchet MS", Font.BOLD,15));
                 b2.setForeground(Color.WHITE);
                 b2.setBackground(Color.BLACK);
                 b2.setBounds(369,179,149,30);
                 contentpane.add(b2);
                 
                 b3 = new JButton("Back");
                 b3.addActionListener(this);
                 b3.setBorder(new LineBorder(new Color(0,0,0),0,true));
                 b3.setFont(new Font("Trebuchet MS", Font.BOLD,15));
                 b3.setForeground(Color.WHITE);
                 b3.setBackground(Color.BLACK);
                 b3.setBounds(369,231,149,30);
                 contentpane.add(b3);
                 
                 JPanel panel = new JPanel();
                           panel.setBorder(new TitledBorder(new LineBorder(new Color(255,69,0),2, true),"Return-Panel",
                           TitledBorder.LEADING, TitledBorder.TOP, null, new Color (220,20,60)));
                           panel.setBounds(10,24,569,269);
                           contentpane.add(panel);
                           panel.setBackground(Color.WHITE);
              }
              
              public void actionPerformed(ActionEvent ae){
          try{
              conn con = new conn();
              
              if(ae.getSource()==b1){
                  String sql = "select * from issuebook where student_id = ? and book_id =?";
                  PreparedStatement st = con.c.prepareStatement(sql);
                  st.setString(1, textField_1.getText());
                   st.setString(2, textField.getText());
                  ResultSet rs = st.executeQuery();
                  
                  while (rs.next()){
                               textField_2.setText(rs.getString("bname"));
                               textField_3.setText(rs.getString("sname"));
                               textField_4.setText(rs.getString("course"));
                               textField_5.setText(rs.getString("branch"));
                               textField_6.setText(rs.getString("dateOfIssue"));                     
                               
                  }
                     
                    st.close();
                    rs.close();
              }
              if(ae.getSource()==b2){
                  String sql = "insert into returnBook(book_id, student_id, bname, sname, course, branch, dateOfIssue) values(?,?,?,?,?,?,?)";
                  PreparedStatement st = con.c.prepareStatement(sql);
                  st.setString(1, textField.getText());
                  st.setString(2, textField_1.getText());
                  st.setString(3, textField_2.getText());
                  st.setString(4, textField_3.getText());
                  st.setString(5,textField_4.getText());
                  st.setString(6,textField_5.getText());
                  st.setString(7,textField_6.getText());
                  st.setString(8,((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
                  int i =st.executeUpdate();
                  
                 if (i>0){
                      JOptionPane.showMessageDialog(null, "Processing..");
                 delete();
              }else
                     JOptionPane.showMessageDialog(null,"error");
              }
              if(ae.getSource()==b3){
                     this.setVisible(false);
                     new Home().setVisible(true);
                     }
                   
             }catch(Exception e){
                     
        }
        }
        }