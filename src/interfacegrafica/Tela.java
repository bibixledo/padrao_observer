package interfacegrafica;

import padrao_observer.CentralAudiencia;
import padrao_observer.DadosDaAudiencia;
import padrao_observer.CentralGlobo;
import padrao_observer.CentralSbt;
import padrao_observer.CentralRecord;

public class Tela extends javax.swing.JFrame {
    CentralAudiencia  centralAudiencia = new  CentralAudiencia();
    CentralGlobo centralGlobo = new CentralGlobo(centralAudiencia );
    CentralSbt centraSbt = new CentralSbt( centralAudiencia );
    CentralRecord centrlaRecord = new CentralRecord( centralAudiencia );
    
    
    public void mostrarElementos(){
        
    }

    public Tela() { initComponents(); }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_globo = new javax.swing.JLabel();
        label_sbt = new javax.swing.JLabel();
        label_record = new javax.swing.JLabel();
        text_globo = new javax.swing.JTextField();
        text_sbt = new javax.swing.JTextField();
        text_record = new javax.swing.JTextField();
        botao_atualizar = new javax.swing.JButton();
        label_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_globo.setForeground(new java.awt.Color(0, 0, 153));
        label_globo.setText("GLOBO");

        label_sbt.setForeground(new java.awt.Color(0, 0, 153));
        label_sbt.setText("SBT");

        label_record.setForeground(new java.awt.Color(0, 0, 153));
        label_record.setText("RECORD");

        botao_atualizar.setForeground(new java.awt.Color(0, 0, 153));
        botao_atualizar.setText("ATUALIZAR");
        botao_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_atualizarActionPerformed(evt);
            }
        });

        label_titulo.setForeground(new java.awt.Color(0, 0, 153));
        label_titulo.setText("INSIRA A AUDIÊNCIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(label_titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botao_atualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_globo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_record)
                                    .addComponent(label_sbt))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(text_globo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(text_record, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(text_sbt, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(label_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_globo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_globo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_sbt)
                    .addComponent(text_sbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_record)
                    .addComponent(text_record, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botao_atualizar)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_atualizarActionPerformed
        int globo = Integer.parseInt(text_globo.getText() );
        int sbt = Integer.parseInt(text_sbt.getText() );
        int record = Integer.parseInt(text_record.getText() );
        DadosDaAudiencia dados = new DadosDaAudiencia(globo, sbt, record);
        centralAudiencia.setDados(dados);      
        
    }//GEN-LAST:event_botao_atualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_atualizar;
    private javax.swing.JLabel label_globo;
    private javax.swing.JLabel label_record;
    private javax.swing.JLabel label_sbt;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTextField text_globo;
    private javax.swing.JTextField text_record;
    private javax.swing.JTextField text_sbt;
    // End of variables declaration//GEN-END:variables
}
