/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TugasMG11;

import java.text.DecimalFormat;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.text.NumberFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author user
 */
public class BiodataFrame extends javax.swing.JFrame {

    /**
     * Creates new form BiodataFrame
     */
    public BiodataFrame() {
        initComponents();
        
        daftarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateAndSubmit();
            }
        });

        // Adding a KeyListener to ipkText to validate IPK
        ipkText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                validateIpk();
            }
        });

        // Adding a KeyListener to noTelpText to validate phone number (only numbers)
        noTelpText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume();  // Prevent non-digit input
                }
            }
        });

        // Adding KeyListener to tglLahirFormat to validate Age
        tglLahirFormat.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                validateAge();
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nikText = new javax.swing.JTextField();
        namaText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pendidikanComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lakiRadioButton = new javax.swing.JRadioButton();
        perempuianRadioButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        bacaCheckBox = new javax.swing.JCheckBox();
        makanCheckBox = new javax.swing.JCheckBox();
        tidurCheckBox = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatText = new javax.swing.JTextArea();
        daftarButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tglLahirFormat = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        ipkText = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        noTelpText = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIK");

        jLabel2.setText("Nama");

        namaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTextActionPerformed(evt);
            }
        });

        jLabel3.setText("Pendidikan");

        pendidikanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SD", "SMP", "SMA", "D1", "D2", "D3", "D4 / S1", "S2", "S3" }));
        pendidikanComboBox.setSelectedIndex(-1);
        pendidikanComboBox.setToolTipText("");
        pendidikanComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendidikanComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Gender");

        buttonGroup1.add(lakiRadioButton);
        lakiRadioButton.setText("Laki-laki");
        lakiRadioButton.setActionCommand("");
        lakiRadioButton.setActionCommand("Laki-laki");
        lakiRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lakiRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(perempuianRadioButton);
        perempuianRadioButton.setText("Perempuan");
        perempuianRadioButton.setActionCommand("");
        perempuianRadioButton.setActionCommand("Perempuan");

        jLabel5.setText("Hobi");

        bacaCheckBox.setText("Membaca");

        makanCheckBox.setText("Makan");

        tidurCheckBox.setText("Tidur");
        tidurCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidurCheckBoxActionPerformed(evt);
            }
        });

        jLabel6.setText("Alamat");

        alamatText.setColumns(20);
        alamatText.setRows(5);
        jScrollPane1.setViewportView(alamatText);

        daftarButton.setText("Daftar");
        daftarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Tanggal Lahir");

        tglLahirFormat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglLahirFormatActionPerformed(evt);
            }
        });

        jLabel8.setText("IPK");

        ipkText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipkTextActionPerformed(evt);
            }
        });
        ipkText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ipkTextKeyReleased(evt);
            }
        });

        jLabel9.setText("No. Telp");

        noTelpText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noTelpTextKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nikText, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaText, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bacaCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(tidurCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lakiRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(perempuianRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(makanCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(pendidikanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(daftarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tglLahirFormat, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(noTelpText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                            .addComponent(ipkText, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nikText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lakiRadioButton)
                    .addComponent(perempuianRadioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bacaCheckBox)
                    .addComponent(tidurCheckBox)
                    .addComponent(makanCheckBox))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(pendidikanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(ipkText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tglLahirFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(noTelpText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(daftarButton)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
        // Method to validate all fields and submit
    private void validateAndSubmit() {
        String pendidikan = (String) pendidikanComboBox.getSelectedItem();
        String ipkStr = ipkText.getText();
        String noTelp = noTelpText.getText();
        String tanggalLahir = tglLahirFormat.getText();

        // Validate Pendidikan
        if (pendidikan.equals("SD") || pendidikan.equals("SMP") || pendidikan.equals("SMA")) {
        // Show an error message if education is below D1
        JOptionPane.showMessageDialog(this, "Pendidikan tidak memenuhi kriteria", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Stop further processing if the condition is not met
        }
        // Validate IPK
        double ipk;
        try {
            ipk = Double.parseDouble(ipkStr);
            if (ipk < 0.00 || ipk > 4.00) {
                JOptionPane.showMessageDialog(this, "IPK harus berada antara 0.00 dan 4.00");
                return;
            }
            if (ipk < 3.01) {
                JOptionPane.showMessageDialog(this, "Anda belum memenuhi kriteria untuk IPK");
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "IPK harus berupa angka dengan nilai antara 0,00 dan 4,00");
            return;
        }

        // Validate Age
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthDate = LocalDate.parse(tanggalLahir, formatter);
            LocalDate currentDate = LocalDate.now();
            long age = ChronoUnit.YEARS.between(birthDate, currentDate);

            if (age < 18) {
                JOptionPane.showMessageDialog(this, "Umur Anda belum cukup");
                return;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Tanggal Lahir harus dalam format yyyy-MM-dd");
            return;
        }

        // Validate No. Telp
        if (!noTelp.matches("\\d{1,15}")) {
            JOptionPane.showMessageDialog(this, "No. Telp harus berupa angka dan maksimal 15 angka");
            return;
        }

        // If all validations pass, show success message
        JOptionPane.showMessageDialog(this, "Anda berhasil mendaftar");

        // Clear all fields after successful registration
        nikText.setText("");
        namaText.setText("");
        buttonGroup1.clearSelection();
        alamatText.setText("");
        bacaCheckBox.setSelected(false);
        tidurCheckBox.setSelected(false);
        makanCheckBox.setSelected(false);
        pendidikanComboBox.setSelectedIndex(-1);
        ipkText.setText("");
        noTelpText.setText("");
        tglLahirFormat.setText("");
    }

    // Validate IPK (when user types in ipkText)
    private void validateIpk() {
        String ipkStr = ipkText.getText();
        try {
            double ipk = Double.parseDouble(ipkStr);
            if (ipk < 0.00 || ipk > 4.00) {
                JOptionPane.showMessageDialog(this, "IPK harus berada antara 0.00 dan 4.00");
            } else if (ipk < 3.01) {
                JOptionPane.showMessageDialog(this, "Anda belum memenuhi kriteria untuk IPK");
            }
        } catch (NumberFormatException ex) {
            // Handle non-numeric input
        }
    }

    // Validate Age (when user types in tglLahirFormat)
    private void validateAge() {
        String tanggalLahir = tglLahirFormat.getText();
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthDate = LocalDate.parse(tanggalLahir, formatter);
            LocalDate currentDate = LocalDate.now();
            long age = ChronoUnit.YEARS.between(birthDate, currentDate);

            if (age < 18) {
                JOptionPane.showMessageDialog(this, "Umur Anda belum cukup");
            }
        } catch (Exception ex) {
            // Skip if there's an invalid date format
        }
    }
    
    
    private void namaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTextActionPerformed

    private void pendidikanComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendidikanComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pendidikanComboBoxActionPerformed

    private void tidurCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidurCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidurCheckBoxActionPerformed

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
        
    }//GEN-LAST:event_daftarButtonActionPerformed

    private void lakiRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lakiRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lakiRadioButtonActionPerformed

    private void tglLahirFormatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglLahirFormatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglLahirFormatActionPerformed

    private void ipkTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipkTextActionPerformed
        
    }//GEN-LAST:event_ipkTextActionPerformed

    private void noTelpTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noTelpTextKeyTyped
        
        char c = evt.getKeyChar();
        
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_noTelpTextKeyTyped

    private void ipkTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ipkTextKeyReleased
        
    }//GEN-LAST:event_ipkTextKeyReleased

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
            java.util.logging.Logger.getLogger(BiodataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BiodataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BiodataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BiodataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BiodataFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatText;
    private javax.swing.JCheckBox bacaCheckBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton daftarButton;
    private javax.swing.JFormattedTextField ipkText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton lakiRadioButton;
    private javax.swing.JCheckBox makanCheckBox;
    private javax.swing.JTextField namaText;
    private javax.swing.JTextField nikText;
    private javax.swing.JTextField noTelpText;
    private javax.swing.JComboBox<String> pendidikanComboBox;
    private javax.swing.JRadioButton perempuianRadioButton;
    private javax.swing.JFormattedTextField tglLahirFormat;
    private javax.swing.JCheckBox tidurCheckBox;
    // End of variables declaration//GEN-END:variables
}