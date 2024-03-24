/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Cezarino Hora
 */
public class Frmcombobox extends javax.swing.JFrame {

    /**
     * Creates new form Frmcombobox
     */
    public Frmcombobox() {
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

        lblexemplocombobox = new javax.swing.JLabel();
        lblresposta = new javax.swing.JLabel();
        lblresposta1 = new javax.swing.JLabel();
        cbcidades = new javax.swing.JComboBox<>();
        cbestado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        btnok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exemplo ComboBox");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblexemplocombobox.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblexemplocombobox.setText("Exemplo ComboBox");
        getContentPane().add(lblexemplocombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        lblresposta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblresposta.setText("ESTADO:");
        getContentPane().add(lblresposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        lblresposta1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblresposta1.setText("CIDADES:");
        getContentPane().add(lblresposta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        cbcidades.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        getContentPane().add(cbcidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 333, 37));

        cbestado.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um estado", "São Paulo", "Minas Gerais", "Rio de Janeiro", "Mato Grosso" }));
        cbestado.setToolTipText("Selecione um estado");
        cbestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbestadoActionPerformed(evt);
            }
        });
        getContentPane().add(cbestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 333, 37));

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 460, 120));

        btnok.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        getContentPane().add(btnok, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 150, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // Botão OK
        String uf, cidade;
        
        //Limpar o texto do textarea
        txtarea.setText("");
        
        uf = cbestado.getSelectedItem().toString();
        cidade = cbcidades.getSelectedItem().toString();
        
        txtarea.append("Estado escolhido: " + uf + "\nCidade Escolhida: " + cidade);
        
    }//GEN-LAST:event_btnokActionPerformed

    private void cbestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbestadoActionPerformed
        // ComboBox Estado
        if (cbestado.getSelectedIndex() == 1){
        
            cbcidades.removeAllItems();
            //Adicionar cidades do estado de SP
            cbcidades.addItem("São Roque");
            cbcidades.addItem("Marília");
            cbcidades.addItem("Sorocaba");
        }
        
        else if (cbestado.getSelectedIndex() == 2){
        
            cbcidades.removeAllItems();
            //Adicionar cidades do estado de MG
            cbcidades.addItem("Belo Horizonte");
            cbcidades.addItem("Ouro Preto");
        }
        
        else if (cbestado.getSelectedIndex() == 3){
        
            cbcidades.removeAllItems();
            //Adicionar cidades do estado de RJ
            cbcidades.addItem("Niterói");
            cbcidades.addItem("Cabo Frio");
        }

        else if (cbestado.getSelectedIndex() == 4){
        
            cbcidades.removeAllItems();
            //Adicionar cidades do estado de MT
            cbcidades.addItem("Cuiabá");
            cbcidades.addItem("Várzea Grande");
        }
        
        
    }//GEN-LAST:event_cbestadoActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frmcombobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmcombobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmcombobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmcombobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmcombobox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnok;
    private javax.swing.JComboBox<String> cbcidades;
    private javax.swing.JComboBox<String> cbestado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblexemplocombobox;
    private javax.swing.JLabel lblresposta;
    private javax.swing.JLabel lblresposta1;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}
