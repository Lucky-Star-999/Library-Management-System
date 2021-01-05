
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
import java.util.HashMap;
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
public class Frame16_Book_Manager extends javax.swing.JFrame {

    /**
     * Creates new form Frame6_ProfileManager
     */
    public Frame16_Book_Manager() {
        initComponents();
         DefaultTableCellRenderer headerCellRenderer = new DefaultTableCellRenderer();
         headerCellRenderer.setBackground(Color.WHITE);
         headerCellRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
         headerCellRenderer.setFont(new Font("Avenir Next", Font.BOLD, 16));
        jTable1.getTableHeader().setDefaultRenderer(headerCellRenderer);
        
        jComboBox1.setBackground(Color.WHITE);
        
        
        
        //Set image of button
        String linkImageButton1 = "src/main/java/com/mycompany/librarygui/Library_Icons/icons8-back_1.png";
        Image im = Toolkit.getDefaultToolkit().createImage(linkImageButton1);
        im = im.getScaledInstance(btnBack.getWidth(), btnBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ii = new ImageIcon(im);
        btnBack.setIcon(ii);
        
        String linkImageButton2 = "src/main/java/com/mycompany/librarygui/Library_Icons/icons8-search_1.png";
        Image im2 = Toolkit.getDefaultToolkit().createImage(linkImageButton2);
        im2 = im2.getScaledInstance(btnSearch.getWidth(), btnSearch.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ii2 = new ImageIcon(im2);
        btnSearch.setIcon(ii2);
        
        String linkImageButton3 = "src/main/java/com/mycompany/librarygui/Library_Icons/Audio-512.png";
        Image im3 = Toolkit.getDefaultToolkit().createImage(linkImageButton3);
        im3 = im3.getScaledInstance(btnBack3.getWidth(), btnBack3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ii3 = new ImageIcon(im3);
        btnBack3.setIcon(ii3);
        
        
        //Set table show
        ManageData.getManageData().setBook_choosen(null);
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        for(Book value: ManageData.getManageData().allBook.values()){
            model.addRow( new Object[]{ value.getIdBook(), value.getCategory(), value.getTitle(), value.getAuthor(), value.getAvailable() } );
        }
        

        //HashMap contain comboBox
        HashMap<String, String> comboBoxSupport = new HashMap<>();
        comboBoxSupport.clear();
        HashMap<String, Book> allBook = ManageData.getManageData().allBook;
        for(Book key: allBook.values()){
            comboBoxSupport.put(key.getCategory(), "1");
        }
        jComboBox1.addItem("<All Category>");
        for (String key: comboBoxSupport.keySet()){
            jComboBox1.addItem(key);
        }
        jComboBox1.setSelectedItem("<All Category>");
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
        jTextField_Search = new javax.swing.JTextField();
        btnAddNewBook = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnShowList = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnSearch = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        textFieldImage = new javax.swing.JLabel();
        btnAddNewBook1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAddNewBook2 = new javax.swing.JButton();
        btnBack3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 113, 164));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Books ");

        jLabel2.setFont(new java.awt.Font("Avenir", 1, 24)); // NOI18N
        jLabel2.setText("Category");

        jTextField_Search.setFont(new java.awt.Font("Avenir Next", 0, 16)); // NOI18N
        jTextField_Search.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_Search.setText("Search title or ID");
        jTextField_Search.setBorder(null);
        jTextField_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_SearchMouseClicked(evt);
            }
        });
        jTextField_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchActionPerformed(evt);
            }
        });
        jTextField_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_SearchKeyPressed(evt);
            }
        });

        btnAddNewBook.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        btnAddNewBook.setText("Add New Book");
        btnAddNewBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddNewBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddNewBookMouseExited(evt);
            }
        });
        btnAddNewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewBookActionPerformed(evt);
            }
        });

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

        btnShowList.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        btnShowList.setText("Show List");
        btnShowList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnShowListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnShowListMouseExited(evt);
            }
        });
        btnShowList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowListActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Avenir Next", 1, 10)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(153, 153, 153));
        btnSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\GitHub\\Library-Management-Official-\\LibraryGUI\\src\\main\\java\\com\\mycompany\\librarygui\\Library_Icons\\icons8-search_1.png")); // NOI18N
        btnSearch.setBorder(null);
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Avenir", 0, 16)); // NOI18N
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        btnDelete.setText("Delete This Book");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAddNewBook1.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        btnAddNewBook1.setText("Someone Borrow");
        btnAddNewBook1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddNewBook1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddNewBook1MouseExited(evt);
            }
        });
        btnAddNewBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewBook1ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Category", "Title", "Author", "Availability"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnAddNewBook2.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        btnAddNewBook2.setText("Read pdf");
        btnAddNewBook2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddNewBook2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddNewBook2MouseExited(evt);
            }
        });
        btnAddNewBook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewBook2ActionPerformed(evt);
            }
        });

        btnBack3.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        btnBack3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\GitHub\\Library-Management-System\\LibraryGUI\\src\\main\\java\\com\\mycompany\\librarygui\\Library_Icons\\Audio-512.png")); // NOI18N
        btnBack3.setBorderPainted(false);
        btnBack3.setContentAreaFilled(false);
        btnBack3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBack3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBack3MouseExited(evt);
            }
        });
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnShowList, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddNewBook)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddNewBook1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddNewBook2)
                                .addGap(18, 18, 18)
                                .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(jTextField_Search))
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldImage, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddNewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnShowList, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddNewBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddNewBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
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
                .addGap(80, 80, 80))
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

    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SearchActionPerformed

    private void btnShowListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowListMouseEntered
        // TODO add your handling code here:
        btnShowList.setBackground(new Color(20, 142, 255));
        btnShowList.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnShowListMouseEntered

    private void btnShowListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowListMouseExited
        // TODO add your handling code here:
        btnShowList.setBackground(new Color(255, 255, 255));
        btnShowList.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnShowListMouseExited

    private void btnAddNewBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewBookMouseEntered
        // TODO add your handling code here:
        btnAddNewBook.setBackground(new Color(20, 142, 255));
        btnAddNewBook.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnAddNewBookMouseEntered

    private void btnAddNewBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewBookMouseExited
        // TODO add your handling code here:
        btnAddNewBook.setBackground(new Color(255, 255, 255));
        btnAddNewBook.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnAddNewBookMouseExited

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnBackMouseExited

    private void jTextField_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_SearchMouseClicked
        // TODO add your handling code here:
        jTextField_Search.setText("");
        jTextField_Search.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jTextField_SearchMouseClicked

    private void jTextField_SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SearchKeyPressed
        // TODO add your handling code here:
        // Nhấn Enter để search
        
    }//GEN-LAST:event_jTextField_SearchKeyPressed

    private void btnShowListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowListActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        for(Book value: ManageData.getManageData().allBook.values()){
            model.addRow( new Object[]{ value.getIdBook(), value.getCategory(), value.getTitle(), value.getAuthor(), value.getAvailable() } );
        }
    }//GEN-LAST:event_btnShowListActionPerformed

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchMouseExited

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Frame6_ProfileManager frame6 = new Frame6_ProfileManager();
        frame6.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddNewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewBookActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Frame20_AddBook frame20 = new Frame20_AddBook();
        frame20.setVisible(true);
    }//GEN-LAST:event_btnAddNewBookActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String contents = String.valueOf(jComboBox1.getSelectedItem());
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        if(!contents.equals("<All Category>")){
            for(Book value: ManageData.getManageData().allBook.values()){
                if (value.getCategory().equals(contents)){
                    model.addRow( new Object[]{ value.getIdBook(), value.getCategory(), value.getTitle(), value.getAuthor(), value.getAvailable() } );
                }
            }
        }
        else{
            for(Book value: ManageData.getManageData().allBook.values()){
                model.addRow( new Object[]{ value.getIdBook(), value.getCategory(), value.getTitle(), value.getAuthor(), value.getAvailable() } );
            }
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String search = jTextField_Search.getText();
        
        
        //New methods
        Searching.getSearching().mergeSearchBook(search);
        
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
            
        for(Book value: Searching.getSearching().searchBookByNameAndId.values()){
            model.addRow( new Object[]{ value.getIdBook(), value.getCategory(), value.getTitle(), value.getAuthor(), value.getAvailable() } );
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        // TODO add your handling code here:
        btnDelete.setBackground(new Color(255, 59, 48));
        btnDelete.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        // TODO add your handling code here:
        btnDelete.setBackground(new Color(255, 255, 255));
        btnDelete.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        
        
        
        if (i != -1){
            String id = String.valueOf(jTable1.getValueAt(i, 0));
            ManageData.getManageData().setBook_choosen(id);
            ManageData.getManageData().allBook.remove(id);
            ManageData.getManageData().saveAllBook();
        
            ManageData.getManageData().setBook_choosen(null);
        }
        
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        for(Book value: ManageData.getManageData().allBook.values()){
            model.addRow( new Object[]{ value.getIdBook(), value.getCategory(), value.getTitle(), value.getAuthor(), value.getAvailable() } );
        }
        
        //HashMap contain comboBox
        jComboBox1.removeAllItems();
        HashMap<String, String> comboBoxSupport = new HashMap<>();
        comboBoxSupport.clear();
        HashMap<String, Book> allBook = ManageData.getManageData().allBook;
        for(Book key: allBook.values()){
            comboBoxSupport.put(key.getCategory(), "1");
        }
        jComboBox1.addItem("<All Category>");
        for (String key: comboBoxSupport.keySet()){
            jComboBox1.addItem(key);
        }
        jComboBox1.setSelectedItem("<All Category>");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddNewBook1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewBook1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewBook1MouseEntered

    private void btnAddNewBook1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewBook1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewBook1MouseExited

    private void btnAddNewBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewBook1ActionPerformed
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        if(i != -1){
            String id = String.valueOf(jTable1.getValueAt(i, 0));
            ManageData.getManageData().setBook_choosen(id);
            
        
            this.dispose();
            Frame21_StudentBorrowBook frame21 = new Frame21_StudentBorrowBook();
            frame21.setVisible(true);
        }
    }//GEN-LAST:event_btnAddNewBook1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        if (i != -1){
            String book = String.valueOf(jTable1.getValueAt(i, 0));
            ManageData.getManageData().setBook_choosen(book);

            String linkAvatar = ManageData.getManageData().allBook.get(book).getLink();
            
            Image im = Toolkit.getDefaultToolkit().createImage(linkAvatar);
            im = im.getScaledInstance(textFieldImage.getWidth(), textFieldImage.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ii = new ImageIcon(im);
            
            if (linkAvatar==null){
                textFieldImage.setText("");
            }
            
            textFieldImage.setIcon(ii);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnAddNewBook2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewBook2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewBook2MouseEntered

    private void btnAddNewBook2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewBook2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewBook2MouseExited

    private void btnAddNewBook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewBook2ActionPerformed
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        if(i != -1){
            String id = String.valueOf(jTable1.getValueAt(i, 0));
            String link = ManageData.getManageData().allBook.get(id).getLinkPdf();
            File file = new File(link);
            
            if(file.getName().equals("pdfFiles")){
                JOptionPane.showMessageDialog(null, "There is not any files!");
            }
            else{
                ManageData.getManageData().openPdfFile(file.getAbsolutePath());
            }

        }
    }//GEN-LAST:event_btnAddNewBook2ActionPerformed

    private void btnBack3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack3MouseEntered

    private void btnBack3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack3MouseExited

    private void btnBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack3ActionPerformed
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        if(i != -1){
            String id = String.valueOf(jTable1.getValueAt(i, 0));
            String link = ManageData.getManageData().allBook.get(id).getLinkAudio();
            File file = new File(link);
            
            if(file.getName().equals("audioFiles")){
                JOptionPane.showMessageDialog(null, "There is not any files!");
            }
            else{
                ManageData.getManageData().openPdfFile(file.getAbsolutePath());
            }

        }
    }//GEN-LAST:event_btnBack3ActionPerformed

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
                new Frame16_Book_Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewBook;
    private javax.swing.JButton btnAddNewBook1;
    private javax.swing.JButton btnAddNewBook2;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack3;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowList;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JLabel textFieldImage;
    // End of variables declaration//GEN-END:variables
}
