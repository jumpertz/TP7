/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoffresstage;

/**
 *
 * @author jeremy
 */
public class MenuSaisie extends javax.swing.JFrame {

    /**
     * Creates new form MenuSaisie
     */
    public MenuSaisie() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbMenuSaisie = new javax.swing.JPanel();
        lblSaisieOffreStage = new javax.swing.JLabel();
        lblNomEntreprise = new javax.swing.JLabel();
        lblDomaineOffre = new javax.swing.JLabel();
        itmNomEntreprise = new javax.swing.JComboBox();
        jcbDomaineOffre = new javax.swing.JComboBox();
        lblLibelleOffre = new javax.swing.JLabel();
        txtLibelleOffre = new javax.swing.JTextField();
        lblDateDebutstage = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblDureeStage = new javax.swing.JLabel();
        txtDureeStage = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCheminStockageOffreStage = new javax.swing.JTextField();
        lblDescriptifOffre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescriptifOffre = new javax.swing.JTextArea();
        btnEnvoyerStage = new javax.swing.JButton();
        btnAnnulerOffreStage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcbMenuSaisie.setBackground(new java.awt.Color(0, 153, 204));

        lblSaisieOffreStage.setText("SAISIE D'UNE OFFRE DE STAGE");

        lblNomEntreprise.setText("Nom de l'entreprise");

        lblDomaineOffre.setText("Domaine de l'offre");

        itmNomEntreprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        itmNomEntreprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmNomEntrepriseActionPerformed(evt);
            }
        });

        jcbDomaineOffre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblLibelleOffre.setText("Libellé de l'offre");

        lblDateDebutstage.setText("Date de début du stage");

        lblDureeStage.setText("Durée");

        jLabel1.setText("Chemin de stockage de l'offre de stage");

        txtCheminStockageOffreStage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheminStockageOffreStageActionPerformed(evt);
            }
        });

        lblDescriptifOffre.setText("Descriptif de l'offre");

        txtaDescriptifOffre.setColumns(20);
        txtaDescriptifOffre.setRows(5);
        jScrollPane1.setViewportView(txtaDescriptifOffre);

        btnEnvoyerStage.setText("Envoyer");

        btnAnnulerOffreStage.setText("Annuler");
        btnAnnulerOffreStage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerOffreStageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcbMenuSaisieLayout = new javax.swing.GroupLayout(jcbMenuSaisie);
        jcbMenuSaisie.setLayout(jcbMenuSaisieLayout);
        jcbMenuSaisieLayout.setHorizontalGroup(
            jcbMenuSaisieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcbMenuSaisieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDateDebutstage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDureeStage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDureeStage, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(jcbMenuSaisieLayout.createSequentialGroup()
                .addGroup(jcbMenuSaisieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcbMenuSaisieLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jcbMenuSaisieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jcbMenuSaisieLayout.createSequentialGroup()
                                .addComponent(lblDomaineOffre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbDomaineOffre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jcbMenuSaisieLayout.createSequentialGroup()
                                .addComponent(lblNomEntreprise)
                                .addGap(58, 58, 58)
                                .addComponent(itmNomEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jcbMenuSaisieLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLibelleOffre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLibelleOffre, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jcbMenuSaisieLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(lblDescriptifOffre))
                    .addGroup(jcbMenuSaisieLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jcbMenuSaisieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jcbMenuSaisieLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCheminStockageOffreStage, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jcbMenuSaisieLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnEnvoyerStage)
                        .addGap(85, 85, 85)
                        .addComponent(btnAnnulerOffreStage)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcbMenuSaisieLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSaisieOffreStage)
                .addGap(166, 166, 166))
        );
        jcbMenuSaisieLayout.setVerticalGroup(
            jcbMenuSaisieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcbMenuSaisieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaisieOffreStage)
                .addGap(37, 37, 37)
                .addGroup(jcbMenuSaisieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomEntreprise)
                    .addComponent(itmNomEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jcbMenuSaisieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDomaineOffre)
                    .addComponent(jcbDomaineOffre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jcbMenuSaisieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLibelleOffre)
                    .addComponent(txtLibelleOffre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jcbMenuSaisieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateDebutstage)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDureeStage)
                    .addComponent(txtDureeStage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jcbMenuSaisieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCheminStockageOffreStage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescriptifOffre)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jcbMenuSaisieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnvoyerStage)
                    .addComponent(btnAnnulerOffreStage))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcbMenuSaisie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcbMenuSaisie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmNomEntrepriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmNomEntrepriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmNomEntrepriseActionPerformed

    private void txtCheminStockageOffreStageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheminStockageOffreStageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheminStockageOffreStageActionPerformed

    private void btnAnnulerOffreStageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerOffreStageActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAnnulerOffreStageActionPerformed

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
            java.util.logging.Logger.getLogger(MenuSaisie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSaisie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSaisie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSaisie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSaisie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnulerOffreStage;
    private javax.swing.JButton btnEnvoyerStage;
    private javax.swing.JComboBox itmNomEntreprise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox jcbDomaineOffre;
    private javax.swing.JPanel jcbMenuSaisie;
    private javax.swing.JLabel lblDateDebutstage;
    private javax.swing.JLabel lblDescriptifOffre;
    private javax.swing.JLabel lblDomaineOffre;
    private javax.swing.JLabel lblDureeStage;
    private javax.swing.JLabel lblLibelleOffre;
    private javax.swing.JLabel lblNomEntreprise;
    private javax.swing.JLabel lblSaisieOffreStage;
    private javax.swing.JTextField txtCheminStockageOffreStage;
    private javax.swing.JTextField txtDureeStage;
    private javax.swing.JTextField txtLibelleOffre;
    private javax.swing.JTextArea txtaDescriptifOffre;
    // End of variables declaration//GEN-END:variables
}
