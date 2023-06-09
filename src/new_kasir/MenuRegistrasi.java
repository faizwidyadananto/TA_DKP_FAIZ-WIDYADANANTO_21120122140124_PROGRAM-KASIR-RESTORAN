package new_kasir;

import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Faiz
 */
public class MenuRegistrasi extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();    

    /**
     * Creates new form MenuMasakan
     */
    public MenuRegistrasi() {
        initComponents();
        setLocationRelativeTo(this);
        k.connect();
        refreshTable();
    }
    
    class user extends MenuRegistrasi{
        int id_user,id_level;
        String username,password,nama_user;
        
        public user() {
            username = TXT_USERNAME.getText();
            password = TXT_PASSWORD.getText();
            nama_user = TXT_NAMAUSER.getText();
            id_level = Integer.parseInt(COMBO_IDLEVEL.getSelectedItem().toString());
            
        }
    }
    
    public void refreshTable(){
        model = new DefaultTableModel();
        model.addColumn("ID USER");
        model.addColumn("USERNAME");
        model.addColumn("PASSWORD");
        model.addColumn("NAMA USER");
        model.addColumn("ID LEVEL");
        TABLE_REGISTRASI.setModel(model);
        try {
            this.stat = k.getCon().prepareStatement("SELECT * FROM `user`");
            this.rs = this.stat.executeQuery();
            while (rs.next()){
                Object[]data = {
                    rs.getString("ID_USER"),
                    rs.getString("USERNAME"),
                    rs.getString("PASSWORD"),
                    rs.getString("NAMA_USER"),
                    rs.getString("ID_LEVEL")
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        TXT_IDUSER.setText("");
        TXT_USERNAME.setText("");
        TXT_PASSWORD.setText("");
        TXT_NAMAUSER.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        TXT_IDUSER = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXT_USERNAME = new javax.swing.JTextField();
        TXT_NAMAUSER = new javax.swing.JTextField();
        COMBO_IDLEVEL = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE_REGISTRASI = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        BTN_INPUT = new javax.swing.JButton();
        BTN_UPDATE = new javax.swing.JButton();
        BTN_DELETE = new javax.swing.JButton();
        BTN_MASAKAN = new javax.swing.JButton();
        BTN_LOGOUT = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TXT_PASSWORD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID USER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 228, -1));

        TXT_IDUSER.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        TXT_IDUSER.setEnabled(false);
        getContentPane().add(TXT_IDUSER, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 374, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USERNAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 228, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 228, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NAMA USER");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 228, -1));

        TXT_USERNAME.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        getContentPane().add(TXT_USERNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 374, -1));

        TXT_NAMAUSER.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        getContentPane().add(TXT_NAMAUSER, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 374, -1));

        COMBO_IDLEVEL.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        COMBO_IDLEVEL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        COMBO_IDLEVEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMBO_IDLEVELActionPerformed(evt);
            }
        });
        getContentPane().add(COMBO_IDLEVEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 374, 41));

        TABLE_REGISTRASI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TABLE_REGISTRASI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLE_REGISTRASIMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLE_REGISTRASI);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 716, 150));

        BTN_INPUT.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        BTN_INPUT.setText("INPUT");
        BTN_INPUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_INPUTActionPerformed(evt);
            }
        });

        BTN_UPDATE.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        BTN_UPDATE.setText("UPDATE");
        BTN_UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_UPDATEActionPerformed(evt);
            }
        });

        BTN_DELETE.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        BTN_DELETE.setText("DELETE");
        BTN_DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DELETEActionPerformed(evt);
            }
        });

        BTN_MASAKAN.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        BTN_MASAKAN.setText("MENU MASAKAN");
        BTN_MASAKAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MASAKANActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTN_INPUT, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_MASAKAN, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_INPUT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_MASAKAN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        BTN_LOGOUT.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        BTN_LOGOUT.setText("LOGOUT");
        BTN_LOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_LOGOUTActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_LOGOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 0, 146, 45));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID LEVEL");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 228, -1));

        TXT_PASSWORD.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        getContentPane().add(TXT_PASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 374, -1));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRASI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 400, 73));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sony\\Downloads\\Daftar Menu Makanan Food Instagram Post.png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_LOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_LOGOUTActionPerformed
        login l = new login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_LOGOUTActionPerformed

    private void BTN_INPUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_INPUTActionPerformed
        try {
            user u = new user();
            this.stat = k.getCon().prepareStatement("insert into user values(?,?,?,?,?)");
            stat.setInt(1, 0);
            if (u.username.isEmpty()){
                JOptionPane.showMessageDialog(null, "USERNAME TIDAK BOLEH KOSONG");
                return;
            }
            stat.setString(2, u.username);
            if (u.password.isEmpty()){
                JOptionPane.showMessageDialog(null, "PASSWORD TIDAK BOLEH KOSONG");
                return;
            }
            stat.setString(3, u.password);
            if (u.nama_user.isEmpty()){
                JOptionPane.showMessageDialog(null, "NAMA USER TIDAK BOLEH KOSONG");
                return;
            }
            stat.setString(4, u.nama_user);
            stat.setInt(5, u.id_level);
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_BTN_INPUTActionPerformed

    private void TABLE_REGISTRASIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLE_REGISTRASIMouseClicked
        TXT_IDUSER.setText(model.getValueAt(TABLE_REGISTRASI.getSelectedRow(), 0).toString());
        TXT_USERNAME.setText(model.getValueAt(TABLE_REGISTRASI.getSelectedRow(), 1).toString());
        TXT_PASSWORD.setText(model.getValueAt(TABLE_REGISTRASI.getSelectedRow(), 2).toString());
        TXT_NAMAUSER.setText(model.getValueAt(TABLE_REGISTRASI.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_TABLE_REGISTRASIMouseClicked

    private void BTN_UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_UPDATEActionPerformed
        try {
            user u = new user();
            this.stat = k.getCon().prepareStatement("update user set username=?, "
                  + "password=?,nama_user=?,id_level=? where id_user=?");           
            stat.setString(1, u.username);
            stat.setString(2, u.password);
            stat.setString(3, u.nama_user);
            stat.setInt(4, u.id_level);
            stat.setString(5, TXT_IDUSER.getText());
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_BTN_UPDATEActionPerformed

    private void BTN_DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DELETEActionPerformed
        try {
            user u = new user();
            this.stat = k.getCon().prepareStatement("delete from user where id_user=?");
            stat.setString(1, TXT_IDUSER.getText());
            stat.executeUpdate();
            refreshTable();           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_BTN_DELETEActionPerformed

    private void BTN_MASAKANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MASAKANActionPerformed
        MenuMasakan masak = new MenuMasakan();
        masak.setVisible(true);
        this.setVisible(false);
        masak.BTN_INPUT.setEnabled(true);
        masak.BTN_DELETE.setEnabled(true);
        masak.BTN_UPDATE.setEnabled(true);
        masak.BTN_TRANSAKSI.setEnabled(true);
        masak.BTN_REGISTRASI.setEnabled(true);
    }//GEN-LAST:event_BTN_MASAKANActionPerformed

    private void COMBO_IDLEVELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMBO_IDLEVELActionPerformed

    }//GEN-LAST:event_COMBO_IDLEVELActionPerformed

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
            java.util.logging.Logger.getLogger(MenuRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRegistrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTN_DELETE;
    public javax.swing.JButton BTN_INPUT;
    public javax.swing.JButton BTN_LOGOUT;
    public javax.swing.JButton BTN_MASAKAN;
    public javax.swing.JButton BTN_UPDATE;
    private javax.swing.JComboBox<String> COMBO_IDLEVEL;
    private javax.swing.JTable TABLE_REGISTRASI;
    private javax.swing.JTextField TXT_IDUSER;
    private javax.swing.JTextField TXT_NAMAUSER;
    private javax.swing.JTextField TXT_PASSWORD;
    private javax.swing.JTextField TXT_USERNAME;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
 
