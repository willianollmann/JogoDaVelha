/* MAPA PROGRAMAÇÃO II
ALUNO: WILLIAN HENRIQUE OLLMANN
RA: 1758515-5
*/

package jogodavelha;

import java.awt.Color;

/**
 *
 * @author Willian Ollmann
 */

public class JogoDaVelha extends javax.swing.JFrame {
    
    boolean Jogador1Ativo = true;
    boolean Jogador2Ativo = false;
   
    public JogoDaVelha() {
        initComponents();
        displayInfo.setText("VEZ DO JOGADOR 1");
    }
    
    public void JogadorAtivo(){     
        displayInfo.setText("VEZ DO JOGADOR 2");
        
        if (Jogador1Ativo == true){
            Jogador1Ativo = false;
            Jogador2Ativo = true;
            
        } else {
            Jogador1Ativo = true;
            Jogador2Ativo = false;
            displayInfo.setText("VEZ DO JOGADOR 1");    
        }
        
        JogVencedor("X");
        JogVencedor("O");    
    }
    
public void JogVencedor(String Jog) {
    if (t1.getText().equals(Jog) && t2.getText().equals(Jog) &&
        t3.getText().equals(Jog)) {
        
        if (t1.getText().equals("X"))
            Vencedor("JOGADOR 1");
        else
            Vencedor("JOGADOR 2");
        
        t1.setBackground(Color.GRAY);
        t2.setBackground(Color.GRAY);
        t3.setBackground(Color.GRAY);
    }        
    
    if (t4.getText().equals(Jog) && t5.getText().equals(Jog) &&
        t6.getText().equals(Jog)) {
        
        if (t4.getText().equals("X"))
            Vencedor("JOGADOR 1");
        else
            Vencedor("JOGADOR 2");
        
        t4.setBackground(Color.GRAY);
        t5.setBackground(Color.GRAY);
        t6.setBackground(Color.GRAY);
    }        
    
    if (t7.getText().equals(Jog) && t8.getText().equals(Jog) &&
        t9.getText().equals(Jog)) {
        
        if (t7.getText().equals("X"))
            Vencedor("JOGADOR 1");
        else
            Vencedor("JOGADOR 2");
        
        t7.setBackground(Color.GRAY);
        t8.setBackground(Color.GRAY);
        t9.setBackground(Color.GRAY);
    }      
    
    if (t1.getText().equals(Jog) && t4.getText().equals(Jog) &&
        t7.getText().equals(Jog)) {
        
        if (t1.getText().equals("X"))
            Vencedor("JOGADOR 1");
        else
            Vencedor("JOGADOR 2");
        
        t1.setBackground(Color.GRAY);
        t4.setBackground(Color.GRAY);
        t7.setBackground(Color.GRAY);
    }    
    
    if (t2.getText().equals(Jog) && t5.getText().equals(Jog) &&
        t8.getText().equals(Jog)) {
        
        if (t2.getText().equals("X"))
            Vencedor("JOGADOR 1");
        else
            Vencedor("JOGADOR 2");
        
        t2.setBackground(Color.GRAY);
        t5.setBackground(Color.GRAY);
        t8.setBackground(Color.GRAY);
    }
    
    if (t3.getText().equals(Jog) && t6.getText().equals(Jog) &&
        t9.getText().equals(Jog)) {
        
        if (t3.getText().equals("X"))
            Vencedor("JOGADOR 1");
        else
            Vencedor("JOGADOR 2");
        
        t3.setBackground(Color.GRAY);
        t6.setBackground(Color.GRAY);
        t9.setBackground(Color.GRAY);
    } 
    
    if (t1.getText().equals(Jog) && t5.getText().equals(Jog) &&
        t9.getText().equals(Jog)) {
        
        if (t1.getText().equals("X"))
            Vencedor("JOGADOR 1");
        else
            Vencedor("JOGADOR 2");
        
        t1.setBackground(Color.GRAY);
        t5.setBackground(Color.GRAY);
        t9.setBackground(Color.GRAY);
    }
    
    if (t3.getText().equals(Jog) && t5.getText().equals(Jog) &&
        t7.getText().equals(Jog)) {
        
        if (t3.getText().equals("X"))
            Vencedor("JOGADOR 1");
        else
            Vencedor("JOGADOR 2");
        
        t3.setBackground(Color.GRAY);
        t5.setBackground(Color.GRAY);
        t7.setBackground(Color.GRAY);
    }    
    
    else if (!t1.getText().equals("") && !t2.getText().equals("") &&
             !t3.getText().equals("") && !t4.getText().equals("") &&
             !t5.getText().equals("") && !t6.getText().equals("") &&
             !t7.getText().equals("") && !t8.getText().equals("") &&
             !t9.getText().equals("")){         
                      
            Vencedor("EMPATE");
    }
 
}
    
public void Vencedor(String JogVencedor) {
    
    if (JogVencedor.equals("JOGADOR 1")) {
        displayInfo.setText("PARABÉNS, JOGADOR 1 VENCEU!!!");
    }
    if (JogVencedor.equals("JOGADOR 2")) {
        displayInfo.setText("PARABÉNS, JOGADOR 2 VENCEU!!!");
    }
   
    if (JogVencedor.equals("EMPATE")) {
        displayInfo.setText("JOGO EMPATADO!!!");
    }   
        
}

public void LimparDados() {
    t1.setText(""); t2.setText(""); t3.setText(""); t4.setText(""); t5.setText("");
    t6.setText(""); t7.setText(""); t8.setText(""); t9.setText("");
    
    t1.setBackground(Color.lightGray); t2.setBackground(Color.lightGray);
    t3.setBackground(Color.lightGray); t4.setBackground(Color.lightGray);
    t5.setBackground(Color.lightGray); t6.setBackground(Color.lightGray);
    t7.setBackground(Color.lightGray); t8.setBackground(Color.lightGray);
    t9.setBackground(Color.lightGray);
    
    displayInfo.setText("VEZ DO JOGADOR 1");
    
    Jogador1Ativo = true;
    Jogador2Ativo = false;
    
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        t3 = new javax.swing.JButton();
        t1 = new javax.swing.JButton();
        t2 = new javax.swing.JButton();
        t4 = new javax.swing.JButton();
        t5 = new javax.swing.JButton();
        t6 = new javax.swing.JButton();
        t7 = new javax.swing.JButton();
        t8 = new javax.swing.JButton();
        t9 = new javax.swing.JButton();
        novoJg = new javax.swing.JButton();
        displayInfo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        t3.setBackground(new java.awt.Color(204, 204, 204));
        t3.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        t1.setBackground(new java.awt.Color(204, 204, 204));
        t1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        t2.setBackground(new java.awt.Color(204, 204, 204));
        t2.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t4.setBackground(new java.awt.Color(204, 204, 204));
        t4.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });

        t5.setBackground(new java.awt.Color(204, 204, 204));
        t5.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });

        t6.setBackground(new java.awt.Color(204, 204, 204));
        t6.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });

        t7.setBackground(new java.awt.Color(204, 204, 204));
        t7.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });

        t8.setBackground(new java.awt.Color(204, 204, 204));
        t8.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });

        t9.setBackground(new java.awt.Color(204, 204, 204));
        t9.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });

        novoJg.setBackground(new java.awt.Color(102, 102, 102));
        novoJg.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        novoJg.setText("NOVO JOGO");
        novoJg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoJgActionPerformed(evt);
            }
        });

        displayInfo.setBackground(new java.awt.Color(255, 255, 255));
        displayInfo.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        displayInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        displayInfo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        displayInfo.setOpaque(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Informações do Jogo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 16))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel2.setText("Jogador 1           Símbolo: X");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel3.setText("Jogador 2           Símbolo: O");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(novoJg, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(displayInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(displayInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(novoJg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        if (Jogador1Ativo == true){
            if (t1.getText().equals("")){
                t1.setText("X");
                JogadorAtivo();
            }
        } else {
            if (t1.getText().equals("")) {
                t1.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        if (Jogador1Ativo == true){
            if (t2.getText().equals("")){
                t2.setText("X");
                JogadorAtivo();
            }
        } else {
            if (t2.getText().equals("")) {
                t2.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        if (Jogador1Ativo == true){
            if (t3.getText().equals("")){
                t3.setText("X");
                JogadorAtivo();
            }
        } else {
            if (t3.getText().equals("")) {
                t3.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_t3ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        if (Jogador1Ativo == true){
            if (t4.getText().equals("")){
                t4.setText("X");
                JogadorAtivo();
            }
        } else {
            if (t4.getText().equals("")) {
                t4.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_t4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        if (Jogador1Ativo == true){
            if (t5.getText().equals("")){
                t5.setText("X");
                JogadorAtivo();
            }
        } else {
            if (t5.getText().equals("")) {
                t5.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_t5ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        if (Jogador1Ativo == true){
            if (t6.getText().equals("")){
                t6.setText("X");
                JogadorAtivo();
            }
        } else {
            if (t6.getText().equals("")) {
                t6.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_t6ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        if (Jogador1Ativo == true){
            if (t7.getText().equals("")){
                t7.setText("X");
                JogadorAtivo();
            }
        } else {
            if (t7.getText().equals("")) {
                t7.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_t7ActionPerformed

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        if (Jogador1Ativo == true){
            if (t8.getText().equals("")){
                t8.setText("X");
                JogadorAtivo();
            }
        } else {
            if (t8.getText().equals("")) {
                t8.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_t8ActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        if (Jogador1Ativo == true){
            if (t9.getText().equals("")){
                t9.setText("X");
                JogadorAtivo();
            }
        } else {
            if (t9.getText().equals("")) {
                t9.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_t9ActionPerformed

    private void novoJgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoJgActionPerformed
        LimparDados();
    }//GEN-LAST:event_novoJgActionPerformed
    
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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel displayInfo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton novoJg;
    private javax.swing.JButton t1;
    private javax.swing.JButton t2;
    private javax.swing.JButton t3;
    private javax.swing.JButton t4;
    private javax.swing.JButton t5;
    private javax.swing.JButton t6;
    private javax.swing.JButton t7;
    private javax.swing.JButton t8;
    private javax.swing.JButton t9;
    // End of variables declaration//GEN-END:variables
}
