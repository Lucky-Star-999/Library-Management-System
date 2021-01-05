
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doquangminh
 */
public class Frame11_ManageStudents_Detail extends javax.swing.JFrame {

    /**
     * Creates new form Frame6_ProfileManager
     */
    public Frame11_ManageStudents_Detail() {
        initComponents();
         DefaultTableCellRenderer headerCellRenderer = new DefaultTableCellRenderer();
         headerCellRenderer.setBackground(Color.WHITE);
         headerCellRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
         headerCellRenderer.setFont(new Font("Avenir Next", Font.BOLD, 16));
        jTable1.getTableHeader().setDefaultRenderer(headerCellRenderer);
        
        
        ManageData.getManageData().updateStudentFine();
        
        //Set image of button
        String linkImageButton1 = "src/main/java/com/mycompany/librarygui/Library_Icons/icons8-back_1.png";
        Image im = Toolkit.getDefaultToolkit().createImage(linkImageButton1);
        im = im.getScaledInstance(btnBack.getWidth(), btnBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ii = new ImageIcon(im);
        btnBack.setIcon(ii);
        
        
        //Set table
        if (ManageData.getManageData().getUsername_choosen() != null){
            String userChoosen = ManageData.getManageData().getUsername_choosen();
            labelName.setText(ManageData.getManageData().allStudent.get(userChoosen).getFullName());
            labelId.setText(ManageData.getManageData().allStudent.get(userChoosen).getIdStudent());
            String fine = String.valueOf(ManageData.getManageData().allStudent.get(userChoosen).getFine()) + " VND";
            textFieldFine.setText(fine);
        }
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        String username = ManageData.getManageData().getUsername_choosen();
        
        //System.out.println(ManageData.getManageData().getUsername_choosen());
        model.setRowCount(0);
        for(Book value: ManageData.getManageData().allBook.values()){
                if (value.getWho_is_borrowing_this_book()!=null){
                    if (value.getWho_is_borrowing_this_book().equals(username)){
                        model.addRow( new Object[]{ value.getIdBook(), value.getTitle(), value.getStartBorrowed(), value.getEndBorrowedPrediction() } );
                    }
                }
            }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        btnChangeFine1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textFieldFine = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 113, 164));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Students");

        jLabel2.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        jLabel2.setText("Name:");

        btnBack.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\GitHub\\Library-Management-Official-\\LibraryGUI\\src\\main\\java\\com\\mycompany\\librarygui\\Library_Icons\\icons8-back_1.png")); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        jLabel3.setText("ID:");

        labelName.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        labelName.setText("Đỗ Quang Minh");

        labelId.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        labelId.setText("ITITIU19028");

        btnChangeFine1.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        btnChangeFine1.setText("Return book");
        btnChangeFine1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChangeFine1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChangeFine1MouseExited(evt);
            }
        });
        btnChangeFine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeFine1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        jLabel4.setText("Fine:");

        textFieldFine.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Title", "Date borrowed", "Due Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labelName)
                            .addGap(62, 62, 62)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labelId))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(29, 29, 29)
                            .addComponent(textFieldFine)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChangeFine1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(labelName)
                    .addComponent(labelId))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangeFine1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldFine))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Frame10_ManageStudents_General frame10 = new Frame10_ManageStudents_General();
        frame10.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnChangeFine1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeFine1MouseEntered
        // TODO add your handling code here:
        btnChangeFine1.setBackground(new Color(20, 142, 255));
        btnChangeFine1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnChangeFine1MouseEntered

    private void btnChangeFine1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeFine1MouseExited
        // TODO add your handling code here:
        btnChangeFine1.setBackground(new Color(255, 255, 255));
        btnChangeFine1.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnChangeFine1MouseExited

    private void btnChangeFine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeFine1ActionPerformed
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        
        
        if (i != -1){
            String id = String.valueOf(jTable1.getValueAt(i, 0));
            
            String userChoosen = ManageData.getManageData().allBook.get(id).getWho_is_borrowing_this_book();
            
            ManageData.getManageData().allBook.get(id).setWho_is_borrowing_this_book(null);
            ManageData.getManageData().allBook.get(id).setStartBorrowed(null);
            ManageData.getManageData().allBook.get(id).setEndBorrowedPrediction(null);
            ManageData.getManageData().allBook.get(id).setAvailable("Yes");
            
            ManageData.getManageData().updateStudentFine();
            String fine = String.valueOf(ManageData.getManageData().allStudent.get(userChoosen).getFine()) + " VND";
            textFieldFine.setText(fine);
            
            ManageData.getManageData().saveAllBook();
        
            ManageData.getManageData().setBook_choosen(null);
            JOptionPane.showMessageDialog(null, "Return book successfully!\nPress \"Back\" to return!");
            
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            
            model.setRowCount(0);
            String username = ManageData.getManageData().getUsername_choosen();

            
            ManageData.getManageData().updateStudentFine();
            fine = String.valueOf(ManageData.getManageData().allStudent.get(userChoosen).getFine()) + " VND";
            textFieldFine.setText(fine);
            
            for(Book value: ManageData.getManageData().allBook.values()){
                if (value.getWho_is_borrowing_this_book()!=null){
                    if (value.getWho_is_borrowing_this_book().equals(username)){
                        model.addRow( new Object[]{ value.getIdBook(), value.getTitle(), value.getStartBorrowed(), value.getEndBorrowedPrediction() } );
                    }
                }
            }
        }
    }//GEN-LAST:event_btnChangeFine1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame6_ProfileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame6_ProfileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame6_ProfileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame6_ProfileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame11_ManageStudents_Detail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChangeFine1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel textFieldFine;
    // End of variables declaration//GEN-END:variables
}
