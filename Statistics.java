import java.awt.*;
        import javax.swing.*;
        import java.awt.event.*;
        import java.sql.*;
        import javax.swing.border.*;
        import net.proteanit.sql.DbUtils;





public class Statistics extends JFrame {
    
    private JPanel contentpane;
    private JTable table;
    private JTable table_1;
    
    public static void main(String[]args){
                    new Statistics ().setVisible(true);
              }
     public void issueBook(){
          try{
              conn con = new conn();
              String sql = "select * from issueBook";
              PreparedStatement st = con.c.prepareStatement(sql);
              ResultSet rs = st.executeQuery();
              
              table.setModel(DbUtils.resultSetToTableModel(rs));
          }
          catch (Exception e){
              
          }
     }
     public void ReturnBook(){
         try{
             conn con = new conn();
             String sql = "select * from returnBook";
             PreparedStatement st = con.c.prepareStatement(sql);
             ResultSet rs = st.executeQuery();
             table.setModel(DbUtils.resultSetToTableModel(rs));
         } catch Exception e){
         } 
     }
           public Statistics(){
                    setBounds(400,200,810,594);
                    contentpane = new JPanel();
                    contentpane.setBorder(new EmptyBorder(5,5,5,5));
                    setContentPane(contentpane);
                    contentpane.setBackground(Color.WHITE);
                    contentpane.setLayout(null);
                    
                          JScrollPane scrollPane = new JScrollPane();
                          scrollPane.setBounds(40,51,708,217);
                          contentpane.add(scrollPane);
                          
                          table = new JTable();
                          table.setBackground(new Color(224,255,255));
                          table.setForeground(new Color(128,128,0));
                          table.setFont(new Font("Trebuchet MS", Font.BOLD,15));
                          scrollPane.setViewportView(table);
                          
                           JPanel panel = new JPanel();
                           panel.setBorder(new TitledBorder(new LineBorder(new Color(47,79,79),2, true),"Issue-Book-Details",
                           TitledBorder.LEADING, TitledBorder.TOP, null, new Color (0,128,128)));
                           panel.setBounds(26,36,737,240);
                           contentpane.add(panel);
                           panel.setBackground(Color.WHITE);
                           
                           JLabel l1 = new JLabel("Back");
                           l1.addMouseListener(new MouseAdapter(){
                              @Override
                              public void mouseClicked(MouseEvent arg0){
                                  setVisible(false);
                                  Home home = new Home();
                                  home.setVisible(true);
                                  
                              }
                           });
                           l1.setForeground(new Color (204,0,102));
                           l1.setFont(new Font("Tahoma, Font.BOLD,18"));
                           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("main/java/library/management/system/icons/tenth.png"));
                           Image i2 = i1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
                           ImageIcon i3 = new ImageIcon(i2);
                           l1.setIcon(i3); 
                           bl1.setBounds(690,13,96,27);
                           contentpane.add(l1);
                           
                          JScrollPane scrollPane_1 = new JScrollPane();
                          scrollPane_1.setBounds(40,316,717,217);
                          contentpane.add(scrollPane_1);
                          
                          table_1= new JTable();
                          table_1.setBackground(new Color(204,255,255));
                          table_1.setForeground(new Color(153,51,0));
                          table_1.setFont(new Font("Sitka Small", Font.BOLD, 12"));
                          scrollPane_1.setViewportView(table_1);
                          
                           JPanel panel_1 = new JPanel();
                           panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0,204,153),2, true),"Return-Book-Details",
                           TitledBorder.LEADING, TitledBorder.TOP, null, new Color (0,102,51)));
                           panel_1.setBounds(22,299,741,240);
                           contentpane.add(panel_1);
                           panel_1.setBackground(Color.WHITE);
                           
                           
                           issueBook());
                           returnBook());
           }
}
        
                          