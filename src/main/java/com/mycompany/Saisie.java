/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany;

import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author bouvr
 */
public class Saisie extends javax.swing.JDialog {

    /**
     * Creates new form Saisie
     */
    
    public boolean dataChanged = false;
    
    public void setNom(String tmp)  {
        nom = tmp;
    }
    
    public void setPrenom(String tmp)  {
        prenom = tmp;
    }
    
    public void setPhoto(String tmp)  {
        ImageIcon iconPhoto = new ImageIcon(tmp);   //carte0.png       //  ../Photos/carte0.png
        lblPhoto.setIcon(iconPhoto);        
    }
    
    public void setNumTel(String tmp)  {
        numTel = tmp;
    }
    
    public void setNumPort(String tmp)  {
        numPort = tmp;
    }
    
    public void setCourriel(String tmp)  {
        courriel = tmp;
    }
    
    public void setAdresse1(String tmp)  {
        adresse1 = tmp;
    }
    
    public void setVille(String tmp)  {
        ville = tmp;
    }

    public void initDataChanged() {
        dataChanged = false;
    }
    
    public boolean getDataChanged() {
        return dataChanged;
    }
    
    
    public Saisie(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPrenom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BtnValidate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtTelephone = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtCourriel = new javax.swing.JTextField();
        txtAdresse1 = new javax.swing.JTextField();
        txtVille = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtPrenom.setText("prenom");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Téléphone");

        txtNom.setText("nom");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Courriel");

        BtnValidate.setText("Valider");
        BtnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnValidateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Adresse");

        jLabel5.setText("Domicile");

        jLabel4.setText("Portable");

        txtTelephone.setText("NumTel");

        txtMobile.setText("NumPort");

        txtCourriel.setText("Courriel");

        txtAdresse1.setText("Adresse");

        txtVille.setText("Ville");

        lblPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblPhotoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrenom, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(txtNom)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)))
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCourriel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAdresse1)
                            .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(BtnValidate)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCourriel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAdresse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(BtnValidate)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnValidateActionPerformed
        // TODO add your handling code here:
        dataChanged=true;
        setDonnes();
        
        String infos = prenom + ";" + nom + ";" + url + ";" + numTel + ";" + numPort + ";" + courriel + ";" + adresse1 + ";" + ville;
        ecrireLeContact(infos);
        dispose(); 
    }//GEN-LAST:event_BtnValidateActionPerformed

    private void ecrireLeContact(String tmp) {
        lireLesContacts();
        ListeContacts.add(tmp);
        EcrireLesContacts();
    }
    
    
    public void SupprimeLeContact(int tmp) {
        lireLesContacts();
        ListeContacts.remove(tmp);
        EcrireLesContacts();
        
        //String element = ListeContacts.get(1);
        //ListeContacts.set(1, element + "1");
        //ListeContacts.clear();
        
    }    
    
    private void EcrireLesContacts() {
        
        Fichier f = new Fichier();
        f.OpenWriteByLine("Donnees/listeContacts.txt");
        for (String e : ListeContacts) {
            f.ecrire(e);
        }
        f.fermer();
        
    }
    
    private void lireLesContacts() {
        ListeContacts = new ArrayList();
        Fichier f = new Fichier();
        f.OpenReadByLine("Donnees/listeContacts.txt");
        String Chaine = "";
        do {
            Chaine = f.Lire();
            if (Chaine != null) {
                ListeContacts.add(Chaine);
            }
        } while (Chaine != null);
        f.fermer();
    }
            
    private void setDonnes() {
        setPrenom(txtPrenom.getText());
        setNom(txtNom.getText());
        setNumTel(txtTelephone.getText());
        setNumPort(txtMobile.getText());
        setCourriel(txtCourriel.getText());
        setAdresse1(txtAdresse1.getText());
        setVille(txtVille.getText());
        
    }
    
    private void lblPhotoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPhotoMouseReleased
        // TODO add your handling code here:
        File fichierPhoto;
        JFileChooser FileChooser1 = new JFileChooser("D:/Developpement/Java/test/FirstProject//Photos");
        int ret = FileChooser1.showOpenDialog(Saisie.this);
        if (ret == JFileChooser.APPROVE_OPTION) {
            fichierPhoto = FileChooser1.getSelectedFile();
            url = fichierPhoto.toString();
            setPhoto(url);
        }
    }//GEN-LAST:event_lblPhotoMouseReleased

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
            java.util.logging.Logger.getLogger(Saisie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Saisie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Saisie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Saisie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Saisie dialog = new Saisie(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private String nom,prenom, url, numTel, numPort, courriel, adresse1,ville;
    private ArrayList<String> ListeContacts;
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnValidate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JTextField txtAdresse1;
    private javax.swing.JTextField txtCourriel;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
